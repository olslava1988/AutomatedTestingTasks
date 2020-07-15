package by.classes;
import by.exceptions.FacultyException;

import java.util.ArrayList;
public class Faculty {
    public static void main(String[] args) throws FacultyException {
        ArrayList<String> faculty = new ArrayList<>();
        faculty.add("biological");
        faculty.add("geological");
        faculty.add("historycal");
        faculty.add("mathematical");
        faculty.add("economic");

        if(faculty == null){
            throw new FacultyException("faculty is absent");
        }
     }
}




