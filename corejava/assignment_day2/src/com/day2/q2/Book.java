package com.day2.q2;

public class Book {
   private String bookTitle ;
    private String author ;
    private  String ISBN;
    private  int numOfCopies;

    public Book(String bookTitle, String author, String ISBN, int numOfCopies) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.ISBN = ISBN;
        this.numOfCopies = numOfCopies;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public int getNumOfCopies() {
        return numOfCopies;
    }

    public void setNumOfCopies(int numOfCopies) {
        this.numOfCopies = numOfCopies;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("bookTitle='").append(bookTitle).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", ISBN='").append(ISBN).append('\'');
        sb.append(", numOfCopies=").append(numOfCopies);
        sb.append('}');
        return sb.toString();
    }
}
