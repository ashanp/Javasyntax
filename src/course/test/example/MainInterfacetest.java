package course.test.example;

/*
 * Interfaces are often used to define contracts that classes must adhere to. 
 * They are suitable for scenarios where you want to ensure that different classes provide specific methods. 
 * They are also used for achieving polymorphism and multiple inheritance of type.
 */

interface Iemployee{	
	String getOfficeTransport();
	String getTransportTime();	
}
//Interfaces cannot have constructors because they cannot be instantiated directly
//An interface can only declare method signatures (methods without implementations). All methods in an interface are implicitly abstract and public. The implementing classes must provide concrete implementations for all the methods defined in the interface.
//Fields declared in an interface are implicitly public, static, and final. They are constants and cannot be instance-specific.
//Starting with Java 8, interfaces can include default methods and static methods with implementations. This allows interfaces to have some degree of code sharing.

class NormalEmployee implements Iemployee{

	@Override
	public String getOfficeTransport() {
		return "office bus";
	}

	@Override
	public String getTransportTime() {
		return "8:00 am";
	}	
}
//A class can implement multiple interfaces. This allows for multiple inheritance of type in Java, where a class can inherit behavior from multiple sources by implementing multiple interfaces

class SpecialneedsEmployee implements Iemployee{

	@Override
	public String getOfficeTransport() {
		return "Special office bus";
	}

	@Override
	public String getTransportTime() {
		return "9:00 am";
	}	
}


public class MainInterfacetest {

	public static void main(String[] args) {
		Iemployee normalEmployee = new NormalEmployee();
		//Interfaces are often used to define contracts that classes must adhere to. 
		//They are suitable for scenarios where you want to ensure that different classes provide specific methods. 
		//They are also used for achieving polymorphism and multiple inheritance of type.
		String data = normalEmployee.getOfficeTransport();
		System.out.println(data);
		
		Iemployee specialneedsEmployee = new SpecialneedsEmployee();
		String data_sp = specialneedsEmployee.getOfficeTransport();
		System.out.println(data_sp);
	}
}
