import java.util.Scanner;

public class Reverse {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no");
        int num = sc.nextInt();
        int reverse=0;
        while (num > 0) {
            int temp = num % 10;
            reverse = reverse * 10 + temp;
            num = num / 10;
        }
        System.out.println("the Reverse of the number is \n" + reverse);
    }
}
