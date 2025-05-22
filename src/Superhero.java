
public class Superhero {
  
    String name;
    String power;
    int strengthLevel;

    public Superhero(String name, String power, int strengthLevel) {
        this.name = name;
        this.power = power;
        this.strengthLevel = strengthLevel;
    }

    public void displayInfo() {
        System.out.println("Superhero: " + name);
        System.out.println("Power: " + power);
        System.out.println("Strength Level: " + strengthLevel);
    }

    public void increaseStrength(int increment) {
        this.strengthLevel += increment;
        System.out.println(name + " has increased strength by " + increment);
    }
}

public class Main {
    public static void main(String[] args) {
        
        Superhero hero1 = new Superhero("IronMan", "Technology Suit", 90);
        Superhero hero2 = new Superhero("Hulk", "Super Strength", 100);

        hero1.displayInfo();
        hero2.displayInfo();

        hero1.increaseStrength(10);
        hero2.increaseStrength(20);
    }
}
