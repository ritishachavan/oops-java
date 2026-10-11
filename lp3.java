import java.util.*;
class Vehicle {
    String brand,model;
    Vehicle(String brand,String model){
        this.brand=brand;
        this.model=model;
    }
    
}
class Car extends Vehicle{
    int doors;
    Car(String brand, String model, int doors){
        super(brand,model);
        this.doors=doors;

    }
    void display(){
        System.out.println("Car details:");
        System.out.println("Brand"+brand);
        System.out.println("model"+model);
        System.out.println("doors"+doors);
    }
}
class Bike extends Vehicle{
    int speed;
    Bike(String brand, String model, int speed){
        super(brand, model);
        this.speed=speed;
    }
    void display(){
        System.out.println("Biek details:");
        System.out.println("Brand"+brand);
        System.out.println("model"+model);
        System.out.println("speed"+speed);
    }
}
public class lp3{
    public static void main(String args[]){
        Car c=new Car("maruti","swift",4);
        c.display();
        Bike b=new Bike("enfield","hunter",120);
        b.display();
    }
}
