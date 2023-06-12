package learn.java.Day12.Library;

import learn.java.Day12.Constants.MenuConstants;
import learn.java.Day12.FileHandling.book.HandleBookFile;
import learn.java.Day12.FileHandling.bookStudent.HandleStudentBookFile;
import learn.java.Day12.FileHandling.student.HandleStudentFile;

import java.util.*;

public class LibraryManagement {
    private static HashMap<Integer, Book> bookMap = new HashMap<Integer, Book>();
    private static HashMap<Integer, Student> studentMap = new HashMap<Integer, Student>();
    public static void main(String[] args) {
        loadBooks();
        loadStudents();
        loadStudentBooks();
        Scanner scanner = new Scanner(System.in);
        Menu.handleMainMenu(scanner);
        scanner.close();
    }

    public static Book addBook(String name, String author) {
        Book book = new Book(name, author);
        storeBook(book);
        return book;
    }
    public static Student addStudent(String name) {
        Student student = new Student(name);
        storeStudent(student);
        return student;
    }
    public static void viewStudentList() {
        System.out.println("ID, NAME, BOOKS");
        for (HashMap.Entry<Integer, Student> student : studentMap.entrySet()) {
            System.out.println(
                    student.getKey() + ", " +
                    student.getValue().getName() + ", " +
                    student.getValue().getBorrowedBooks()
                    );
        }
    }
    public static void viewBookList() {
        System.out.println("ID, NAME, AUTHOR");
        bookMap.forEach((id, book) -> {
            System.out.println(
                    book.getId() + ", " +
                    book.getName() + ", " +
                    book.getAuthor()
            );
        });
    }

    public static void studentBorrowsBook(Integer studentId, Integer bookId) {
        Student student = studentMap.get(studentId);
        Book book = bookMap.get(bookId);

        student.borrowBook(book);
        storeBorrowedBook(studentId, bookId);
    }
    public static void studentReturnsBook(Integer studentId, Integer bookId) {
        Student student = studentMap.get(studentId);
        Book book = bookMap.get(bookId);

        student.returnBook(book);
        storeReturnedBook(studentId, bookId);
    }

    private static void storeBook(Book book) {
        bookMap.put(book.getId(), book);
        HandleBookFile.append(book);
    }
    private static void storeStudent(Student student) {
        studentMap.put(student.getId(), student);
        HandleStudentFile.append(student);
    }

    private static void storeBorrowedBook(Integer studentId, Integer bookId) {
        HandleStudentBookFile.append(studentId, bookId);
    }

    private static void loadBooks() {
        bookMap = HandleBookFile.read();
    }

    private static void loadStudents() {
        studentMap = HandleStudentFile.read();
    }

    private static void loadStudentBooks() {
        List<List<Integer>> studentBooksList = HandleStudentBookFile.read();

        studentBooksList.forEach((student_book_ids) -> {
            Student student = studentMap.get(student_book_ids.get(0));
            Book book = bookMap.get(student_book_ids.get(1));

            student.borrowBook(book);
        });
    }

    public static void storeReturnedBook(Integer studentId, Integer bookId) {
        List<List<Integer>> studentBookList = new ArrayList<>();

        studentMap.forEach((id, student)-> {
            if(student.getBorrowedBooks().isEmpty()){
                return;
            }

            List<Book> borrowedBooks = student.getBorrowedBooks();

            borrowedBooks.forEach(book-> {
                List<Integer> studentBookIds = new ArrayList<>();
                studentBookIds.add(student.getId());
                studentBookIds.add(book.getId());
                studentBookList.add(studentBookIds);
            });
        });

        HandleStudentBookFile.write(studentBookList);
    }
}
