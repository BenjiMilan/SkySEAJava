public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Price: £" + price;
    }

    public static void main(String[] args) {
        Book book = new Book("Dune", "Frank Herbert", 10.99);
        Book bookie = new Book("Wuthering Heights", "Emily Bronte", 6.99);
        Book crazyBook = new Book("Lord of the Rings", "JRR Tolkien", 17.99);
        Book[] books = {book, bookie, crazyBook};
        for(Book book1: books) {
            System.out.println(book1.toString());
        }
    }
}
