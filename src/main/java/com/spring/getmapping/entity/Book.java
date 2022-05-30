package com.spring.getmapping.entity;

public class Book {

    private String BookName;
    private int BookId;
    private String Author;
    private String IssueDate;

    public Book(String bookName, int bookId, String author, String issueDate) {
        BookName = bookName;
        BookId = bookId;
        Author = author;
        IssueDate = issueDate;
    }

    public Book() {
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    public int getBookId() {
        return BookId;
    }

    public void setBookId(int bookId) {
        BookId = bookId;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getIssueDate() {
        return IssueDate;
    }

    public void setIssueDate(String issueDate) {
        IssueDate = issueDate;
    }

    @Override
    public String toString() {
        return "Book [Author=" + Author + ", BookId=" + BookId + ", BookName=" + BookName + ", IssueDate=" + IssueDate
                + "]";
    }

    
    

    
    
}
