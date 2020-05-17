package Planes;

import models.ClassificationLevel;
import models.ExperimentalTypes;

public class ExperimentalPlane extends Plane{

    private String ExperimentalTypes;
    private String ClassificationLevel;

    public ExperimentalPlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, String ExperimentalTypes, String ClassificationLevel) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.ExperimentalTypes = ExperimentalTypes;
        this.ClassificationLevel = ClassificationLevel;
    }

    public String getExperrimentalTypes(){
        return ExperimentalTypes;
    }
	
	public String getClassificationLevel(){
        return ClassificationLevel;
    }

    @Override
    public String toString() {
        return "Plane{" +
                "ExperimentalTypes='" + ExperimentalTypes + '\'' +
                ", ClassificationLevel=" + ClassificationLevel +
                '}';
    }
	
	@Override
    public boolean equals(Object experimentalPlane) {
        ExperimentalPlane experimentalPlane = new ExperimentalPlane();
        print (experimentalPlane instanceof ExperimentalPlane);
        return ExperimentalTypes == plane.ExperimentalTypes &&
               ClassificationLevel == plane.ClassificationLevel;
	}

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), ExperimentalTypes, ClassificationLevel);
    }
}
