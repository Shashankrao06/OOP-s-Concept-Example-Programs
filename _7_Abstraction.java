abstract class half_implemented_Calculator{
    public void addtion(){
        System.out.println("Addition");
    }
    public void Subtraction(){
        System.out.println("Subtraction");
    }
    public void Multiplication(){
        System.out.println("Multiplication");
    }
    public abstract void Division();
}

class complete_calculator extends half_implemented_Calculator{
    public void Division(){
        System.out.println("Division");
    }
}

public class _7_Abstraction {
    public static void main(String[] args) {
        complete_calculator obj1 = new complete_calculator();
        obj1.addtion();
        obj1.Subtraction();
        obj1.Multiplication();
        obj1.Division();
            
    }
}

