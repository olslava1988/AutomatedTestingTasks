package by.classes;
import by.exceptions.FacultyException;
import by.exceptions.GroupException;
import java.util.Random;
import java.util.Objects;

public class Group extends Faculty{
       @Override
       public String nextString() {
           for (char i = 0; i < symbolsAndDigits.length; i++)
               symbolsAndDigits[i] = symbols[random.nextInt(symbols.length)];
           return String.valueOf(symbolsAndDigits);
        }

        public static final String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        public static final String lower = "abcdefghijklmnopqrstuvwxyz";
        public static final String number = "0123456789";
        public static final String groupName = upper + lower + number;
        private Random random;
        private char[] symbols;
        private final char[] symbolsAndDigits;

        public Group() throws GroupException, FacultyException {
                if (symbols.length < 1) throw new GroupException("Group is absent");
                this.random = Objects.requireNonNull(random);
                                this.symbolsAndDigits = new char[length];
        }

}

