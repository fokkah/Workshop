package se.lexicon.model;


import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // todo: needs completion
        // Initialize and display Book & Person instances
        // Simulate borrowing a book
        // Simulate returning a boo
        Person Tamas;
        Tamas = new Person("Tamas", "Szalai");


        Book Hitch = new Book("Hitchhikers Guide", "Douglas Adams");
        Book Mat = new Book( "Ungersk mat", "Gösta svensson");
        Book Mordare = new Book( "Sverkers liv som mördare", "Botond");




        Hitch.setBorrower(Tamas);
        Mat.setBorrower(Tamas);

        //------------------------------ Person SOUT -----------------------------------------------

        //System.out.println(person.getFirstName());
        //System.out.println(person.getLastName());
        //System.out.println(person.getId());
        //System.out.println(person.getPersonInformation());
        System.out.println(Tamas.getBorrowedBooks());






        //------------------------------ Book SOUT -----------------------------------------------













    }
}
