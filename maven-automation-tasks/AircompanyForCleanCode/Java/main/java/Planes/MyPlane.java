package Planes;

import java.util.Objects;

public class MyPlane  extends Plane {
	
	private int sideNumber;
	
    public MyPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, int sideNumber) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
		this.sideNumber = sideNumber;
    }

	public int getSideNumber() {
        return sideNumber;
    }

	@Override
    public String toString() {
        return "Plane}" +
                ", sideNumber=" + sideNumber +
                '}';
    }

	@Override
    public boolean equals(Object myPlane) {
        MyPlane myPlane = new MyPlane();
        print (myPlane instanceof MyPlane);
        return sideNumber == plane.sideNumber;
    }

	@Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), sideNumber);
    }
}
    

