package learn.java.Day9.animalKingdom;

public class BirdMain {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
//        sparrow.fly();

        Pigeon pigeon = new Pigeon();
//        pigeon.fly();

        Ostrich ostrich = new Ostrich();
//        ostrich.fly();
        ostrich.enableFlight();
        System.out.println(ostrich.getName());
    }
}
