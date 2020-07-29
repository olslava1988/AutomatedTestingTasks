package by.classes;
import by.exceptions.FacultyException;
import by.exceptions.GroupException;
import by.exceptions.StudentException;
import java.util.Random;

public class Student extends Group{

    @Override
    public String nextString() {
        for (char i = 0; i < symbols.length; i++)
            symbols[i] = (char) symbols.length;
        return new String(symbols);
    }
    public static final String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String lower = "abcdefghijklmnopqrstuvwxyz";
    public static final String number = "0123456789";
    public static final String studentFirstName = upper + lower;
    public static final String studentSecondName = upper + lower;
    public static final String studentAge = number;
    private final Random random = new Random();
    private char[] symbols;

    public Student() throws StudentException, GroupException, FacultyException {
        if (symbols.length < 1) throw new StudentException("Student is absent");
        this.symbols = new char[length];
    }
}



