package se.lexicon.model;


import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        // todo: needs completion
        // Initialize and display Book & Person instances
        // Simulate borrowing a book
        // Simulate returning a book


        Book title;
        title = new Book(": 1\n", "Hitchhikers Guide\n", "Douglas Adams");

        ArrayList<Book>bookTitle =new ArrayList<Book>();
        bookTitle.add(title);

        Person person;
        person = new Person("Tamas", "Szalai");

        System.out.println("Borrower: " + title.getBorrower());
        System.out.println("Title: " + title.getTitle());
        System.out.println("ID: " + title.getId());
        System.out.println("Author " + title.getAuthor());
        System.out.println("Available? " + title.getAvailable());











    }
}
