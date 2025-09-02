import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManager {
    private ArrayList<String> books;
    private Scanner scanner;

    public LibraryManager() {
        books = new ArrayList<>();
        books.add("Java Programming");
        books.add("Web Development");
        books.add("Database Design");
        scanner = new Scanner(System.in);
    }

    public void showBooks() {
        try {
            if (books == null) {
                throw new IllegalStateException("Book list is not initialized (null).");
            }
            if (books.isEmpty()) {
                System.out.println("No books available in the library.");
            } else {
                System.out.println("--Current Books--");
                for (int i = 0; i < books.size(); i++) {
                    System.out.println(i + " - " + books.get(i));
                }
            }
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Display operation completed");
        }
    }

    public void addBook() {
        while (true) {
            try {
                System.out.print("Enter a new book title: ");
                String title = scanner.nextLine();
                if (title == null || title.trim().isEmpty()) {
                    throw new IllegalArgumentException("Book title cannot be empty or null.");
                }
                if (title.length() < 3) {
                    throw new IllegalArgumentException("Book title must be at least 3 characters long.");
                }
                books.add(title);
                System.out.println( "'" + title + "'" + " added successfully" );
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input: " + e.getMessage());
                System.out.println("Please try again.\n");
            }
        }
        System.out.println("Add operation completed.");
        showBooks();
    }

    public void removeBook() {
        while (true) {
            try {
                if (books.isEmpty()) {
                    System.out.println("Library is empty. No books to remove.");
                    return;
                }
                System.out.print("Enter the index of the book to remove: ");
                String input = scanner.nextLine();
                int index = Integer.parseInt(input);
                if (index < 0) {
                    throw new IllegalArgumentException("Index cannot be negative.");
                }
                String removedBook = books.remove(index);
                System.out.println( "'" + removedBook+ "'" + " Removed successfully" );
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: Please enter a valid number.");
                System.out.println("Please try again.\n");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Error: Index is out of range.");
                System.out.println("Please try again.\n");
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input: " + e.getMessage());
                System.out.println("Please try again.\n");
            }
        }
        System.out.println("Remove operation completed.");
        showBooks();
    }
}
