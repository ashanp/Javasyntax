package course.test.staticvariable;

public class StaticVariable {

	public static void main(String[] args) {
		System.out.println(SecondCalss.test_nonstatic);
		
		SecondCalss.test_nonstatic = "dd";
		
		System.out.println(SecondCalss.getTest());

	}

}
