
package animal;

public class Cat extends Animal {

    public Cat() {
        super(5);
        System.out.println("A cat has been created.");
    }
    
    
    public void sleep() {
        System.out.println("A cat is sleeping.");
    }

    public void meow() {
        System.out.println("A cat meows.");
    }

    public void prace() {
        System.out.println("A cat is prancing.");
    }
    
    public int getAge() {
        return this.age;
    }
    
    @Override
    public void eat() {
        System.out.println("A dog is eating");
    }
}
