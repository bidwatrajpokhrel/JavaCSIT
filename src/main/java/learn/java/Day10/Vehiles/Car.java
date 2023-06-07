package learn.java.Day10.Vehiles;

public class Car implements Vehicle {

    @Override
    public void drive() {
        System.out.println("Drive");
    };

    @Override
    public void stop() {
        System.out.println("Stop");
    };

    @Override
    public void fuel() {
        System.out.println("Fuel");
    };

    @Override
    public void service() {
        System.out.println("Service");
    };

    @Override
    public void horn() {
        System.out.println("Horn");
    };

    public void turnOnHeadlight() {
        System.out.println("Headlight On");
    };

}
