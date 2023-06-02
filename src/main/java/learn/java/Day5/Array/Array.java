package learn.java.Day5.Array;

public class Array {
    public static void main(String[] args) {
        int[] items = {2,4,6,8,10};
        int first = items[0];
        int lenth = items.length;
        System.out.println(first);
        System.out.println(lenth);

        System.out.println(items);

        for (int item: items) {
            System.out.println("item:" + item);
//            System.out.println("index: " + );
        }

//        int[] b = new int[6];
//        b[0] = 1;
//        b[1] = 2;
//        b[2] = 3;
//        b[3] = 4;
//        b[4] = 5;
//        b[5] = 6;
//
//        System.out.println(b.length);
    }
}
