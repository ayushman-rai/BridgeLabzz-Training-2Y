public class Book {
    private static String libraryName = "City Central Library";
    private final String isbn;
    private String title;
    private String author;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }

    void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + isbn);
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book("Clean Code", "Robert Martin", "ISBN12345");
        Book.displayLibraryName();
        b1.displayBookDetails();
    }
}
