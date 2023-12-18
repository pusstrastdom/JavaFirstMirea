package ru.mirea.task2.task2_7;

public class BookShelf {
    public Book[] books;
    private int bookCount;

    public int getBookCount() {
        return bookCount;
    }

    public void setBookCount(int bookCount) {
        this.bookCount = bookCount;
    }

    public BookShelf(int capacity) {
        books = new Book[capacity];
        bookCount = 0;
    }

    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;
        } else {
            System.out.println("Книжная полка полна, невозможно добавить больше книг.");
        }
    }

    public Book findLatestBook() {
        Book latestBook = null;
        for (int i = 0; i < bookCount; i++) {
            if (latestBook == null || books[i].getYear() > latestBook.getYear()) {
                latestBook = books[i];
            }
        }
        return latestBook;
    }

    public Book findEarliestBook() {
        Book earliestBook = null;
        for (int i = 0; i < bookCount; i++) {
            if (earliestBook == null || books[i].getYear() < earliestBook.getYear()) {
                earliestBook = books[i];
            }
        }
        return earliestBook;
    }

    public void sortBooksByYear() {
        for (int i = 0; i < bookCount - 1; i++) {
            for (int j = 0; j < bookCount - i - 1; j++) {
                if (books[j].getYear() > books[j + 1].getYear()) {
                    Book temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }
    }
}