package com.day2.q2_improved;

public interface BookStore {
    void sell(String bookTitle, int noOfCopies);
    void order(String isbn, int noOfCopies);
    void display();
}
