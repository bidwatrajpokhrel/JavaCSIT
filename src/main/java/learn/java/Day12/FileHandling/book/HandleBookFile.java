package learn.java.Day12.FileHandling.book;

import learn.java.Day12.Library.Book;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class HandleBookFile {

    public static HashMap<Integer, Book> read() {
        HashMap<Integer, Book> bookHashMap = new HashMap<>();

        try {
            File file = new File("files/book.csv");
            Scanner dataReader = new Scanner(file);

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

        } catch (FileNotFoundException e) {
            System.out.println("error occurred! Cannot read book.csv ");
            e.printStackTrace();
        }

        return bookHashMap;
    }

    public static void append(Book book) {
        String fileName = "files/book.csv";

        try {
            FileWriter fileWriter = new FileWriter(fileName, true);
            File file = new File(fileName);

            if (file.exists() && file.length() > 0) {
                fileWriter.write(System.lineSeparator());
            }

            String data = book.getId() + "," +
                    book.getName() + "," +
                    book.getAuthor();

            fileWriter.write(data);
            fileWriter.close();

        } catch (IOException e) {
            System.out.println("Error while creating book. Please try again.");
            e.printStackTrace();
        }
    }
}
