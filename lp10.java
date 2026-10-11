import java.util.*;
public class lp10 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a[]={10,20,30,40,50};
        System.out.println("Enter index:");
        int index=sc.nextInt();
        try{
            System.out.println("Element="+a[index]);

        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid array index, "+e.getMessage());
        }
        System.out.println("Program continues");

    }
    
}
