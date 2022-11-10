interface calculator{
    public void addition();
    public void subtraction();
}
interface calci{
    public void multiplication();
}

class f_i_calculator implements calculator,calci{
    public void addition(){
        System.out.println("Addition");
    }
    public void subtraction(){
        System.out.println("Subtraction");
    }
    public void multiplication(){
        System.out.println("Multiplication");
    }
}
public class _8_interface{
    public static void main(String[] args) {
        f_i_calculator obj = new f_i_calculator();
        obj.addition();
    }
}