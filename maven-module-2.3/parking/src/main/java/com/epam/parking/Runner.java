package com.epam.parking;
import java.util.ArrayList;
import java.util.List;

public class Runner {
    private final static int NUMBER_OF_PARKING_PLACES = 5;
    private final static int NUMBER_OF_CARS = 8;

    public static void main(String[] args) {
        List<ParkingPlace> places = new ArrayList<ParkingPlace>();
        for (int i = 1; i <= NUMBER_OF_PARKING_PLACES; i++) {
            places.add(new ParkingPlace());
        }
        Parking parking = new Parking(places);
        for (int i = 1; i <= NUMBER_OF_CARS; i++) {
            Thread thread = new Thread(new Car(parking));
            thread.start();
        }
    }
}
