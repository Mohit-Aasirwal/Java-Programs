import java.util.Scanner;

public class Object_Oriented_Programming {
    public static void main(String[] args) {

        Student no1 = new Student();
        Scanner scan = new Scanner(System.in);
        Student no2= new Student("Mohit Aasirwal","Information Technology",39);
        System.out.println(no1.name+" "+no1.branch+" "+no1.roll);
        System.out.println(no2.name+" "+no2.branch+" "+no2.roll);
    }
}
class Student{
    String name;
    String branch;
    int roll;
Student(){
    this.name="Anonymous";
    this.roll=10;
    this.branch=null;
}
    Student(String naam,String kaksha,int kramank){
        this.name=naam;
        this.branch=kaksha;
        this.roll= kramank;
    }
}