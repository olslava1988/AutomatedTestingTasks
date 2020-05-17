package com.javaweb.controller;
import com.javaweb.model.ModelAirlineCompany;
import com.javaweb.model.entity.Aircraft;
import com.javaweb.model.entity.factory.AgriculturalAirplaneFactory;
import com.javaweb.model.entity.factory.FreightAirplaneFactory;
import com.javaweb.model.entity.factory.PassengerAirplaneFactory;
import com.javaweb.view.View;

import java.util.Scanner;

public class Controller {
    private View view;
    private ModelAirlineCompany<Aircraft> airlineCompany;
    private Scanner scanner;
    public Controller(View view, ModelAirlineCompany airlineCompany) {
        this.view = view;
        this.airlineCompany = airlineCompany;
        scanner = new Scanner(System.in);
    }
    public void processUser() {
        view.printlnMessage(View.HEADER);
        initializeAirlineCompany();
        view.printlnMessage(View.ALL_AIRPLANES);
        if (airlineCompany.getAllAirplanes().isEmpty()) {
            view.printlnMessage(View.EMPTY_AIRLINE_COMPANY);
        } else {
            showAllAirplanesAndStatistic();
        }
        showAirplanesByFuelConsumption();
    }
    private void showAllAirplanesAndStatistic() {
        airlineCompany.getAllAirplanes().stream()
                .forEach(elem -> {
                    view.printlnMessage(elem.toString());
                    view.printlnMessage(View.SEPARATOR);
                }
        view.printMessage(View.OVERALL_CARRYING_CAPACITY);
        view.printlnMessage(airlineCompany.getOverallCarryingCapacity());
        view.printMessage(View.OVERALL_PASSENGER_CAPACITY);
        view.printlnMessage(airlineCompany.getOverallPassengerCapacity());
    }
    private void showAirplanesByFuelConsumption() {
        view.printlnMessage(View.ENTER_FUEL_NUMBERS);
        view.printlnMessage(View.LOW_LIMIT_FUEL_CONSUMPTION);
        double lowLimitFuelConsumption = readNumberFromConsole();
        view.printlnMessage(View.HIGH_LIMIT_FUEL_CONSUMPTION);
        double highLimitFuelConsumption = readNumberFromConsole();
        view.printlnMessage(View.FUEL_CONSUMPTION_RESULT);
        airlineCompany.findAircraftWithFuelConsumption(
                lowLimitFuelConsumption, highLimitFuelConsumption).stream()
                .forEach(elem -> view.printlnMessage(elem.getName()));
    }
    private double readNumberFromConsole() {
        while (!scanner.hasNext(View.REGEX_NUMBER)) {
            view.printlnMessage(View.ERROR_INPUT);
            scanner.next();
        }
        return scanner.nextDouble();
    }
    private void initializeAirlineCompany() {
        for (InitializeAirplanes initValue : InitializeAirplanes.values()) {
            Aircraft aircraft = getAirplaneByType(initValue);
            airlineCompany.addAircraft(aircraft);
        }
    }
    private Aircraft getAirplaneByType(InitializeAirplanes initValue) {
        switch (initValue.getAirplaneType()) {
            case FREIGHT_HEAVY:
            case FREIGHT_LIGHT:
                return new FreightAirplaneFactory()
                        .getFreightAirplane(initValue);
            case AGRICULTURAL_BIPLANE:
            case AGRICULTURAL_MONOPLANE:
                return new AgriculturalAirplaneFactory()
                        .getAgriculturalAirplane(initValue);
            case PASSENGER_NARROW:
            case PASSENGER_WIDE:
                return new PassengerAirplaneFactory()
                        .getPassengerAirplane(initValue);
            default:
                return null;
        }
    }
}
