package Planes;

import java.util.Objects;

public class PassengerPlane extends Plane{

   	private int passengersCapacity;

    public PassengerPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, int passengersCapacity) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.passengersCapacity = passengersCapacity;
    }

    public int getPassengersCapacity() {
        return passengersCapacity;
    }

	@Override
    public String toString() {
        return "Plane}" +
                ", passengersCapacity=" + passengersCapacity +
                '}';
    }

	@Override
    public boolean equals(Object passengerPlane) {
        PassengerPlane passengerPlane = new PassengerPlane();
        print (passengerPlane instanceof PassengerPlane);
        return passengersCapacity == plane.passengersCapacity;
    }

	@Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), passengersCapacity);
    }
}
