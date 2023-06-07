package learn.java.Day10.Vehiles;

public class Main {

    public static Integer number = 0;
    public static void main(String[] args) {
        Vehicle vehicle1 = getVehicle();
        vehicle1.drive();
//        vehicle1.carryLoad();

        Truck truck = new Truck();
        truck.carryLoad();
    }

    public static Vehicle getVehicle() {
        number++;
        if(number % 2 == 0) {
            return new Car();
        }

        return new Truck();
    }
}
