package com.epam.parking;
import org.apache.log4j.Logger;

public class Car implements Runnable{
    private static final Logger log = Logger.getLogger(Car.class);

    private static final int WAITING_TIME = 10000;
    private final Parking parking;

    public Car(Parking parking){
        this.parking = parking;
    }

    public void run(){
        ParkingPlace parkingPlace = null;
        try {
            parkingPlace = parking.tryReserve(this, WAITING_TIME);

            if(parkingPlace == null){
                return;
            }
            parkingPlace.reserve();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (parkingPlace != null) {
                parking.endReserve(parkingPlace);
            }
        }
        log.info("Сообщение об автомобиле");
    }
}
