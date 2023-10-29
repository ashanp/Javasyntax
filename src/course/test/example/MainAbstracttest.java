package course.test.example;

/*
 * Usage: Abstract classes are used when you want to provide a common base for a group of related classes. 
 * You may have some methods with common implementations and others that should be left to concrete subclasses. 
 * Abstract classes are helpful for code reuse within a class hierarchy.
*/
abstract class Aemployee{
	public abstract String getOfficeTransport();
	public String getTransportTime() {
		return "8:00 am";
	}
}
//An abstract class can have both abstract (methods without implementations) and concrete methods (methods with implementations).Subclasses of an abstract class are not required to provide implementations for all abstract methods; they can choose which ones to implement.
//Java supports single inheritance for classes, meaning a class can extend only one abstract class. However, it can still implement multiple interfaces.
//Abstract classes can have instance variables (fields) with various access modifiers, allowing for non-constant fields.

class Employee extends Aemployee{

	@Override
	public String getOfficeTransport() {
		return "office bus";
	}
}

public class MainAbstracttest {
	public static void main(String[] args) {
	
		Aemployee aemployee = new Employee();
		
		String data = aemployee.getOfficeTransport();
		System.out.println(data);
		
		String data_t = aemployee.getTransportTime();
		System.out.println(data_t);
		
		
	}
}