package by.classes;
import by.exceptions.FacultyException;

public class Faculty {
    int length = 0;

    public String nextString() {
        for (char i = 0; i < symbols.length; i++)
            symbols[i] = (char) symbols.length;
        return new String(symbols);
    }
    public static final String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String lower = "abcdefghijklmnopqrstuvwxyz";
    public static final String facultyName = upper + lower;
    private char[] symbols;

    public Faculty() throws FacultyException {
        if (symbols.length < 1) throw new FacultyException("Faculty is absent");
        this.symbols = new char[length];
    }
}




