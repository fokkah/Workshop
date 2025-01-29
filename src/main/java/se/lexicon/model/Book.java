package se.lexicon.model;


/**
 * This class represents a Book model with properties and methods
 * to manage book-related information and operations.
 */
public class Book {
    // todo: needs completion

    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    //-------------------------------------- Fields -------------------------------------------------------

    private String id;
    private String title;
    private String author;
    private String borrower;
    private Boolean available;


   //-------------------------------------- Fields END-------------------------------------------------------
    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    //------------------------- Constructors -----------------------------------------------------------


    public Book(String id, String title, String author) {
        this.setId(id);
        this.setTitle(title);
        this.setAuthor(author);

    }

    //------------------------- Constructors END -----------------------------------------------------------
    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    //--------------- SETTERS -------------------------------------------------------------------------

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBorrower(String borrower) {
        if (borrower == null) {
            System.out.println("Ready to be borrowed");
        }else System.out.println(title + "is at the moment loaned");
        this.borrower = borrower;
    }

    public void setAvailable(Boolean available) {
        if (available == null) {

        }
        this.available = available;
    }

    //----------------------- SETTERS END -----------------------------------------------------------------
    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    //----------------------- GETTERS ---------------------------------------------------------------------

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getBorrower() {
        return borrower;
    }

    public Boolean getAvailable() {
        if (available == null) {
            System.out.println("Not available for loan");

        }
        return true;
    }

    public String getBookInformation(){
        return "ID: "+id+ "Title; "+title+ "Author: "+author+ "Borrower"+getBorrower();
    }

    //----------------------- GETTERS END---------------------------------------------------------------------
}


