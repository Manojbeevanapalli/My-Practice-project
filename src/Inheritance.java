// Parent class (superclass)
class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Child class (subclass) inheriting from Animal
class Dog extends Animal {
    public Dog(String name) {
        super(name); // Call the superclass constructor
    }

    // Additional method specific to Dog class
    public void bark() {
        System.out.println(name + " is barking.");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // Create a Dog object
        Dog dog = new Dog("Buddy");

        // Call methods inherited from Animal class
        dog.eat();   // Inherited from Animal
        dog.sleep(); // Inherited from Animal

        // Call method specific to Dog class
        dog.bark();  // Specific to Dog

        // Accessing the 'name' field inherited from Animal class
        System.out.println("Name of the dog: " + dog.name);
    }
}

