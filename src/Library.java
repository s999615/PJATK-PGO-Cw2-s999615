public class Library {
    private Book[] books;
    private int nrOfBooks;

    public Library(int capacity) {
        books = new Book[capacity];
        nrOfBooks = 0;}

    public void addBook(Book book) {
        books[nrOfBooks] = book;
        nrOfBooks++;
    }

    public void showAvailableBooks() {
        for (int i = 0; i < nrOfBooks; i++) {
            Book book = books[i];
            if (book.isIfAvailable()) {
                book.showInfo();
            }
        }
    }

    public Book searchBookByTitle(String title) {
        for (int i = 0; i < nrOfBooks; i++) {
            Book book = books[i];
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public int countAvailableBooks() {
        int count = 0;
        for (int i = 0; i < nrOfBooks; i++) {
            Book book = books[i];
            if (book.isIfAvailable()) {
                count++;
            }
        }
        return count;
    }


}