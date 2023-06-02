package learn.java.Day5.Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
//        ArrayList<Integer> integerList = new ArrayList<>();
//        integerList.add(1);
//        integerList.add(2);
//        integerList.add(3);
//
//        System.out.println(integerList.size());
//
//        integerList.add(4);
//        integerList.add(5);
//
//        System.out.println(integerList.size());


        ArrayList<Integer> values = new ArrayList<>();
        values.addAll(List.of(1,32,3,4,52342,234,2,3,32,34,2,23));
        System.out.println( values.size());

        Integer third = values.get(2);
        System.out.println(third);

        values.add(1,5);
        System.out.println(values.get(1));

        //TBD
        values.remove(1);
        System.out.println(values);


//        for (Integer value: values) {
//            System.out.println("item: " + value);
//            System.out.println("index: " + values.indexOf(value));
//        }

        System.out.println(values.indexOf(23));

        System.out.println("Values below");
        values.forEach(value -> {
            System.out.println(value);
        });


        LinkedList<Integer> linked = new LinkedList<Integer>();
        linked.add(2);
        linked.add(3);
        values.addAll(List.of(1,32,3,4,52342,234,2,3,32,34,2,23));


        ArrayList<Integer> duplicates = new ArrayList<Integer>();
        duplicates.addAll(List.of(1,2,1,3,4,3,5,6));

        HashSet<Integer> set = new HashSet<Integer>();
        set.addAll(duplicates);

        System.out.println("Set: ");
        System.out.println(set);
    }

}