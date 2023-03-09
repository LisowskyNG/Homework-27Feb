package Homework27Feb;

import java.util.Objects;

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

    @Override
    public String toString() {
        return author + ". " + title + ". " + publishedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishedDate == book.publishedDate && title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publishedDate);
    }
}
