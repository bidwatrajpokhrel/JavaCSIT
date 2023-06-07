package learn.java.Day9.animalKingdom;

public class Ostrich extends Bird{

    Ostrich() {
        super("Ostrich");
    }

    @Override
    public void fly() {
        System.out.println(":( Ostriches can't fly! :( ");
    }

    public void enableFlight() {
        super.fly();
    }
}
