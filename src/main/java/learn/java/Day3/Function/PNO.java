package learn.java.Day3.Function;

public class PNO {
        public static void main(String[] args) {
//             positiveNegativeZero(2);
//            loopTo(10);
            recursion(10);
        }

        public static void recursion(Integer a) {
            System.out.println(a);
            a++;
            if(a > 20) {
                return;
            }
            recursion(a);
        }

    public static void loopTo(Integer value) {

        for(int i = 0; ; i++) {
            if(i > value) {
                return;
            }

            System.out.println(i);
        }
    }
        public static void positiveNegativeZero(Integer value) {
            if(value > 0) {
                System.out.println("positve");
                return;
            }

            if ( value < 0) {
                System.out.println("negative");
            } else {
                System.out.println("zero");
            }
        }


}
