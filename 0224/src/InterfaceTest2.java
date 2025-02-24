interface IClick{
	void click();
}

interface IDoubleClick{
	void doubleClick();
}

class Button{
	IClick iclick;
	IDoubleClick idoubleClick;
	
	void addClickListener(IClick iClick) {
		this.iclick=iClick;
	}
	
	void addDoubleClickListner(IDoubleClick idoubleClick) {
		this.idoubleClick = idoubleClick;
	}
	
	void onclick() {
		System.out.println("쏙 들어갔따 나옴");
		if(iclick!=null) {
			iclick.click();
		} 
	}
	
	void onDoubleClick() {
		if(idoubleClick!=null) {
			idoubleClick.doubleClick();
		}
	}
}

//class LoginClick implements IClick{
//	@Override
//	public void click() {
//		System.out.println("로그인 처리");
//	}
//}

public class InterfaceTest2 {

	public static void main(String[] args) {

		Button join = new Button(); // 변수 시작 소문자로 해라
		IClick cj =new IClick() {
			@Override
			public void click() {
				System.out.println("회원가입 처리");
			}
		};
		join.addClickListener(cj);
		join.onclick();
		
		Button login = new Button();
		
		IClick c = new IClick() {
			@Override
			public void click() {
				System.out.println("로그인 처리");	
			}
		};
		
		login.addClickListener(c);
		login.onclick();
		
		Button menu = new Button();
		menu.addDoubleClickListner(new IDoubleClick() {
			@Override
			public void doubleClick() {
				System.out.println("컨텍스트 메뉴");
			}
		});
		
		menu.onDoubleClick();
		
		Button login2 = new Button() {
			@Override
			void onclick() {
				super.onclick();
				System.out.println("로그인 처리");
			}
		};
		login2.onclick();
		
		Button join2 = new Button() {
			@Override
			void onclick() {
				super.onclick();
				System.out.println("회원가입 처리");
			}
		};
		
		join2.onclick();
		
		
		System.out.println();
///////////////////////////////////////////////////////////////////////////////
		
		join.addClickListener(new IClick() {
			@Override
			public void click() {
				System.out.println("회원가입 처리");//이너클래스(내부클래스)		
			}
		});
		join.onclick();
		
		login.addClickListener(new IClick() {
			@Override
			public void click() {
				System.out.println("로그인 처리"); //이너클래스(내부클래스) 한번 쓰고 말거 
			}
		});
		login.onclick();
		

		
//		JoinButton join = new JoinButton();
//		join.onclick();
//		
//		LoginButton login = new LoginButton();
//		login.onclick();
	}

}

//class LoginButton extends Button{
//	@Override
//	void onclick() {
//		super.onclick();
//		System.out.println("로그인 처리");
//	}
//}
//
//class JoinButton extends Button{
//	@Override
//	void onclick() {
//		super.onclick();
//		System.out.println("회원가입 처리");
//	}
//}


