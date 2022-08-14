import java.util.Scanner;
import java.lang.Math;
public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("lowerLimit: ");
        int l = input.nextInt();
        System.out.print("upperLimit: ");
        int u = input.nextInt();
        int sum = 0;
        for (int i = u; i >= l; i--) {
            int temp =i;
            while (i > 0) {
                int a = i % 10;
                int b = (int) Math.pow(a, 3);
                sum += b;
                i = i / 10;
            }
            if (temp == sum) {
                System.out.println(temp);
            }

        }
    }
}