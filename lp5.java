abstract class Employee {
    String name;
    Employee(String name){
        this.name=name;
    }
    abstract void work();
    void display(){
        System.out.println("Name:"+name);
    }
    
}
class Developer extends Employee{
    Developer(String name){
        super(name);
    }
    @Override 
    void work(){
        System.out.println("Developer writes java code");
    }

}
class Manager extends Employee{
    Manager(String name){
        super(name);
    }
    @Override 
    void work(){
        System.out.println("Manager manages java code");
    }

}
public class lp5{
    public static void main(String args[]){
        Developer d=new Developer("Raj");
        d.display();
        d.work();
        Manager m=new Manager("Rajesh");
        m.display();
        m.work();
    }
}
