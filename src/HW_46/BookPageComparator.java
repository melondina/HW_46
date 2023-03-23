package HW_46;

import java.util.Comparator;

public class BookPageComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        Integer page1 = o1.getNumberPages();
        Integer page2 = o2.getNumberPages();
        if(!page1.equals(page2)) {
            return page2 - page1;
        }
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
