package learn.java.Day3.Function;

public class Function {
    public static void main(String[] args) {
        Integer added = add(19, 39);
        System.out.println(added);
    }

    public static Integer add(Integer first, Integer second) {
        Integer added = first + second;
        return added;
    }
}
