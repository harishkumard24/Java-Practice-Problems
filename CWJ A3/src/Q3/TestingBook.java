package Q3;

import java.util.ArrayList;
import java.util.Scanner;

public class TestingBook {
    private static ArrayList<Book> bookList = new ArrayList<>();
    private static ArrayList<Author> authorList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Book Store Menu ---");
            System.out.println("1. Add an Author");
            System.out.println("2. Add a Book");
            System.out.println("3. Show all Books");
            System.out.println("4. Modify Book Price and Stock");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int option = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (option) {
                case 1:
                    addAuthor(sc);
                    break;
                case 2:
                    addBook(sc);
                    break;
                case 3:
                    showBooks();
                    break;
                case 4:
                    modifyBook(sc);
                    break;
                case 5:
                    System.out.println("Exiting the program...");
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    private static void addAuthor(Scanner sc) {
        System.out.print("Enter author's name: ");
        String nm = sc.nextLine();
        System.out.print("Enter author's email: ");
        String mail = sc.nextLine();
        System.out.print("Enter author's gender (M/F): ");
        char g = sc.next().charAt(0);
        sc.nextLine();

        Author newAuthor = new Author(nm, mail, g);
        authorList.add(newAuthor);
        System.out.println("Author added: " + newAuthor);
    }

    private static void addBook(Scanner sc) {
        if (authorList.isEmpty()) {
            System.out.println("No authors available! Please add an author first.");
            return;
        }

        System.out.println("\nSelect an Author:");
        for (int i = 0; i < authorList.size(); i++) {
            System.out.println((i + 1) + ". " + authorList.get(i).getAuthorName());
        }

        System.out.print("Enter the author number: ");
        int idx = sc.nextInt() - 1;
        sc.nextLine();

        System.out.print("Enter the book title: ");
        String title = sc.nextLine();
        System.out.print("Enter the price: ");
        double cost = sc.nextDouble();
        System.out.print("Enter the stock: ");
        int stock = sc.nextInt();
        sc.nextLine();

        Book newBook = new Book(title, authorList.get(idx), cost, stock);
        bookList.add(newBook);
        System.out.println("Book added: " + newBook);
    }

    private static void showBooks() {
        if (bookList.isEmpty()) {
            System.out.println("No books available.");
            return;
        }
        System.out.println("\nList of Books:");
        for (Book b : bookList) {
            System.out.println(b);
        }
    }

    private static void modifyBook(Scanner sc) {
        if (bookList.isEmpty()) {
            System.out.println("No books to modify.");
            return;
        }

        System.out.println("\nSelect a Book to modify:");
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println((i + 1) + ". " + bookList.get(i).getTitle());
        }

        System.out.print("Enter the book number: ");
        int idx = sc.nextInt() - 1;
        sc.nextLine();

        System.out.print("Enter new price: ");
        double newCost = sc.nextDouble();
        System.out.print("Enter new stock: ");
        int newStock = sc.nextInt();
        sc.nextLine();

        Book chosen = bookList.get(idx);
        chosen.setCost(newCost);
        chosen.setStock(newStock);

        System.out.println("Book updated: " + chosen);
    }
}
