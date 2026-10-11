import java.util.*;
class Student{
    String usn;
    String name;
    int sem;
    void displaydetails(){
        System.out.println("Student details:");
        System.out.println("Name:"+name);
        System.out.println("Semester:"+sem);
    }
}
class EngineeringStudent extends Student{
    String branch;
    double cgpa;
    void displayStudentDetails(){
        displaydetails();
        System.out.println("Branch:"+branch);
        System.out.println("CGPA:"+cgpa);

    }
}
public class Main{
    public static void main(String[] args){
        EngineeringStudent e=new EngineeringStudent();
        e.usn="302";
        e.name="Ritisha";
        e.sem=3;
        e.branch="CSE";
        e.cgpa=9.8;
        e.displayStudentDetails();

    }
}