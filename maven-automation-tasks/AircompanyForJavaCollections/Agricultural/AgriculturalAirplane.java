package com.javaweb.model.entity.agricultural;
import com.javaweb.controller.InitializeAirplanes;
import com.javaweb.model.entity.Aircraft;

public abstract class AgriculturalAirplane extends Aircraft {
    private double amountOfPesticides;
    private double sprayingAreaSquare;
    protected double landingSpeed;
    protected double takeOffSpeed;
    public AgriculturalAirplane(InitializeAirplanes init) {
        super(init);
        this.amountOfPesticides = init.getAmountOfPesticides();
        this.sprayingAreaSquare = init.getSprayingAreaSquare();
    }
    public void setAmountOfPesticides(double amountOfPesticides) {
        this.amountOfPesticides = amountOfPesticides;
    }
    public void setSprayingAreaSquare(double sprayingAreaSquare) {
        this.sprayingAreaSquare = sprayingAreaSquare;
    }
    protected abstract void setLandingSpeed(double speed);
    protected abstract void setTakeOffSpeed(double speed);
    public double getLandingSpeed() {
        return landingSpeed;
    }
    public double getTakeOffSpeed() {
        return takeOffSpeed;
    }
    public double getSprayingAreaSquare() {
        return sprayingAreaSquare;
    }
    public double getAmountOfPesticides() {
        return amountOfPesticides;
    }
    @Override
    public String toString() {
        return super.toString() +
                String.format(bundle.getString("AMOUNT_OF_PESTICIDES"), amountOfPesticides) +
                String.format(bundle.getString("SPRAYING_AREA_SQUARE"), sprayingAreaSquare) +
                String.format(bundle.getString("LANDING_SPEED"), landingSpeed) +
                String.format(bundle.getString("TAKEOFF_SPEED"), takeOffSpeed);
    }
}
