package by.additionalTasks;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class FileWithRandomValues {
        public static void fileWithRandomValues(int amountOfNumbers, int boundOfRandomizing, Path randomNumPath) {
            List<String> randomNum = getRandomStringListOfNum(amountOfNumbers, boundOfRandomizing);

            try {
                Files.write(randomNumPath, randomNum);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        public static List<String> getRandomStringListOfNum(int amountOfNumbers, int boundOfRandomizing) {
            Random random = new Random();
            List<String> randomNum = new ArrayList<>(amountOfNumbers);
            for (int i = 0; i < amountOfNumbers; i++) {
                randomNum.add(String.valueOf(random.nextInt(boundOfRandomizing)));
            }
            return randomNum;
        }
        public static void getSortedNum(Path randomNumbersPath, Path outputPathForSortedNum) {
            try {
                List<String> listOfNumbers = Files.readAllLines(randomNumbersPath);
                listOfNumbers.sort(Comparator.comparing(Integer::valueOf));
                Files.write(outputPathForSortedNum, listOfNumbers);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
}