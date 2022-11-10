class class1{
    public void print(){
        System.out.println("Method from class 1");
    }
}

class class2 extends class1{
    public void print(){
        System.out.println("Method from class 2");
    }
}

class class3 extends class1{
    public void print(){
        System.out.println("Method from class 3");
    }
}


public class _10_runtime_poly {
    public static void main(String[] args) {
        class1 obj = new class2();
        obj.print();
    }
}
