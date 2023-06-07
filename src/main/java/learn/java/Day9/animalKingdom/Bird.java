package learn.java.Day9.animalKingdom;

public class Bird {

    private String name;

    Bird(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void fly() {
        System.out.println("FLYING!!!!!");
    }

}
