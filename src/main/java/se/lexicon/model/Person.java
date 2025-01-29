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
    private Book borrowedBooks;


    //-------------------------------------- Fields END-------------------------------------------------------
    //||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||
    //------------------------- Constructors ----------------------------------------------------------

    public Person(String firstName, String lastName){
        this.setFirstName(firstName);
        this.setLastName(lastName);
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



    //----------------------- GETTERS END---------------------------------------------------------------------



}
