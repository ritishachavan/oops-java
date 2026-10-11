interface Stack {
    public void push(int p);
    public int pop();
    
}
class CreateStack implements Stack{
    int mystack[];
    int top;
    CreateStack(int size){
        mystack=new int[size];
        top=-1;
    }
    public void push(int p){
        mystack[++top]=p;
    }
    public int pop(){
        return(mystack[top--]);
    }
}
public class lp8{
    public static void main(String args[]){
        CreateStack cs1=new CreateStack(5);
        CreateStack cs2=new CreateStack(8);
        for(int i=0;i<5;i++){
            cs1.push(i);
        }
         for(int i=0;i<8;i++){
            cs2.push(i);
        }
        System.out.println("Mystack 1=");
         for(int i=0;i<5;i++){
            System.out.println(cs1.pop());
        }
        System.out.println("mystack 2=");
         for(int i=0;i<8;i++){
            System.out.println(cs2.pop());
        }
    }
}