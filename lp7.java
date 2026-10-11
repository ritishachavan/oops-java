interface VehicleInterface {
    public void left();
    public void right();
    public void accelerate();
    public void slow();
    
}
class CarClass implements VehicleInterface{
    public void left(){
        System.out.println("Left");
    }
    public void right(){
        System.out.println("right");
    }
    public void accelerate(){
        System.out.println("speed");
    }
    public void slow(){
        System.out.println("brake");
    }
}
public class lp7{
    public static void main(String args[]){
        CarClass c=new CarClass();
        c.left();
        c.accelerate();
    }
}
