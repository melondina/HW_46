package HW_46;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookMain {
    public static void main(String[] args) {


        List<Book> books = new ArrayList<>();

        books.add(new Book("A", "A", 250));
        books.add(new Book("C", "C", 50));
        books.add(new Book("B", "A", 50));


        System.out.println("Books sorted by Title: ");
        books.sort(new BookTitleComparator());
        for (Book book : books) {
            System.out.println(book);
        }

        System.out.println("Books sorted by Pages: ");
        books.sort(new BookPageComparator());
        for (Book book : books) {
            System.out.println(book);
        }
    }
}