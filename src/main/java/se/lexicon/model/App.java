package se.lexicon.model;


import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // todo: needs completion
        // Initialize and display Book & Person instances
        // Simulate borrowing a book
        // Simulate returning a boo
        Person Tamas;
        Tamas = new Person(1,"Tamas", "Szalai");
        ArrayList<String> library = new ArrayList<String>(5);
        library.add("Hitchhikers guide");
        library.add("Mat Guiden");
        library.add("Killers");




        Tamas.getBookId();

        //------------------------------ Person SOUT -----------------------------------------------

        /*System.out.println(Tamas.getId());
        System.out.println(Tamas.getFirstName());
        System.out.println(Tamas.getLastName());
         */
        System.out.println(Tamas.getPersonInformation());








        //------------------------------ Book SOUT -----------------------------------------------













    }
}
