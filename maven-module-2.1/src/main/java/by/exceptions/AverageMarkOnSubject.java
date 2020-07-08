package by.exceptions;
import java.util.ArrayList;

public class AverageMarkOnSubject {
    int[] markOnSubject = new int[10];

    public static void main (String[] args) {
        for (int i = 0; i <= 10; i++) {
            int markOnSubject = (int) (Math.random()*11);
        }
        System.out.println(ArrayList.toString(markOnSubject));
        double averageMarkOnSubject += 0;
            try {
            for (int i = 0; i <=10; i++) {
                averageMarkOnSubject += markOnSubject[i];
                averageMarkOnSubject /= 11;
            }
              if (subject = 0)
            } catch (ArithmeticException e) {
                System.out.println("Subject is absent");
            }
         System.out.println(averageMarkOnSubject);
    }
}

