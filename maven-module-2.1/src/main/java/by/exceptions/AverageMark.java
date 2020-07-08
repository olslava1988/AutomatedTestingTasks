package by.exceptions;
import java.util.ArrayList;

public class AverageMark {
    int[] mark = new int[10];
    int subjects = 5;
    int sumOfMarks = 0;

    public static void main (String[] args) {
        for (int i = 0; i <= 10; i++) {
            int mark = (int) (Math.random()*11);
        }
        System.out.println(ArrayList.toString(mark));

        for(int i = 0; i <= mark.length; i++) {
            sumOfMarks = sumOfMarks + mark[5];
        }
        double averageMark += 0;
        try {
          for (int i = 0; i <=5; i++) {
              averageMark += sumOfMarks/5;
          }
            if (mark < 0 || mark > 10)
            } catch (IndexOutOfBoundsException ie) {
                System.err.println(ie);
            }
        System.out.println(averageMark);
    }
}


