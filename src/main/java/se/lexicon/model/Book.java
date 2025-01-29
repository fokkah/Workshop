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
    private Person borrower;
    private boolean available;


   //-------------------------------------- Fields END-------------------------------------------------------
    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    //------------------------- Constructors -----------------------------------------------------------


    public Book(String title, String author) {
        setTitle(title);
        setAuthor(author);

    }

    public Book(String title, String author, Person borrower) {
        setTitle(title);
        setAuthor(author);
        setBorrower(borrower);
    }

    //------------------------- Constructors END -----------------------------------------------------------
    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    //--------------- SETTERS -------------------------------------------------------------------------

    private void setId(String id) {

        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBorrower(Person borrower) {
        if (available) {
            setAvailable(true);
            System.out.println("Ready to be borrowed");
            this.borrower = borrower;
        }else System.out.println(title + "is at the moment loaned");
    }

    public void setAvailable(Boolean available) {
        if (available == null) {
            if (available == null) {
                
            }
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

    public Person getBorrower() {
        return borrower;
    }

    public Boolean getAvailable() {
        if (available) {
            System.out.println("Not available for loan");

        }
        return true;
    }

    public String getBookInformation(){
        return "ID: "+id+ "Title; "+title+ "Author: "+author+ "Borrower"+getBorrower();
    }


    //----------------------- GETTERS END---------------------------------------------------------------------
}


