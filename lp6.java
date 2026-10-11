abstract class Laptop {
    String brand;
    int ram;
    Laptop(String brand,int ram){
        this.brand=brand;
        this.ram=ram;
    }
    abstract void use();
    void displaydetails(){
        System.out.println("Brand:"+brand);
        System.out.println("Ram:"+ram);
    }
    
}
class GamingLaptop extends Laptop{
    String graphicsCard;
    GamingLaptop(String brand, int ram, String graphicsCard){
        super(brand,ram);
        this.graphicsCard=graphicsCard;
    }
    @Override 
    void use(){
        System.out.println("Used for gaming.");
    }
    void displayGamingLaptop(){
        displaydetails();
        System.out.println("Graphics card:"+graphicsCard);
    }
}
class BusinessLaptop extends Laptop{
    String securityFeature;
    BusinessLaptop(String brand, int ram, String securityFeature){
        super(brand,ram);
        this.securityFeature=securityFeature;
    }
    @Override 
    void use(){
        System.out.println("Used for business and office");
    }
    void displayBusinessLaptop(){
        displaydetails();
        System.out.println("SEcurity feature:"+securityFeature);
    }
}
public class lp6{
    public static void main(String args[]){
        BusinessLaptop b=new BusinessLaptop( "hp", 64, "fingerprint scanner");
        b.use();
        b.displayBusinessLaptop();
        GamingLaptop g=new GamingLaptop("ASUS",32, "6040");
        g.use();
        g.displayGamingLaptop();
    }
}