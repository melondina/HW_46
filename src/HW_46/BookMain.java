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
        books.add(new Book("C", "A", 50));
        books.add(new Book("B", "A", 240));


        books.sort(new BookTitleComparator());
        for (Book book : books) {
            System.out.println(book);
        }
    }
}