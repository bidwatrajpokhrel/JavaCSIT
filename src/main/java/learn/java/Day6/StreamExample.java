package learn.java.Day6;

import learn.java.Day5.Array.Array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

    public static Boolean isNumberEven(Integer value) {
        if (value%2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> integerList = new ArrayList<>();

        integerList.addAll(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        List<Integer> evenNumberList = integerList.stream().filter(item -> item%2==0).collect(Collectors.toList());

        System.out.println(evenNumberList);
        List<Integer> multipliedBy2 = integerList.stream().map(item -> item*2).collect(Collectors.toList());

//        System.out.println(multipliedBy2);
//        ArrayList<Integer> evenIntegers = (ArrayList<Integer>) integerList.stream().filter(i -> i%2==0).collect(Collectors.toList());
//        List<Integer> evenIntegers = integerList.stream().filter(item -> item%2==0).collect(Collectors.toList());
//
//
//        System.out.println(evenIntegers);
//
//        List<Integer> multipliedBy2 = integerList.stream().map(item -> item * 2).collect(Collectors.toList());
//        System.out.println(multipliedBy2);

//        List<Integer> oddMultipliedBy3 = integerList.stream()
//                .filter(item -> item%2 != 0)
//                .map(item -> item *3)
//                .collect(Collectors.toList());
//
//        System.out.println(oddMultipliedBy3);


//        List<Integer> aaaa = integerList.stream().map(item -> 1500).collect(Collectors.toList());
//        System.out.println(aaaa);
    }

}
