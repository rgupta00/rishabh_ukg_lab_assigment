package com.day2.q2_improved;

public class BookStoreUsingArray implements BookStore {
    private String bookStoreName;

    private Book[] books;
    public BookStoreUsingArray(String bookStoreName){
        this.bookStoreName = bookStoreName;
        books=new Book[2];
        books[0]=new Book("effective java","Foo","AS1M3",22);
        books[1]=new Book("Rich dad poor dad","RK","AS233",12);

    }
    //
    @Override
    public void sell(String bookTitle, int noOfCopies){
        for(int i=0;i<books.length;i++){
            if(books[i].getBookTitle().equals(bookTitle)){
               int currentNoOfCopies=books[i].getNumOfCopies();
               if(noOfCopies<=currentNoOfCopies){

               }
            }
        }
    }

    //
    @Override
    public void order(String isbn, int noOfCopies){
       //
    }

    @Override
    public void display(){
        System.out.println("**************book store inforation ********************");
        System.out.println("bookStoreName: "+bookStoreName);
        System.out.println("*****************************************************");
        for(Book book: books){
            System.out.println(book);
        }
    }
}
