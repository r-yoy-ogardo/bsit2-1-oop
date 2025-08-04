public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("The Fellowship of the Ring", "John Ronald Reuel Tolkien", 479);
        Book book2 = new Book("The Two Towers", "John Ronald Reuel Tolkien", 415);
        Book book3 = new Book("The Return of the King", "John Ronald Reuel Tolkien", 347);


        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();

        book1.borrowBook();
        book1.displayInfo();
        book1.returnBook();
        book1.displayInfo();

        book2.borrowBook();
        book2.displayInfo();
        book2.returnBook();
        book2.displayInfo();

        book3.borrowBook();
        book3.displayInfo();
        book3.returnBook();
        book3.displayInfo();
    }
}
