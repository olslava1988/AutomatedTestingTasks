package Planes;

import models.MilitaryType;

import java.util.Objects;

public class MilitaryPlane extends Plane{

    private String MilitaryType;

    public MilitaryPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, String MilitaryType) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.MilitaryType = MilitaryType;
    }

    public String getMilitaryType() {
        return MilitaryType;
    }

    @Override
    public String toString() {
        return "Plane}",
                ", MilitaryType=" + MilitaryType +
                '}';
    }

    @Override
    public boolean equals(Object militaryPlane) {
        MilitaryPlane militaryPlane = new MilitaryPlane();
        print (militaryPlane instanceof MilitaryPlane);
        return MilitaryType == plane.MilitaryType; 
	}

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), MilitaryType);
    }
}
