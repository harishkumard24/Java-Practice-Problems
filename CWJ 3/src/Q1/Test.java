package Q1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int total = sc.nextInt();
        sc.nextLine();

        Emp[] staff = new Emp[total];

        for (int k = 0; k < total; k++) {
            System.out.printf("Enter details for employee %d:\n", k + 1);

            System.out.print("Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String nm = sc.nextLine();

            System.out.print("Designation: ");
            String role = sc.nextLine();

            System.out.print("Salary: ");
            double sal = sc.nextDouble();
            sc.nextLine();

            staff[k] = new Emp(id, nm, role, sal);
            System.out.println();
        }

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Search employee by ID");
            System.out.println("2. Increment salary by 10%");
            System.out.println("3. Display all employees");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Enter employee ID to search: ");
                    int searchKey = sc.nextInt();
                    sc.nextLine();

                    Emp found = searchEmp(staff, searchKey);
                    if (found != null) {
                        System.out.println("Employee found:");
                        found.showDetails();
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 2:
                    System.out.print("Enter employee ID to increment salary: ");
                    int incKey = sc.nextInt();
                    sc.nextLine();

                    Emp empUp = searchEmp(staff, incKey);
                    if (empUp != null) {
                        empUp.raiseSalary();
                        System.out.println("Salary incremented:");
                        empUp.showDetails();
                    } else {
                        System.out.println("Employee not found.");
                    }
                    break;

                case 3:
                    System.out.println("Employee List:");
                    for (Emp e : staff) {
                        e.showDetails();
                    }
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice.");
            }
            System.out.println();
        }
    }

    public static Emp searchEmp(Emp[] staff, int id) {
        for (Emp e : staff) {
            if (e.getEmpId() == id) {
                return e;
            }
        }
        return null;
    }
}
