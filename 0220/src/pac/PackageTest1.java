package pac;

public class PackageTest1 {

	public static void main(String[] args) {
		//pac.Student s = new pac.Student();
		
		Student s = new Student("100", "design");
		s.setMajor("computer");
		System.out.println(s.getMajor());
		
		
	}

}
