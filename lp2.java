import java.util.*;
class Vehicle {
    String brand;
    Vehicle(String brand){
        this.brand=brand;

    }
    
}
class Car extends Vehicle{
    String model;
    Car(String brand,String model){
        super(brand);
        this.model=model;
    }
}
class ECar extends Car{
    int batteryCapacity;
    ECar(String brand, String model, int batteryCapacity){
        super(brand,model);
        this.batteryCapacity=batteryCapacity;
    }
    void display(){
        System.out.println("ECar details:");
        System.out.println("Brand="+brand);
        System.out.println("Model="+model);
        System.out.println("Battery Cpacity="+batteryCapacity);
    }
}
public class lp2{
    public static void main(String args[]){
        ECar e=new ECar("tata","nexon ev",160);
        e.display();
    }}
