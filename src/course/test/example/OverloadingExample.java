package course.test.example;

public class OverloadingExample {
    
    // Overloaded methods with different parameter lists
    
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public String add(String a, String b) {
        return a + b;
    }

    // Overloaded method with a different parameter type
    
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        OverloadingExample example = new OverloadingExample();

        System.out.println("Sum of two integers: " + example.add(5, 7));
        System.out.println("Sum of two doubles: " + example.add(3.5, 4.2));
        System.out.println("Concatenation of two strings: " + example.add("Hello, ", "World!"));
        System.out.println("Sum of three integers: " + example.add(1, 2, 3));
    }
}
