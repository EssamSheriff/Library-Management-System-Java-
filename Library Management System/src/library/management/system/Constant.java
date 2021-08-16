package library.management.system;

import java.util.ArrayList;
import library.management.system.Book;
import library.management.system.Librarians;
import library.management.system.Readers;
import library.management.system.Order_list;

public class Constant {
    
    static ArrayList<Librarians> employees = new ArrayList<Librarians>();
    static ArrayList<Readers> readers = new ArrayList<Readers>();
    static ArrayList<Book> books = new ArrayList<Book>();
    static ArrayList<Order_list> List = new ArrayList<Order_list>();

    Librarians Admin1 = new Librarians(4000.00, "4-4-2014", "moderator",
            "Admin", "One", 1, "12345", Gender.male, "cairo",
            "ad1@gmail.com", "0111222555");

    Librarians Admin2 = new Librarians(3000.00, "4-4-2017", "seller",
            "ADMin", "Two", 2, "54321", Gender.female, "cairo",
            "ad2@gmail.com", "0111222666");
    Readers Reader1 = new Readers(19, "7-6-2018", false, "novels", "reader",
    "one", 12, "123456", Gender.male, "west el bala, cairo", "red1@gmail.com",
            "01228888",Payment.visa);
    Readers Reader2 = new Readers(22, "4-8-2019", true, "science", "READer"
            , "two", 123, "654321", Gender.female, "Roksy, cairo", 
            "red2@gmail.com", "01227777",Payment.cash);
    Book book1 = new Book("awlad", "Nageb Mahfouz", "1976", "Arabic", "novel",
            15, 150, 6, 5, 550);
    Book book2 = new Book("hard", "charles dickens", "1950", "English", "Drama",
            16, 100, 8, 20, 150);
    Book book3 = new Book("times", "robrt green", "2010", "English", "social",
            17, 650, 6, 20, 600);
    Book book4 = new Book("lion", "vector hugo", "1967", "french", "novel",
            18, 90, 6, 5, 250);

    
    public Constant() {
        readers.add(Reader1);
        readers.add(Reader2);
        employees.add(Admin1);
        employees.add(Admin2);
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

    }

    
}
