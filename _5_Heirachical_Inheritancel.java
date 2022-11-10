class class1{
    public void m1(){
        System.out.println("This is from class 1");
    }
}

class class2 extends class1{
    public void m2(){
        System.out.println("This is from class 2");
    }
}

class class3 extends class1{
    public void m3(){
        System.out.println("This is form class 3");
    }
}
public class _5_Heirachical_Inheritancel {
    public static void main(String[] args) {
        class2 obj1 = new class2();
        obj1.m1();

        class3 obj2 = new class3();
        obj2.m1();
    }
}
