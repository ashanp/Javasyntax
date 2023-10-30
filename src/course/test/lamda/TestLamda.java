package course.test.lamda;

public class TestLamda {
	
	
	public static void main(String[] args) {
	
		IprintInterface i = (String x) -> {
			System.out.println("Hello World:"+x);
			System.out.print("Hello World1:"+x);
		};
		
		i.print("Hirun");

	}
	
	
}


/*
 * This interface is ment to be used as part of above lamda expression
 * If I change this by adding another abstract method, the above lamda failes.
 * Therefore, to ensure that this interface is not modified by anyother developer, we add the annotation @FunctionalInterface.
 * It is only for operational purposes. Its not used for any compilation of code. Only to show error in the interface method itself.
 */
@FunctionalInterface
interface IprintInterface{
	void print(String x);
}
