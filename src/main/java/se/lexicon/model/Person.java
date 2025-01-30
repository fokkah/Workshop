package se.lexicon.model;

/**
 * This class represents a Person model with properties and methods
 * to manage personal details and interactions with the library system.
 */
public class Person {
    // todo: needs completion



    private int id;
    private int bookId;
    private String firstName;
    private String lastName;
    private String personInformation;
    public String borrowedBooks;

    //-------------------------------------- Fields END-------------------------------------------------------
    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    //------------------------- Constructors ----------------------------------------------------------

    public Person(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }


//------------------------- Constructors END -----------------------------------------------------------
    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    //--------------- SETTERS -------------------------------------------------------------------------

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String setBorrowedBooks(String s){

        this.borrowedBooks = borrowedBooks;
        return borrowedBooks;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setLibrary(int bookId, String Title, String Author) {

        this.setLibrary(1, "Hitchhicker Guide To The Galaxy", "Dougles Adams");
        this.setLibrary(2, "Mat Guiden", "Botond Földieper");
        this.setLibrary(3, "Killers", "Elon Musket");
    }

    public void setPersonInformation(String personInformation) {
        this.personInformation = personInformation;
    }

    //----------------------- SETTERS END -----------------------------------------------------------------
    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    //----------------------- GETTERS ---------------------------------------------------------------------

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBorrowedBooks() {
        return borrowedBooks;

    }

    public String getPersonInformation(){
        return "ID: "+id+ "\nName: "+firstName+ "" +lastName+ "\nBooks on loan: " + borrowedBooks;
    }



    //----------------------- GETTERS END---------------------------------------------------------------------



}
