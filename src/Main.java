public class Main {
    public static void main(String[] args) {
        LibraryManager library = new LibraryManager();
        System.out.println("== Library Management System ==");

        library.showBooks();
        library.addBook();
        library.removeBook();
    }
}
