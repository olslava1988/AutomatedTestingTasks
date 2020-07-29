package by.classes;
import by.exceptions.AverageMarkException;
import by.exceptions.AverageMarkOnSubjectException;

public class Main{
    int sumOfMarks = 0;
    int subjects = 0;
    int mark = 0;
    double averageMarkOnSubject = 0;
    int markOnSubject = 0;
    int students = 0;
    double averageMark = 0;

    public double AverageMark(int mark, int sumOfMarks, int subjects) throws AverageMarkException {
        for (int i = 0; i <= 10; i++) {
            mark = (int) (Math.random() * 11);
        }
        for (int i = 0; i <= mark; i++) {
            sumOfMarks += mark;
        }
        if (mark < 0 || mark > 10) {
            throw new AverageMarkException("The mark is out of range rating");
        }
        averageMark += sumOfMarks/subjects;
        return averageMark;
    }

    public double AverageMarkForUniversity(int markOnSubject, int sumOfMarks, int students){
        for(int i = 0; i <= markOnSubject; i++) {
            sumOfMarks = sumOfMarks + markOnSubject;
        }
        double averageMarkForUniversity = 0;
        for (int i = 0; i <=0; i++){
            averageMarkForUniversity += sumOfMarks/students;
        }
        return averageMarkForUniversity;
    }

    public double AverageMarkOnSubject(int markOnSubject, int subjects) throws AverageMarkOnSubjectException {
        for (int i = 0; i <= 10; i++) {
            markOnSubject = (int) (Math.random()*11);
            averageMarkOnSubject += markOnSubject/11;
        }
        if (subjects == 0) {
            throw new AverageMarkOnSubjectException("Subject is absent");
        }
        return averageMarkOnSubject;
    }

    public void main(String[] args) throws AverageMarkException, AverageMarkOnSubjectException {
        AverageMark(mark, sumOfMarks, subjects);
        AverageMarkForUniversity(markOnSubject, sumOfMarks, students);
        AverageMarkOnSubject(markOnSubject, subjects);
    }
}

























