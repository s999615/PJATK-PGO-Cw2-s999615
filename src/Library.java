import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) { this.books.add(book); }


    public void showAvailableBooks() {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.isIfAvailable()) {
                book.showInfo();
            }
        }
    }

    public Book searchBookByTitle(String title) {
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public int countAvailableBooks() {
        int count = 0;
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.isIfAvailable()) {
                count++;
            }
        }
        return count;
    }

    public void rentBook(String title, Reader reader) {
        Book book = searchBookByTitle(title);
        if (book == null) {
            System.out.println("Book is not found");
        } else if (!book.isIfAvailable()) {
            System.out.println("Book is already rented");
        } else {
            book.rentBook();
            reader.increaseNrOfRentals();
            System.out.println(book.getTitle() + "is rented successfully");
        }
    }

    public void returnBook(String title, Reader reader) {
        Book book = searchBookByTitle(title);
        if (book == null) {
            System.out.println("Book is not found");
        } else if (book.isIfAvailable()) {
            System.out.println("Book is already returned");
        } else {
            book.returnBook();
            reader.decreaseNrOfRentals();
            System.out.println(book.getTitle() + "is returned successfully");
        }
    }


}