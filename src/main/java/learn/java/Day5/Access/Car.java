package learn.java.Day5.Access;

public class Car {

    private Float wheelDiameter;

    private Float oilTankVolume;

    public void setOilTankVolume(Float oilTankVolume) {
        this.oilTankVolume = oilTankVolume;
        this.wheelDiameter =  oilTankVolume/2;
    }

    public Float getOilTankVolume() {
        return this.oilTankVolume;
    }

    public Float getWheelDiameter() {
        return this.wheelDiameter;
    }
}
