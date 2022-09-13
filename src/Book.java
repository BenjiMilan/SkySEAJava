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
        System.out.println(book.toString());
    }
}
