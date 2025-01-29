package se.lexicon.model;
/**
 * This class represents a Person model with properties and methods
 * to manage personal details and interactions with the library system.
 */
public class Person {
    // todo: needs completion



    private int id;
    private String firstName;
    private String lastName;
    private String personInformation;
    private String[] borrowedBooks;

    //-------------------------------------- Fields END-------------------------------------------------------
    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    //------------------------- Constructors ----------------------------------------------------------

    public Person(String firstName, String lastName){
        setFirstName(firstName);
        setLastName(lastName);
    }

    public Person(String firstName, String lastName, String[] borrowedBooks){
       setBorrowedBooks(borrowedBooks);
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

    public void setBorrowedBooks(String[] borrowedBooks){

        this.borrowedBooks = borrowedBooks;

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

    public String[] getBorrowedBooks() {
        return borrowedBooks;
    }

    public String getPersonInformation(){
        return "ID: "+id+ "\nName: "+firstName+ "" +lastName+ "\nBooks on loan: " +getBorrowedBooks();
    }



    //----------------------- GETTERS END---------------------------------------------------------------------



}
