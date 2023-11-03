package course.test.example;

public class InheritanceClass extends extendclass1 {

	public static String age="10";
	
	public static void main(String[] args) {
		InheritanceClass inheritanceClass = new InheritanceClass();
		inheritanceClass.main1();
	}
	
	
	public void main1() {
		System.out.println((super.age));
	}
	

}

class extendclass1 extends extendclass2{
	
	public String age = "20";

}


class extendclass2{
	public String age="30";
}
