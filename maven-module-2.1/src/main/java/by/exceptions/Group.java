package by.exceptions;
import java.util.ArrayList;
public class Group extends Faculty{
    public static void main(String[] args) {
        ArrayList<String> group = new ArrayList<>();
        group.add("firstGroup");
        group.add("secondGroup");
        group.add("thirdGroup");
        group.add("fourthGroup");
        group.add("fifthGroup");
        try {
            if (group = null)
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.err.println(ae);
        }
    }
}
