package professionalAcademyPart.week4_lecture2.task1;

public class Book {
    private String title;
    private String author;

    public Book() {
        this("", "");
    }

    public Book(String title, String author) {
        this.setTitle(title);
        this.setAuthor(author);
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

    public String getBookSummary() {
        return this.title + " by " + this.author;
    }
}