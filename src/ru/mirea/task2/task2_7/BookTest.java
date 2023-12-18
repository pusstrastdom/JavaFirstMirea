package ru.mirea.task2.task2_7;

public class BookTest {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(5);

        Book book1 = new Book("Book1", "Author1", 1990);
        Book book2 = new Book("Book2", "Author2", 2000);
        Book book3 = new Book("Book3", "Author3", 1985);

        bookShelf.addBook(book1);
        bookShelf.addBook(book2);
        bookShelf.addBook(book3);

        Book latestBook = bookShelf.findLatestBook();
        System.out.println("Самая поздняя книга: " + latestBook.getTitle() + " (" + latestBook.getYear() + ")");

        Book earliestBook = bookShelf.findEarliestBook();
        System.out.println("Самая ранняя книга: " + earliestBook.getTitle() + " (" + earliestBook.getYear() + ")");

        bookShelf.sortBooksByYear();
        System.out.println("Книги на книжной полке, отсортированные по году издания:");
        for (int i = 0; i < bookShelf.getBookCount(); i++) {
            System.out.println(bookShelf.books[i].getTitle() + " (" + bookShelf.books[i].getYear() + ")");
        }
    }
}