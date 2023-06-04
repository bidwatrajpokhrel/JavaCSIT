package learn.java.Day8;

public class Planet {


    private String name;
    private Float mass;
    private Integer numberOfSattelites;

    public Planet(String name, Float mass, Integer numberOfSattelites) {
        this.name = name;
        this.mass = mass;
        this.numberOfSattelites = numberOfSattelites;
    }

    public Planet(Planet copyPlanet) {
        this.name = copyPlanet.name;
        this.mass = copyPlanet.mass;
        this.numberOfSattelites = copyPlanet.numberOfSattelites;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getMass() {
        return this.mass;
    }

    public void setMass(Float mass) {
        this.mass = mass;
    }

    public Integer getNumberOfSattelites() {
        return this.numberOfSattelites;
    }

    public void setNumberOfSattelites(Integer numberOfSattelites) {
        this.numberOfSattelites = numberOfSattelites;
    }

    public Boolean equals(Planet planet2) {
        Boolean isEqual = this.name.equals(planet2.getName())
                && this.mass.equals(planet2.getMass())
                && this.numberOfSattelites.equals(planet2.getNumberOfSattelites());

        return isEqual;
    }
}
