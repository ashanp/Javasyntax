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

interface IprintInterface{
	void print(String x);
}
