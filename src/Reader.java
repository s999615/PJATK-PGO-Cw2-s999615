public class Reader {

    private String name;
    private String surname;
    private String cardNr;
    private int nrOfRentals;

    public Reader(String name, String surname, String cardNr, int nrOfRentals) {
        this.name = name;
        this.surname = surname;
        this.cardNr = cardNr;
        this.nrOfRentals = nrOfRentals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) { this.surname = surname; }

    public String getCardNr() {
        return cardNr;
    }

    public void setCardNr(String cardNr) {
        this.cardNr = cardNr;
    }

    public int getNrOfRentals() {
        return nrOfRentals;
    }

    public void setNrOfRentals(int nrOfRentals) {
        this.nrOfRentals = nrOfRentals;
    }

    public String showData(){
        System.out.println("Name: " + name + " Surname: " + surname + " Card NR: " + cardNr + " Nr of rentals: " + nrOfRentals);
        return "";}

    public void increaseNrOfRentals() { this.nrOfRentals++; }

    public void decreaseNrOfRentals() { this.nrOfRentals--; }
}
