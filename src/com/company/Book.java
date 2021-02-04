package com.company;

public class Book {
    private int isbnNumber;
    private String title;
    private int releaseYear;

    public Book(int isbnNumber, String title, int releaseYear) {
        this.isbnNumber = isbnNumber;
        this.title = title;
        this.releaseYear = releaseYear;
    }

    public int getIsbnNumber() {
        return this.isbnNumber;
    }

    public String getTitle() {
        return this.title;
    }

    public int getReleaseYear() {
        return this.releaseYear;
    }

    public int setIsbnNumer() {
        return isbnNumber;
    }

    public String setTitle() {
        return title;
    }

    public int setReleaseYear() {
        return releaseYear;
    }

    @Override
    public String toString() {
        return "This is the ISBN-Number" + this.isbnNumber +
                " This is the title of the book" + this.title +
                " This is the year the book was released" + releaseYear;
    }
}
