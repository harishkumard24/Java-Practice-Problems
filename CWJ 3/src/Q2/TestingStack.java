package Q2;

import java.util.Scanner;

public class TestingStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stackObj = new Stack();
        boolean created = false;

        while (true) {
            System.out.println("\n--- Stack Menu ---");
            System.out.println("1. Create new stack");
            System.out.println("2. Push element");
            System.out.println("3. Pop element");
            System.out.println("4. Display stack");
            System.out.println("5. Check if stack is empty");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter stack size: ");
                    int sz = sc.nextInt();
                    stackObj.init(sz);
                    created = true;
                    System.out.println("Stack of size " + sz + " created.");
                    break;

                case 2:
                    if (!created) {
                        System.out.println("Please create stack first!");
                        break;
                    }
                    System.out.print("Enter element to push: ");
                    int item = sc.nextInt();
                    stackObj.push(item);
                    break;

                case 3:
                    if (!created) {
                        System.out.println("Please create stack first!");
                        break;
                    }
                    stackObj.pop();
                    break;

                case 4:
                    if (!created) {
                        System.out.println("Please create stack first!");
                        break;
                    }
                    stackObj.showStack();
                    break;

                case 5:
                    if (!created) {
                        System.out.println("Please create stack first!");
                        break;
                    }
                    if (stackObj.isEmpty()) {
                        System.out.println("Stack is empty.");
                    } else {
                        System.out.println("Stack is not empty.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting program.");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}
