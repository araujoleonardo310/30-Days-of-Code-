package animal;

public class Dog extends Animal {

    public Dog() {
        super(10);
        System.out.println("A dog has been created.");
    }

    public void ruff() {
        System.out.println("The dog says ruff!");
    }

    public void run() {
        System.out.println("A dog is running.");
    }
    
    public void sleep() {
        System.out.println("A dog is sleeping.");
    }

    @Override
    public void eat() {
        System.out.println("A dog is eating");
    }

}
