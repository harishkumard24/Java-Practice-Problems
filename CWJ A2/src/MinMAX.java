import java.util.Scanner;

public class MinMAX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of the array \n");
        int size= sc.nextInt();
        int[] num= new int[size];
        System.out.println("Please enter the numbers \n");
        for(int i=0;i<size;i++)
        {
            num[i]= sc.nextInt();
        }
        int max = num[0];
        int min = num[0];
        for(int i=1;i<size;i++) {
            if (num[i] > max)
                max = num[i];
            if (num[i] < min)
                min = num[i];
        }
        System.out.println("the Min no in the array is \n" +min);
        System.out.println("the Max no in the array is \n" +max);
    }
}
