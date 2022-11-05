package Object_Oriented_Programming.package1;

public class Box {
    int l;
    int b;
    int h;
    Box(){
        this.l=-1;
        this.b=-1;
        this.h=-1;
    }
    Box(int l, int b, int h){
        this.l=l;
        this.b=b;
        this.h=h;
    }
    Box(Box old){
        this.l=old.l;
        this.b=old.b;
        this.h=old.h;
    }
    public static void information(){
        System.out.println("Running the Box");
    }

    public static void main(String[] args) {
        information();
        BoxWeight b = new BoxWeight();
        System.out.println(b.weight);

    }
}
