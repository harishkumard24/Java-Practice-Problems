import java.util.ArrayList;
import java.util.Scanner;

public class Dupicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers you want:");
        int size = sc.nextInt();
        int[] num = new int[size];
        System.out.println("Enter " + size + " numbers:");
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }
        ArrayList<Integer> duplicates = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (num[i] == num[j] && !duplicates.contains(num[i])) {
                    duplicates.add(num[i]);
                }
            }
        }
        if (duplicates.isEmpty()) {
            System.out.println("There are no duplicates");
        } else {
            System.out.print("The duplicate numbers are: ");
            for (int dup : duplicates) {
                System.out.print(dup + " ");
            }
        }
    }
}
