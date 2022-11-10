class class1{
    public void multiply(int a, int b){
        System.out.println(a*b);
    }
    public void multiply(int a,int b,int c){
        System.out.println(a*b*c);
    }
}
public class _9_Compile_Poly {
    public static void main(String[] args) {
        class1 c1 = new class1();
        c1.multiply(4, 4);
        c1.multiply(5, 5, 5);
    }
}
