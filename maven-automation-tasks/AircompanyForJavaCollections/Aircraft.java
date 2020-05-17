package com.javaweb.model.entity;
import com.javaweb.controller.InitializeAirplanes;
import java.util.ResourceBundle;

public abstract class Aircraft {
    private String name;
    private AirplaneType airplaneType;
    private ManufacturerCountry manufacturerCountry;
    private int engineQuantity;
    private double maxSpeed;
    private boolean hasPilot;
    private long price;
    private double fuelConsumption;
    private double rangeOfFlight;
    private int passengerCapacity;
    private double carryingCapacity;
    protected ResourceBundle bundle
            = ResourceBundle.getBundle("com/javaweb/AircraftParameters");
    public enum ManufacturerCountry {
        USSR, FRANCE, USA, GERMANY
    }
    public Aircraft(InitializeAirplanes init) {
        setName(init.name());
        setAirplaneType(init.getAirplaneType());
        setManufacturerCountry(init.getManufacturerCountry());
        setEngineQuantity(init.getEngineQuantity());
        setPassengerCapacity(init.getPassengerCapacity());
        setCarryingCapacity(init.getCarryingCapacity());
        setMaxSpeed(init.getMaxSpeed());
        setHasPilot(init.hasPilot());
        setPrice(init.getPrice());
        setFuelConsumption(init.getFuelConsumption());
        setRangeOfFlight(init.getRangeOfFlight());
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setManufacturerCountry(ManufacturerCountry manufacturerCountry) {
        this.manufacturerCountry = manufacturerCountry;
    }
    public void setEngineQuantity(int engineQuantity) {
        this.engineQuantity = engineQuantity;
    }
    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public void setHasPilot(boolean hasPilot) {
        this.hasPilot = hasPilot;
    }
    public void setPrice(long price) {
        this.price = price;
    }
    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
    public void setRangeOfFlight(double rangeOfFlight) {
        this.rangeOfFlight = rangeOfFlight;
    }
    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }
    public void setCarryingCapacity(double carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }
    public void setAirplaneType(AirplaneType airplaneType) {
        this.airplaneType = airplaneType;
    }
    public String getName() {
        return name;
    }
    public ManufacturerCountry getManufacturerCountry() {
        return manufacturerCountry;
    }
    public int getEngineQuantity() {
        return engineQuantity;
    }
    public double getMaxSpeed() {
        return maxSpeed;
    }
    public boolean isHasPilot() {
        return hasPilot;
    }
    public long getPrice() {
        return price;
    }
    public double getFuelConsumption() {
        return fuelConsumption;
    }
    public double getRangeOfFlight() {
        return rangeOfFlight;
    }
    public int getPassengerCapacity() {
        return passengerCapacity;
    }
    public double getCarryingCapacity() {
        return carryingCapacity;
    }
    public AirplaneType getAirplaneType() {
        return airplaneType;
    }
    @Override
    public String toString() {
        return String.format(bundle.getString("NAME_OF_AIRCRAFT"),name)  +
                String.format(bundle.getString("AIRPLANE_TYPE"),airplaneType) +
String.format(bundle.getString("MANUFACTURER_COUNTRY"),manufacturerCountry) +
                String.format(bundle.getString("ENGINE_QUANTITY"),engineQuantity) +
                String.format(bundle.getString("MAX_SPEED"),maxSpeed) +
                String.format(bundle.getString("HAS_PILOT"),hasPilot) +
                String.format(bundle.getString("PRICE"),price) +
                String.format(bundle.getString("FUEL_CONSUMPTION"),fuelConsumption) + String.format(bundle.getString("RANGE_OF_FLIGHT"),rangeOfFlight) +
String.format(bundle.getString("PASSENGER_CAPACITY"),passengerCapacity) +
String.format(bundle.getString("CARRYING_CAPACITY"),carryingCapacity);
    }
}
