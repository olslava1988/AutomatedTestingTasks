package com.epam.parking;
import java.util.Random;
import org.apache.log4j.Logger;

public class ParkingPlace {
    private static final Logger log = Logger.getLogger(ParkingPlace.class);
    public Car car;

    public Car getCar() {
        return car;
    }
    public void setCar(Car car) {
        this.car = car;
    }

    public void reserve() {
        try {
           Thread.sleep(new Random().nextInt(10000));
        } catch (Exception e) {
            e.printStackTrace();
        }
        log.info("Сообщение о нахождении автомобиля на парковочном месте");
    }
}