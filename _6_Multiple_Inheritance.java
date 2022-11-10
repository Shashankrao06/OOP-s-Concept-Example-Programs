class class1{
    public void m1(){
        System.out.println("This is from the class 1");
    }
}

class class2{
    public void m2(){
        System.out.println("This is from the class 2");
    }
}

class class3 extends class1{
    public void m3(){
        System.out.println("This is from the class 3");
    }
}
public class _6_Multiple_Inheritance {
    public static void main(String[] args) {
        class3 obj1 = new class3();
    }
}
