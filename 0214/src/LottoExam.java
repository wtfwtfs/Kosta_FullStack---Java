public class LottoExam {

    public static void main(String[] args) {
        int[] ball = new int[45];
        // 1부터 45까지의 번호를 배열에 저장
        for (int i = 0; i < ball.length; i++) {
            ball[i] = i + 1;
        }
        
        int t = 0;
        int temp = 0;
        for (int i = 0; i < 1000; i++) {
            // 두 개의 랜덤한 인덱스를 선택하여 교환
            int randomIndex = (int)(Math.random() * 45);
            t = (int)(Math.random() * 45);
            
            // 두 인덱스의 값을 교환
            temp = ball[randomIndex];
            ball[randomIndex] = ball[t];
            ball[t] = temp;
        }

        // 섞은 배열에서 첫 6개 숫자 출력
        for (int i = 0; i < 6; i++) {
            System.out.print(ball[i] + " ");
        }
    }
}
