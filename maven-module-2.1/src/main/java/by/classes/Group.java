package by.classes;
import by.exceptions.GroupException;
import java.util.ArrayList;

public class Group {

        public static void main(String[] args) throws GroupException {
        ArrayList<String> group = new ArrayList<>();
        group.add("firstGroup");
        group.add("secondGroup");
        group.add("thirdGroup");
        group.add("fourthGroup");
        group.add("fifthGroup");

        if(group == null){
            throw new GroupException("group is absent");
         }

        }
}

