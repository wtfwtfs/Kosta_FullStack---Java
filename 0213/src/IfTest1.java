public class IfTest1 {
	
	public static void main(String [] args) {
		
		int kor=90, eng =85, math = 98;
		int tot = kor+eng+math;
		double avg = tot/3.0;
		String grade;
		
		if(avg>=90) {
			grade="A";
			if(avg>=98) {
				grade += "+";
			}else if (avg>=94) {
				grade += "0";
			}else {
				grade += "-";
			}
		}else if(avg>=80){
			grade="B";
			if(avg>=88) {
				grade += "+";
			}else if (avg>=84) {
				grade += "0";
			}else {
				grade += "-";
			}
		}else if(avg>=70){
			grade="C";
			if(avg>=78) {
				grade += "+";
			}else if (avg>=74) {
				grade += "0";
			}else {
				grade += "-";
			}
		}else if(avg>=60) {
			grade="D";
			if(avg>=68) {
				grade += "+";
			}else if (avg>=64) {
				grade += "0";
			}else {
				grade += "-";
			}
		}else {
			grade="F";
		}
		
		System.out.println(String.format("총점:%d, 평균:%.2f, 학점:%s", tot,avg,grade));
	}

}