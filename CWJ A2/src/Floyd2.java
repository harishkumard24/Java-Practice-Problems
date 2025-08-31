import java.util.Scanner;

public class Floyd2 {
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the no of row of triangle");
            short row= sc.nextShort();
            int num=1;
            for(int i=1;i<=row;i++)
            {
                System.out.println("");
                for(int j=1;j<=i;j++) {
                    if ((i + j) % 2 == 0)
                        System.out.print("1");
                    else
                        System.out.print("0");
                }
            }
        }
}

