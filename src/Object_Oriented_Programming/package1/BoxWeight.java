package Object_Oriented_Programming.package1;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight(){
        this.weight=-1;
    }
    public BoxWeight(int l, int b, int h, double weight){
        super(l,b,h);
        this.weight=weight;
    }

    public static void main(String[] args) {
        BoxWeight b = new BoxWeight(12,12, 12,12);
        System.out.println();
    }

}
