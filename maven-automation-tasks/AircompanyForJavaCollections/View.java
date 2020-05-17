package com.javaweb.view;

public class View {
    public static final String HEADER =
            "<---------------- Airline company ---------------->";
    public static final String OVERALL_CARRYING_CAPACITY =
            "Summary carrying capacity in all airplanes of your company : ";
    public static final String OVERALL_PASSENGER_CAPACITY =
            "Summary passenger capacity in all airplanes of your company : ";
    public static final String ENTER_FUEL_NUMBERS =
            "Now, lets find airplanes with fuel consumption diapason!";
    public static final String LOW_LIMIT_FUEL_CONSUMPTION =
            "Enter your low limit of fuel consumption(real or int value) : ";
    public static final String HIGH_LIMIT_FUEL_CONSUMPTION =
            "Enter your high limit of fuel consumption(real or int value) : ";
    public static final String FUEL_CONSUMPTION_RESULT =
            "Result of your filter : ";
    public static final String ALL_AIRPLANES =
            "Your airplanes(Sorted by range of flight) :";
    public static final String EMPTY_AIRLINE_COMPANY =
            "Empty hangar! No airplanes in the airline company";
    public static final String ERROR_INPUT =
            "Error input! You should enter real" +
                    " or int value! Repeat please...";
    public static final String TAB = "\t";
    public static final String NEXT_LINE = "\n";
    public static final String REGEX_NUMBER = "(\\d+(\\.\\d+)?)";
    public static final String SEPARATOR = "_________________________________";
    public void printMessage(Object... message) {
        for (Object str : message) {
            System.out.print(str);
        }
    }
    public void printlnMessage(Object... message) {
        for (Object str : message) {
            System.out.println(str);
        }
    }
    public void printWithUnits(String message, Object data) {
        printMessage(TAB, String.format(message, data), NEXT_LINE);
    }
}
