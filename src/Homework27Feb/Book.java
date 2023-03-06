package Homework27Feb;

public class Book {
    private String title;
    private Author author;
    private int publishedDate;

    public Book (String title, Author author, int publishedDate) {
        this.title = title;
        this.author = author;
        this.publishedDate - publishedDate;
    }
    public String getTitle() {
        return this.title;
    }
    public int getPublishedDate() {
        return this.publishedDate;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setPublishedDate(int publishedDate) {
        this.publishedDate = publishedDate;
    }
}
