package course.test.example;

public class AnonymousArrays {

	public static void main(String[] args) {
		
		// normal array
		// Normal arrays are declared with a variable name, which allows you to reference and modify the array throughout your program.
		// They are used when you need to store data that will be used multiple times and accessed from different parts of your code.
		int array[] = new int[]{1,2,3,4,5}; 
		
		for(int a:array) {
			System.out.println(a);
		}
		
		// Creating and initializing an anonymous integer array
		// Anonymous arrays are created without explicitly declaring a variable name.
		// They are typically used for short-lived, one-time operations when you don't need to reference the array again.
		// They are declared and instantiated in a single line.
		int[] AnonymousArray = new int[]{1,2,3,4,5}; 
		
		for(int a:AnonymousArray) {
			System.out.println(a);
		}

	}

}
