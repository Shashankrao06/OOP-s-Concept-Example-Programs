//Demo
class Animal{
    int number;
    public void eat(){
        System.out.println("I can eat");
    }
}
class Dog extends Animal{
    public void bark(){
        System.out.println("Bow Bow");
    }
}
public class _3_Inheritance {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.eat(); 
    }
}
