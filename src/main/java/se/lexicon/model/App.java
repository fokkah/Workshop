package se.lexicon.model;


import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // todo: needs completion
        // Initialize and display Book & Person instances
        // Simulate borrowing a book
        // Simulate returning a book



        Book Hitch = new Book("Hitchhikers Guide", "Douglas Adams");
        Book Mat = new Book( "Ungersk mat", "Gösta svensson");
        Book Mördare = new Book( "Sverkers liv som mördare", "Tamas");
        Book



        Person Tamas;
        Tamas = new Person("Tamas", "Szalai");
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
