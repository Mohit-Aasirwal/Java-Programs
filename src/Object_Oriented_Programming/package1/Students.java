package Object_Oriented_Programming.package1;

public class Students {
    String name;
    String branch;
    int rollno;
    Students(String name, String branch, int rollno){
        this.name= name;
        this.branch= branch;
        this.rollno=rollno;
    }

    public static void main(String[] args) {
        Students s = new Students("Mohit Aasirwal","Information Technology",39);
        System.out.println(s.name+' '+s.branch+" "+s.rollno);

    }

}
