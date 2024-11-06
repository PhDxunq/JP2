package Lesson8.Cau1;

import java.io.Serializable;

public class Library implements Serializable {
    private String ID;
    private String bookTitle;
    private String author;
    private int publishedYear;
    private String genre;

    public Library() {
    }

    public Library(String ID, String bookTitle, String author, int publishedYear, String genre) {
        this.ID = ID;
        this.bookTitle = bookTitle;
        this.author = author;
        this.publishedYear = publishedYear;
        this.genre = genre;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Library{" +
                "ID='" + ID + '\'' +
                ", bookTitle='" + bookTitle + '\'' +
                ", author='" + author + '\'' +
                ", publishedYear=" + publishedYear +
                ", genre='" + genre + '\'' +
                '}';
    }
}
