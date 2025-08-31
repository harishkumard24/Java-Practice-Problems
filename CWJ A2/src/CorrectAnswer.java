import java.util.Scanner;

public class CorrectAnswer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.print("What is date of birth of Gandhi \n");
            String answer = sc.nextLine();
            if(i==3)
            {
                System.out.println("exceeded 3 attempts");
                break;
            }

            if (answer.equalsIgnoreCase("second")) {
                System.out.println("Good, its the wright answer");
                break;
            } else
                System.out.println(" wrong answer, please try again and the no of attempts left are " +(3-i));
            continue;
        }
    }
}
