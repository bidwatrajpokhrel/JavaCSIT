package learn.java.Day3.Function;

public class Stack {
    public static void main(String[] args) {
        System.out.println(functionA(1));
    }
    public static Integer functionA(Integer number) {
        Integer result = functionB(number);
        return result + number;
    }
    public static Integer functionB(Integer number) {
        Integer result = functionC(number);
        return result + number;
    }
    public static Integer functionC(Integer number) {
        Integer result = functionD(number);
        return result + number;
    }
    public static Integer functionD(Integer number) {
        return  number;
    }

}
