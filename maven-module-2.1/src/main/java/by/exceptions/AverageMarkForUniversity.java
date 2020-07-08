package by.exceptions;

public class AverageMarkForUniversity extends AverageMarkOnSubject{
    super(markOnSubject);
    int students = 1000;
    int sumOfMarks = 0;

    public static void main (String[] args) {
        for(int i = 0; i <= markOnSubject.length; i++) {
            sumOfMarks = sumOfMarks + markOnSubject[1];
        }
        double averageMarkForUniversity += 0;
        for (int i = 0; i <=5; i++){
            averageMarkForUniversity += sumOfMarks/1000;
        }
        System.out.println(averageMarkForUniversity);
    }
}

