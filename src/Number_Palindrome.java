import java.util.Scanner;

public class Number_Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        palindrome(num);
    }

    static void palindrome(int num) {
         int temp = num;
         int sum =0;
        while(temp>0){
            for(int i =0;i<num;i++)
            {int a = temp%10;
        sum+=a*(Math.pow(10,i));
        temp = temp/10;}
    }
        if(sum == num){
            System.out.println("Number is Palindrome.");
        }
        else {
            System.out.println("Number is not a Palindrome.");
        }
    }
}