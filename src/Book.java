public class Book {

    String title = "";
    String author = "";
    int pages = 0;
    boolean isAvailable;


    public Book(String bookTitle, String bookAuthor, int bookPages) {
        title = bookTitle;
        author = bookAuthor;
        pages = bookPages;
        isAvailable = true;
        System.out.println("A new book " + title + " by " + author + " has been added to the library!");
        System.out.println();
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        if (isAvailable) {
            System.out.println("Available: Yes");
        } else {
            System.out.println("Available: No");
        }
        System.out.println();
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Sorry, The book " + title + " has not been returned yet.");
        }
    }

    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Thank for returning the " + title + " book!");
        } else {
            System.out.println("" + title + " was not borrowed.");
        }
    }
}
