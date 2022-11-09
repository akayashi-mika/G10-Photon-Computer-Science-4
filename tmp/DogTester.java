package tmp;

// TESTER class
public class DogTester {
    public static void main(String[] args) {
        Dog dog1    =   new Dog();
        dog1.name   =   "Caleb";
        dog1.color  =   "Blue";
        dog1.age    =   15;

        System.out.println("Name: " + dog1.name + "\nColor: " + dog1.color + "\nAge: " + dog1.age);
    }
}

// REAL class
class Dog {
    public String name; // the name of the dog
    public String color; // color of the dog
    public int age; // age of the dog
   
    Dog() {}
   
    public void bark() { //method for the dog
        System.out.println("Ruff! Ruff!");
    }
}
