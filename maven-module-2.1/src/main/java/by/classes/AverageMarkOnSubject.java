package by.classes;

import by.exceptions.AverageMarkOnSubjectException;

public class AverageMarkOnSubject {
    private static double averageMark;
    private static String subject;
    int[] markOnSubject = new int[10];

    public static void main (String[] args) throws AverageMarkOnSubjectException {
        for (int i = 0; i <= 10; i++) {
            int markOnSubject = (int) (Math.random()*11);
            averageMark += markOnSubject/11;
        }
        if (subject == null){
            throw new AverageMarkOnSubjectException("subject is absent");
        }
    }
}


