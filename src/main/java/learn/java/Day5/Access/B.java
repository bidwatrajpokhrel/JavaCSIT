package learn.java.Day5.Access;

public class B {
    private void function2 (){
        Car car = new Car();
        car.setOilTankVolume(10f);
        System.out.println("Car tank volume :" + car.getOilTankVolume());
        System.out.println("Car wheel diameter :" + car.getWheelDiameter());


    }

    public static void main(String[] args) {
        B b = new B();
        b.function2();
    }
}
