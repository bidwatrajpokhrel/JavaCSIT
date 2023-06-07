package learn.java.Day10.Vehiles;

public class Truck implements Vehicle{
    @Override
    public void drive() {
        System.out.println("Truck Drive");
    };

    @Override
    public void stop() {
        System.out.println(" Truck Stop");
    };

    @Override
    public void fuel() {
        System.out.println("Truck Fuel");
    };

    @Override
    public void service() {
        System.out.println("Truck Service");
    };

    @Override
    public void horn() {
        System.out.println("Horn");
    };

    public void carryLoad() {
        System.out.println("Carry Load");
    }
}
