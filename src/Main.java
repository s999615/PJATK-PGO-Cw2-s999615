public class Main{
    public static void main(String[] args) {

        Library library = new Library();

        //Dodanie ksiazek
        library.addBook(new Book("Harry Potter1", "J.R", 101, true));
        library.addBook(new Book("Harry Potter2", "J.R", 102, true));
        library.addBook(new Book("Harry Potter3", "J.R", 103, true));
        library.addBook(new Book("Harry Potter4", "J.R", 104, true));
        library.addBook(new Book("Harry Potter5", "J.R", 105, true));

        //Dodanie czytelnikow
        Reader reader1 = new Reader("Anna", "Kowalska", "CARD1", 0);
        Reader reader2 = new Reader("Jan", "Nowak", "CARD2", 0);

        //Pokazac dostepne ksiazki
        System.out.println("\nAvailable books: ");
        library.showAvailableBooks();

        //Wypoczyczenie ksiazki
        System.out.println("\nRenting book: ");
        library.rentBook("Harry Potter 1", reader1);

        //Ponownie pokazac dostepne ksiazki
        System.out.println("\nAvailable books after rent: ");
        library.showAvailableBooks();

        //Zwrocenie ksiazki
        System.out.println("\nBook is returned: ");
        library.returnBook("Harry Potter 1", reader1);

        //Satatus finalny
        System.out.println("\nAvailable books: ");
        library.showAvailableBooks();

    }
}