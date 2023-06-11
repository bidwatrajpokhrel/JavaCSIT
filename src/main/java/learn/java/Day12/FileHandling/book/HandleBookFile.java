package learn.java.Day12.FileHandling.book;

import learn.java.Day12.Library.Book;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class HandleBookFile {

    public static HashMap<Integer, Book> read() {
        try {
            File file = new File("files/book.csv");
            Scanner dataReader = new Scanner(file);

            HashMap<Integer, Book> bookHashMap = new HashMap<>();
            while (dataReader.hasNextLine()) {
                String line = dataReader.nextLine();
                if (!line.trim().isEmpty()) {
                    String[] bookInfo = line.split(",");
                    Integer id = Integer.parseInt(bookInfo[0]);
                    String name = bookInfo[1];
                    String author = bookInfo[2];

                    Book book = new Book(id, name, author);

                    bookHashMap.put(book.getId(), book);
                }
            }
            dataReader.close();
            return bookHashMap;
        } catch (FileNotFoundException exception) {
            System.out.println("error occurred!");
            exception.printStackTrace();
        }
    }
}
