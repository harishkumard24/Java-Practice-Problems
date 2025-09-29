package Q4;

import java.util.Scanner;

public class TestingBook {
    public static void main(String[] args) {
        Author a1 = new Author("Robin Sharma", "robin@mail.com", "Male");
        Author a2 = new Author("Carl E", "carl@mail.com", "Male");
        Author a3 = new Author("Alexandra", "alex@mail.com", "Female");

        Book b1 = new Book("Man Who Sold His Ferrari", a1, 250.32, "HarperCollins", 50);
        Book b2 = new Book("Sam Club", a1, 500.15, "Penguin", 100);
        Book b3 = new Book("Sorrows of Tomorrow", a3, 150.00, "Random House", 10);

        Book[] bookList = {b1, b2, b3};

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Count number of books");
            System.out.println("2. Show author details by book title");
            System.out.println("3. List books by a specific author");
            System.out.println("4. Search for a book and reserve copies");
            System.out.println("99. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Total number of books: " + bookList.length);
                    break;

                case 2:
                    System.out.print("Enter book title: ");
                    String searchTitle = sc.nextLine();
                    boolean found = false;
                    for (Book bk : bookList) {
                        if (bk.getTitle().equalsIgnoreCase(searchTitle)) {
                            System.out.println("Author details: " + bk.getWriter());
                            found = true;
                        }
                    }
                    if (!found) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter author name: ");
                    String authName = sc.nextLine();
                    boolean match = false;
                    for (Book bk : bookList) {
                        if (bk.getWriter().toString().toLowerCase().contains(authName.toLowerCase())) {
                            System.out.println(bk);
                            match = true;
                        }
                    }
                    if (!match) {
                        System.out.println("No books found for this author.");
                    }
                    break;

                case 4:
                    System.out.print("Enter book title: ");
                    String bookTitle = sc.nextLine();
                    boolean exists = false;
                    for (Book bk : bookList) {
                        if (bk.getTitle().equalsIgnoreCase(bookTitle)) {
                            exists = true;
                            System.out.println("Book found: " + bk);
                            System.out.print("Enter number of copies needed: ");
                            int req = sc.nextInt();
                            sc.nextLine();

                            if (req <= bk.getAvailableQty()) {
                                double totalPrice = req * bk.getCost();
                                System.out.println("Total price: " + totalPrice);
                                bk.setAvailableQty(bk.getAvailableQty() - req);
                                System.out.println("Remaining stock: " + bk.getAvailableQty());
                            } else {
                                System.out.println("Not enough copies available.");
                            }
                            break;
                        }
                    }
                    if (!exists) {
                        System.out.println("Book not found.");
                    }
                    break;

                case 99:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 99);

        sc.close();
    }
}
