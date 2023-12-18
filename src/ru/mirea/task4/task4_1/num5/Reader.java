package ru.mirea.task4.task4_1.num5;

// Класс "Читатели библиотеки"
class Reader {
    private String fullName;
    private int readerTicket;
    private String faculty;
    private String birthDate;
    private String phoneNumber;

    public Reader(String fullName, int readerTicket, String faculty, String birthDate, String phoneNumber) {
        this.fullName = fullName;
        this.readerTicket = readerTicket;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int count) {
        System.out.println(fullName + " взял " + count + " книги");
    }

    public void takeBook(String... bookNames) {
        System.out.print(fullName + " взял книги: ");
        for (String bookName : bookNames) {
            System.out.print(bookName + ", ");
        }
        System.out.println();
    }

    public void takeBook(Book... books) {
        System.out.print(fullName + " взял книги: ");
        for (Book book : books) {
            System.out.print(book.getTitle() + " (" + book.getAuthor() + "), ");
        }
        System.out.println();
    }

    public void returnBook(int count) {
        System.out.println(fullName + " вернул " + count + " книги");
    }

    public void returnBook(String... bookNames) {
        System.out.print(fullName + " вернул книги: ");
        for (String bookName : bookNames) {
            System.out.print(bookName + ", ");
        }
        System.out.println();
    }

    public void returnBook(Book... books) {
        System.out.print(fullName + " вернул книги: ");
        for (Book book : books) {
            System.out.print(book.getTitle() + " (" + book.getAuthor() + "), ");
        }
        System.out.println();
    }
}