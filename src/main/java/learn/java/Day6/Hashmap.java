package learn.java.Day6;

import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> studentSymbol = new HashMap<>();
        studentSymbol.put(12345, "Bidwat");
        studentSymbol.put(1234565, "Pema");
        studentSymbol.put(12312, "Monu");
        studentSymbol.put(99912, "Diwas");


        String studentName = studentSymbol.get(99912);
        System.out.println(studentName);


        HashMap<String, Integer> alternateStudentSymbol = new HashMap<>();
        alternateStudentSymbol.put("Bidwat", 12345);
        alternateStudentSymbol.put("Pema", 1234565);
        alternateStudentSymbol.put("Diwas", 12312);
        alternateStudentSymbol.put("Monu", 99912);
        alternateStudentSymbol.put("Monu", 2);

        Integer symbolNumber = alternateStudentSymbol.get("Monu");
        System.out.println(symbolNumber);
    }
}
