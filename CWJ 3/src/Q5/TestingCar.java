package Q5;

import java.util.ArrayList;
import java.util.Scanner;

public class TestingCar {
    private ArrayList<Car> cars = new ArrayList<>();

    public void loadCars() {
        cars.add(new Car("Brezza", "VX", "02/10/2017", "White", 650500.00));
        cars.add(new Car("Venue", "SX", "20/09/2018", "White", 750000.00));
        cars.add(new Car("Ciaz", "VX", "15/12/2015", "White", 600000.00));
        cars.add(new Car("Ecosport", "LX", "21/06/2018", "Blue", 500500.00));
        cars.add(new Car("Nexon", "SX", "15/10/2019", "Green", 850500.00));
    }

    public void listCars() {
        if (cars.isEmpty()) {
            System.out.println("No cars available.");
            return;
        }
        System.out.println("Available Cars:");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println((i + 1) + ". " + cars.get(i));
        }
    }

    public void reserveCar(int idx) {
        if (idx < 1 || idx > cars.size()) {
            System.out.println("Invalid car selection.");
            return;
        }
        Car chosen = cars.remove(idx - 1);
        System.out.println("Booking confirmed for:");
        System.out.println(chosen);
    }

    public static void main(String[] args) {
        TestingCar shop = new TestingCar();
        Scanner sc = new Scanner(System.in);

        shop.loadCars();

        while (true) {
            System.out.println("\n--- Automobile Shop Menu ---");
            System.out.println("1. Display all available cars");
            System.out.println("2. Book a car");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    shop.listCars();
                    break;
                case 2:
                    shop.listCars();
                    if (shop.cars.isEmpty()) {
                        System.out.println("No cars to book.");
                        break;
                    }
                    System.out.print("Enter the number of the car to book: ");
                    int carIdx = sc.nextInt();
                    sc.nextLine();
                    shop.reserveCar(carIdx);
                    break;
                case 3:
                    System.out.println("Thank you for visiting the Automobile Shop.");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}
