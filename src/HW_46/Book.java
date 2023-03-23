package HW_46;

//Создайте класс Book (книга), в конструктор которого передавайте
// автора, название книги и количество страниц.
//
//Реализуйте интерфейс для сравнения книг:
// они должны сортироваться по авторам,
// а если авторы совпадают - по названиям
// (и там, и там - по алфавиту, "в словарном порядке").

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Book implements Comparable<Book> {
    private String author;

    private String title;

    private int numberPages;

    public Book(String author, String title, int numberPages) {
        this.author = author;
        this.title = title;
        this.numberPages = numberPages;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberPages() {
        return numberPages;
    }


    @Override
    public String toString() {
        return author + " " + title + ": " + numberPages + "p.";
    }


    @Override
    public int compareTo(Book other) {
        if(!author.equals(other.author)) {
            return author.compareTo(other.author);
        }

        return title.compareTo(other.title);
    }
}
