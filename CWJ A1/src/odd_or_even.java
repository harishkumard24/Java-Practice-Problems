import java.util.Scanner;

public class odd_or_even {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no \n");
        int num = sc.nextInt();
        if (num % 2 == 0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");
    }
}