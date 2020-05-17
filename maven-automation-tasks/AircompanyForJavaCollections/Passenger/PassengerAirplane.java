package com.javaweb.model.entity.passenger;
import com.javaweb.controller.InitializeAirplanes;
import com.javaweb.model.entity.Aircraft;

public abstract class PassengerAirplane extends Aircraft {
    private double fuselageDiameter;
    private double fuselageLength;
    private ComfortGrade comfortGrade;
    private static final double FUSELAGE_DIAMETER_WIDE1 = 5.0;
    private static final double FUSELAGE_DIAMETER_WIDE2 = 10.0;
    private static final double FUSELAGE_DIAMETER_NARROW = 4.0;
    protected enum ComfortGrade {
        FIVE_STAR("\u2605\u2605\u2605\u2605\u2605"),
        FOUR_STAR("\u2605\u2605\u2605\u2605"),
        THREE_STAR("\u2605\u2605\u2605"),
        TWO_STAR("\u2605\u2605"),
        ONE_STAR("\u2605");
        private final String starsString;
        ComfortGrade(String starsString) {
            this.starsString = starsString;
        }
        public String getStarsString() {
            return starsString;
        }
    }
    public abstract void checkComfort();
    public PassengerAirplane(InitializeAirplanes init) {
        super(init);
        this.fuselageDiameter = init.getFuselageDiameter();
        this.fuselageLength = init.getFuselageLength();
    }
    public static PassengerAirplane getInstancePassengerAirplane(
            InitializeAirplanes init) {
        if ((init.getFuselageDiameter() >= FUSELAGE_DIAMETER_WIDE1) &&
                (init.getFuselageDiameter() <= FUSELAGE_DIAMETER_WIDE2)) {
            return new PassengerWideFuselage(init);
        } else if (init.getFuselageDiameter() <= FUSELAGE_DIAMETER_NARROW) {
            return new PassengerNarrowFuselage(init);
        } else {
            return null;
        }
    }
    public double getFuselageDiameter() {
        return fuselageDiameter;
    }
    public void setFuselageDiameter(double fuselageDiameter) {
        this.fuselageDiameter = fuselageDiameter;
    }
    public double getFuselageLength() {
        return fuselageLength;
    }
    public void setFuselageLength(double fuselageLength) {
        this.fuselageLength = fuselageLength;
    }
    public String getComfortGrade() {
        return comfortGrade.getStarsString();
    }
    public void setComfortGrade(ComfortGrade comfortGrade) {
        this.comfortGrade = comfortGrade;
    }
    @Override
    public String toString() {
        return super.toString() +
                String.format(bundle.getString(
                        "FUSELAGE_DIAMETER"), fuselageDiameter) +
                String.format(bundle.getString(
                        "FUSELAGE_LENGTH"), fuselageLength) +
                String.format(bundle.getString(
                        "COMFORT_QUALITY"), comfortGrade);
    }
}
