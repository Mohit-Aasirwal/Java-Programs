package Arrays;
import java.util.ArrayList;
import java.lang.*;
import java.util.Scanner;

public class Arrays<I extends Number> {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        list.add(12);
        list.add(13);
        System.out.println(list);
        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> a= new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            a.add(new ArrayList<>());
        }
        for(int i = 0; i<3 ; i++){
            for (int j = 0; j < 3; j++) {
                a.get(i).add(in.nextInt());
            }
        }
        for(int i = 0; i<3 ; i++){
            for (int j = 0; j < 3; j++) {
                System.out.println(a);
            }
        }


    }
}
