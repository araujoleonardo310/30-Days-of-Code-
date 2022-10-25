package animal;

public abstract class Animal {

    public int age;

    public Animal(int age) {
        this.age = age;
        System.out.println("An animal has been created.");
    }

    public abstract void eat();
    
    public void sleep() {
        System.out.println("A animal is sleeping.");
    }

    public static void main(String[] args) {
        
        Dog d = new Dog();
        Cat c = new Cat();
        c.eat();
        d.eat();
        d.sleep();
        c.sleep();
        
        // Casting 
        Object dog = new Dog();
        Dog realDog = (Dog) dog;
        realDog.ruff();
        
        
        Object str = "est";
        String realS = (String) str;
        
        Dog doggy = new Dog();
        if (doggy instanceof Animal) {
            Animal a = (Animal) doggy;
            a.sleep();
        }
        
        doggy.sleep();
    }

}
