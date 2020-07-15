package by.classes;

import by.exceptions.StudentException;

public class Student {
        private static String name;
        public String subject;
        public int mark;

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
        public void setMark(int mark) {
            this.mark = mark;
        }
        public static void main (String[] args) throws StudentException {
            if (name == null){
                throw new StudentException("student is absent");
            }
        }
}



