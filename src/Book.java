public class Book {
    String author;
    int pageAmount;
    String publisher;

    private Book(String author, int pageAmount, String publisher) {
        this.author = author;
        this.pageAmount = pageAmount;
        this.publisher = publisher;
    }

    public Book(String author, int pageAmount) {
        this(author, pageAmount, "No publisher");
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
