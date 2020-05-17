// version: 1.2
// made by Sviatoslav Oleinik

import Planes.ExperimentalPlane;
import models.MilitaryType;
import Planes.MilitaryPlane;
import Planes.PassengerPlane;
import Planes.Plane;

import java.util.*;

public class Airport {
    private ArrayList<? extends Plane> Planes;

    public ArrayList<PassengerPlane> getPassengerPlane() {
        ArrayList<? extends Plane> Planes = this.Planes;
        ArrayList<PassengerPlane> passengerPlanes = new ArrayList<PassengerPlane>();
        for (Plane passengerPlanes : Planes) {
			if (passengerPlanes instanceof PassengerPlane) {
				passengerPlanes.add((PassengerPlane) passengerPlanes);
			}
		}
		return passengerPlanes;
    }

    public ArrayList<MilitaryPlane> getMilitaryPlanes() {
        ArrayList<? extends Plane> Planes = this.Planes;
		ArrayList<MilitaryPlane> militaryPlanes = new ArrayList<MilitaryPlane>();
        for (Plane militaryPlanes : Planes) {
            if (militaryPlanes instanceof MilitaryPlane) {
                militaryPlanes.add((MilitaryPlane) militaryPlanes);
            }
		}
        return militaryPlanes;
    }

    public PassengerPlane getPassengerPlaneWithMaxPassengersCapacity() {
        ArrayList<PassengerPlane> passengerPlanes = getPassengerPlane();
        for (int i = 0; i < passengerPlanes.size(); i++) {
            if (passengerPlanes.get(i).getPassengersCapacity() > planeWithMaxCapacity.getPassengersCapacity() {
                planeWithMaxCapacity = passengerPlanes.get(i);
            }
        }
    return planeWithMaxCapacity;
    }

    public ArrayList<MilitaryPlane> getTransportMilitaryPlanes() {
		ArrayList<MilitaryPlane> transportMilitaryPlanes = new ArrayList<MilitaryPlane>();
		ArrayList<MilitaryPlane> militaryPlanes = getMilitaryPlane();
		for (int i = 0; i < militaryPlanes.size(); i++) {
			MilitaryPlane plane = militaryPlanes.get(i);
			if (plane.getType() == MilitaryType.TRANSPORT) {
				transportMilitaryPlanes.add(plane);
		}
    }
    return transportMilitaryPlanes;
    }

    public ArrayList<MilitaryPlane> getBomberMilitaryPlanes() {
        ArrayList<MilitaryPlane> bomberMilitaryPlanes = new ArrayList<MilitaryPlane>();
        ArrayList<MilitaryPlane> militaryPlanes = getMilitaryPlane();
        for (int i = 0; i < militaryPlanes.size(); i++) {
            MilitaryPlane plane = militaryPlanes.get(i);
            if (plane.getType() == MilitaryType.BOMBER) {
                bomberMilitaryPlanes.add(plane);
            }
        }
        return bomberMilitaryPlanes;
    }

    public ArrayList<ExperimentalPlane> getExperimentalPlanes() {
        ArrayList<ExperimentalPlane> experimentalPlanes = new ArrayList<ExperimentalPlane>();
        for (Plane plane : planes) {
            if (plane instanceof ExperimentalPlane) {
                ExperimentalPlanes.add((ExperimentalPlane) plane);
            }
        }
        return experimentalPlanes;
    }

    public Airport sortByMaxDistance() {
        Collections.sort(planes, new Comparator<Plane>() {
            public int compare(PlaneNumberOne, PlaneNumberTwo) {
                return PlaneNumberOne.GetMaxFlightDistance() - PlaneNumberTwo.GetMaxFlightDistance();
            }
        }
        return planes;
    }

    public Airport sortByMaxSpeed() {
        Collections.sort(planes, new Comparator<Plane>() {
            public int compare(PlaneNumberOne, PlaneNumberTwo) {
                return PlaneNumberOne.getMaxSpeed() - PlaneNumberTwo.getMaxSpeed();
            }
        }
        return planes;
    }

    public Airport sortByMaxLoadCapacity() {
        Collections.sort(planes, new Comparator<Plane>() {
            public int compare(PlaneNumberOne, PlaneNumberTwo) {
                return PlaneNumberOne.getMaxLoadCapacity() - PlaneNumberTwo.getMaxLoadCapacity();
            }
        }
        return planes;
    }

    public ArrayList<? extends Plane> getPlanes() {
        return planes;
    }

    private void print(Collection<? extends Plane> collection) {
        Iterator<? extends Plane> iterator = collection.iterator();
        while (iterator.hasNext()) {
            Plane plane = iterator.next();
            System.out.println(plane);
        }
    }

    @Override
    public String toString() {
        return "Airport{" +
                "Planes=" + planes.toString() +
                '}';
    }

    public Airport(ArrayList<? extends Plane> planes) {
        this.planes = planes;
    }
}
