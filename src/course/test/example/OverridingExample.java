package course.test.example;

class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    // Method overriding
    @Override
    void makeSound() {
        System.out.println("The dog barks");
    }
}

class Cat extends Animal {
    // Method overriding
    @Override
    void makeSound() {
        System.out.println("The cat meows");
    }
}

public class OverridingExample {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();

        animal.makeSound(); // Calls the makeSound method in Animal class
        dog.makeSound();    // Calls the makeSound method in Dog class
        cat.makeSound();    // Calls the makeSound method in Cat class
    }
}

