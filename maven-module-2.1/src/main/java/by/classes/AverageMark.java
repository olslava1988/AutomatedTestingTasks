package by.classes;
import by.exceptions.AverageMarkException;

import java.util.ArrayList;

public class AverageMark {
    private static int sumOfMarks;
    private static int subjects;
    private static int mark;

    public static void main (String[] args) throws AverageMarkException {
        for (int i = 0; i <= 10; i++) {
            int mark = (int) (Math.random()*11);
        }
        for(int i = 0; i <= mark; i++) {
            sumOfMarks += mark;
        }
        if (mark < 0 || mark > 10){
            throw new AverageMarkException("the mark is out of range rating");
        }
        double averageMark = sumOfMarks/subjects;
   }
}


