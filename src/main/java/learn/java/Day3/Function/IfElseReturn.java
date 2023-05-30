package learn.java.Day3.Function;

public class IfElseReturn {
    public static void main(String[] args) {
        String pno = positiveNegativeZero(2);
        System.out.println(pno);
    }

    public static String positiveNegativeZero(Integer value) {
        if(value > 0) {
            return "positive";
        }

        if ( value < 0) {
            return "negative";
        } else {
            return "zero";
        }
    }
}
