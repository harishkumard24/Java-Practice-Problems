import java.util.Scanner;

public class palindrome {
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the No \n");
    int num = sc.nextInt();
    int reverse = 0;
    int temp = 0;
    int dup= num;
    while (num > 0) {
        temp = num % 10;
        reverse = reverse * 10 + temp;
        num = num / 10;
    }
    if(dup==reverse)
        System.out.println("is pallindrome");
    else
        System.out.println("not a pallindrome");
}
}

