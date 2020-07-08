package by.exceptions;
import java.util.ArrayList;
public class Student extends Group{
        private String name;
        private String subject;
        private int mark;

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getSubject() {
            return subject;
        }
        public void setSubject(String subject) {
            this.subject = subject;
        }
        public int getMark() {
            return mark;
        }
        public void setMark(int mark){
            this.mark = mark;
        }
        public Student(String name, String subject, int mark) {
            this.name = name;
            this.subject = subject;
            this.mark = mark;
        }
        private ArrayList<String> subjects = new ArrayList<>();

        public void addSubject(String subject) {
            this.subjects.add(subject);
        }
        public ArrayList<String> getSubjects() {
            return subjects;
        }
        private ArrayList<Integer> marks = new ArrayList<>();

        public void addMark(int mark) {
            this.marks.add(mark);
        }
        public ArrayList<Integer> getMarks() {
            return marks;
        }

        public static void main(String args[]){
        try {
            if (student = null)
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("Student is absent");
        }
    }
}

