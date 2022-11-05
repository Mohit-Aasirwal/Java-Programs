package Object_Oriented_Programming.package2;

import Object_Oriented_Programming.package1.Humans;

public class Empolyees {
    public static void main(String[] args) {
        Humans h1 = new Humans("Mohit Aasirwal",19,"Coding",false);
Humans h2 = new Humans("Koustubh Aasirwal",15,"gaming",false);
        System.out.println(Humans.population);
        System.out.println(h1.name+ h1.age);
        greeting();

    }
    void fx(){
        System.out.println("dj");
        greeting();
    }
    static {
        System.out.println("I am in static block");
    }
    static void greeting() {
        Humans h2 = new Humans("anonymous",0,"none",false);
        System.out.println("hola!");
//        h2.fx();
        Integer i = new Integer(h2.age);
        System.out.println(i);
    }
}
