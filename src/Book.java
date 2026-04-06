public class Book {

    private String title;
    private String author;
    private int nrOfPages;
    private boolean ifAvailable;


    public Book(String title, String author, int nrOfPages, boolean ifAvailable) {
        this.title = title;
        this.author = author;
        this.nrOfPages = nrOfPages;
        this.ifAvailable = ifAvailable;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNrOfPages() {
        return nrOfPages;
    }
    public void setNrOfPages(int nrOfPages) {
        this.nrOfPages = nrOfPages;
    }

    public boolean isIfAvailable() {
        return ifAvailable;
    }
    public void setIfAvailable(boolean ifAvailable) {
        this.ifAvailable = ifAvailable;
    }

    public String showInfo(){
        System.out.println("Title: " + title + " Author: " + author + " Nr of pages: " + nrOfPages + " If available: " + ifAvailable);

        return "";
    }


    public void rentBook(){
        ifAvailable = false;
    }

    public void returnBook(){
        ifAvailable = true;
    }
}