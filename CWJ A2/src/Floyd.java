import java.util.Scanner;

public class Floyd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no of row of triangle");
        short row= sc.nextShort();
        int num=1;
        for(int i=1;i<=row;i++)
        {
            System.out.println("");
            for(int j=1;j<=i;j++)
            {
                System.out.print(num+" ");
                num++;
            }
        }System.out.println();


    }

}
