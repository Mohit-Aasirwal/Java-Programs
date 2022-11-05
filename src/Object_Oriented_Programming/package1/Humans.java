package Object_Oriented_Programming.package1;

public class Humans {
   public String name;
   public int age;
    String hobby;
    boolean maritalstatus;
   public static int population;
   public Humans(String name,int age,String hobby,boolean maritalstatus){
        this.name=name;
        this.age=age;
        this.hobby=hobby;
        this.maritalstatus=maritalstatus;
        Humans.population+=1;
    }
}
