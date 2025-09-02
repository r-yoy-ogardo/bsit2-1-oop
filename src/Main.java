public class Main {
    public static void main(String[] args) {
        LibraryManager library = new LibraryManager();
        System.out.println("=== Library Management System ===");
        System.out.println();

        library.showBooks();
        library.addBook();
        library.removeBook();

        System.out.println("Program completed successfully.");
    }
}
