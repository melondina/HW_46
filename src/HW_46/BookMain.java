package HW_46;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookMain {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the number of books: ");
        int n = Integer.parseInt(br.readLine());

        List<Book> books = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            books.add(Book.readBook());
        }

        Collections.sort(books);
        for (Book book : books) {
            System.out.println(book);
        }
    }
}