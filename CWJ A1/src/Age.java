import java.util.Scanner;

public class Age {
        public static void main(String args []) {
            {
                System.out.println("Enter your Age");
                Scanner scanner = new Scanner(System.in);
                int age = scanner.nextInt();
                System.out.println("Your Age is " + age);
                if(age<18) {
                    System.out.println("Your a Minor");
                }
                if(age>18 && age<60)
                {
                System.out.println("Your a Adult");
                }
                if(age>60 && age<122)
                {
                    System.out.println("Your a Senior Citizen");
                } else
                    System.out.println("Please enter a Valid Age");

            }
        }
}
