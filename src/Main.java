public class Main{
    public static void main(String[] args) {

        Book book1 = new Book("Harry Potter1", "J.R", 101, true);
        Book book2 = new Book("Harry Potter2", "J.R", 102, true);
        Book book3 = new Book("Harry Potter3", "J.R", 103, true);
        Book book4 = new Book("Harry Potter4", "J.R", 104, true);
        Book book5 = new Book("Harry Potter5", "J.R", 105, true);

        String book1info = book1.showInfo();
        String book2info = book2.showInfo();
        String book3info = book3.showInfo();
        String book4info = book4.showInfo();
        String book5info = book5.showInfo();

        book1.rentBook(); // ksiazka wyporzyczona
        book1.showInfo(); // status ksiazki - false (nie dostepna)
        book1.returnBook(); // ksiazka zwrocona
        book1.showInfo(); // status ksiazki - true (dostepna)

        Reader reader1 = new Reader("Anna", "Kowalska", "CARD1", 0);
        Reader reader2 = new Reader("Jan", "Nowak", "CARD2", 0);

        reader1.showData();
        reader2.showData();
        reader1.increaseNrOfRentals(); //musi dodac 1 record wyporzyczenia
        reader1.showData(); //pokaze 1 w ilosci wyporzyczen



    }
}