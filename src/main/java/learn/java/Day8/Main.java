package learn.java.Day8;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        Planet pluto = new Planet("Pluto", 123141f, 5);

        Planet pluto2 = new Planet("Pluto", 123141f, 5);

        Planet pluto3 = new Planet(pluto);
//        Planet pluto2 = pluto;

        System.out.println(pluto);
        System.out.println(pluto2);

//        System.out.println(pluto.equals(pluto2));

        Planet neptune = new Planet("Neptune", 2134234f, 14);
        Planet neptune2 = new Planet("Neptune", 2134234f, 14);

        System.out.println(neptune.equals(neptune2) && pluto.equals(neptune));




        System.out.println(pluto3.equals(pluto));

    }



}
