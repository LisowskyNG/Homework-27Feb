package Homework27Feb;

public class Book {
    private final String title;
    private final Author author;
    private int publishedDate;

    public Book (String title, Author author, int publishedDate) {
        this.title = title;
        this.author = author;
        this.publishedDate = publishedDate;
    }
    public String getTitle() {
        return this.title;
    }

    public Author getAuthor () {
        return author;
    }

    public int getPublishedDate() {

        return this.publishedDate;
    }

    public void setPublishedDate(int publishedDate) {

        this.publishedDate = publishedDate;
    }
}
