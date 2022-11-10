class Lamp{

    String light = "OFF"; //variable

    public void turnOn(){ //method
        light = "ON";
    }

    public void status(){ //method
        System.out.println("The light is:"+ light);
    }
}

public class _1_Lamp_program{
    public static void main(String[] args) {
        Lamp lamp = new Lamp(); //object
        lamp.turnOn(); 
        lamp.status();
    }
}