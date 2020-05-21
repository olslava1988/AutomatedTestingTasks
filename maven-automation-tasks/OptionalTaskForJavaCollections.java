//4. Занести стихотворение в список. Провести сортировку по возрастанию длин строк.
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Test {
    private static final String SONNET =
            "So, now I have confess’d that he is thine,\n"+
            "And I myself am mortgaged to thy will,\n"+
            "Myself I’ll forfeit, so that other mine,\n"+
            "Thou wilt restore, to be my comfort still:\n"+
            "But thou wilt not, nor he will not be free,\n"+
            "For thou art covetous and he is kind;\n"+
            "He learn’d but surety-like to write for me\n"+
            "Under that bond that him as fast doth bind.\n"+
            "The statute of thy beauty thou wilt take,\n"+
            "Thou usurer, that put’st forth all to use,\n"+
            "And sue a friend came debtor for my sake;\n"+
            "So him I lose through my unkind abuse.\n"+
            "Him have I lost; thou hast both him and me:\n"+
            "He pays the whole, and yet am I not free.\n";
    private static final Comparator<String> LINE_LENGTH_COMPARATOR = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return o1.length() - o2.length();
        }
    }
    public static void main(String[] args) {
        List<String> lines = Arrays.asList(SONNET.split("\n"));
        System.out.println(lines);
        Collections.sort(lines, LINE_LENGTH_COMPARATOR);
        System.out.println(lines);
    }
}

//6. Ввести строки из файла, записать в список ArrayList. Выполнить сортировку строк, используя метод sort() из класса Collections.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {
     public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("E:/test.txt"));
        ArrayList<String> arrStr = new ArrayList<>();
        while (scan.hasNext()) {
            arrStr.add(scan.nextLine());
        }
        scan.close();
        Collections.sort(arrStr);
        for (String anArrStr : arrStr) {
            System.out.println(anArrStr);
        }
    }
}