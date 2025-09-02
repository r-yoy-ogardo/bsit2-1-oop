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
                System.out.println("There are no books available in the library.");
            } else {
                System.out.println("--- Current Books ---");
                for (int i = 0; i < books.size(); i++) {
                    System.out.println((i + 1) + ". " + books.get(i));
                }
            }
        } catch (IllegalStateException empty) {
            System.out.println("Error: " + empty.getMessage());
        } finally {
            System.out.println("Display operation completed.\n");
        }
    }

    public void addBook() {
        while (true) {
            boolean addedSuccessfully = false;
            try {
                System.out.print("Enter book title to add: ");
                String title = scanner.nextLine().trim();

                if (title == null || title.isEmpty()) {
                    throw new IllegalArgumentException("Book title cannot be empty!");
                }
                if (title.length() < 3) {
                    throw new IllegalArgumentException("Book title must be at least 3 characters long!");
                }
                books.add(title);
                System.out.println("'" + title + "'" + " added successfully!");
                addedSuccessfully = true;
                break;
            } catch (IllegalArgumentException error) {
                System.out.println("Error: " + error.getMessage());
            } finally {
                System.out.println("Add book operation completed.\n");

                if (addedSuccessfully) {
                    showBooks();
                }
            }
        }
    }

    public void removeBook() {
        while (true) {
            boolean removedSuccessfully = false;
            try {
                if (books.isEmpty()) {
                    System.out.println("Library is empty. No books can be remove.");
                    return;
                }
                System.out.print("Enter book number to remove (1-4): ");
                String input = scanner.nextLine();
                int index = Integer.parseInt(input);
                if (index < 0) {
                    throw new IllegalArgumentException("Book number cannot be negative!");
                }
                String removedBook = books.remove(index - 1);
                System.out.println("'" + removedBook + "'" + " removed successfully!");
                removedSuccessfully = true;
                break;
            } catch (NumberFormatException error) {
                System.out.println("Error: Please enter a valid number!");
            } catch (IndexOutOfBoundsException error) {
                System.out.println("Error: Invalid book number! Please enter between 1 and 4.");
            } catch (IllegalArgumentException error) {
                System.out.println("Error: " + error.getMessage());
            } finally {
                System.out.println("Remove book operation completed.\n");

                if (removedSuccessfully) {
                    showBooks();
                }
            }
        }
    }
}
