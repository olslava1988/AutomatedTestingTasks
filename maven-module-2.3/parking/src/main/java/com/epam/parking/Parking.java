package com.epam.parking;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public class Parking {
    private static final Logger log = Logger.getLogger(Parking.class);
    private final static int MAX_ATTEMPTS_COUNT = 5;
    private int count = 0;

    List<ParkingPlace> places = new ArrayList<ParkingPlace>();

    public Parking(List<ParkingPlace> places) {
        this.places.addAll(places);
    }

    public synchronized ParkingPlace tryReserve(Car car, int waitingTime) {
        for (ParkingPlace place : places) {
            if (searchFreeParkingPlace(place, car)) {
                return place;
            }
        }
        try {
            count++;
            if (checkAttemptsCount(waitingTime)) {
                return null;
            }else{
                return tryReserve(car, waitingTime);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public synchronized void endReserve(ParkingPlace place) {
        place.setCar(null);
        places.add(place);
        notify();
        log.info("Сообщение о поиске свободного места");
    }

    private synchronized boolean checkAttemptsCount(int waitingTime) throws InterruptedException {
        if (count == MAX_ATTEMPTS_COUNT) {
            return true;
        } else {
            wait(waitingTime);
        }
        return false;
    }

    private boolean searchFreeParkingPlace(ParkingPlace place, Car car) {
        if (place.getCar() == null) {
            place.setCar(car);
            places.remove(place);
            return true;
        }
        return false;
    }
}
