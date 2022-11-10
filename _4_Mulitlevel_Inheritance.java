class Firstclass{
    public void m1(){
        System.out.println("This is from class 1");
    }
}

class Secondclass extends Firstclass{
    public void m2(){
        System.out.println("This is from class 2");
    }
}

class Third extends Secondclass{
    public void m3(){
        System.out.println("This is form class 3");
    }
}
public class _4_Mulitlevel_Inheritance{
    public static void main(String[] args) {
        Third obj1 = new Third();
        obj1.m1();
        obj1.m2();
        obj1.m3();
    }
}