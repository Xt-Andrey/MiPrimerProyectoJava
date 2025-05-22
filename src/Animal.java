public class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound.");
    }
}


public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark!");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        Dog myDog = new Dog();
        genericAnimal.makeSound();
        myDog.makeSound();
    }
}