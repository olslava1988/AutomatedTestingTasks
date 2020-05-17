/*Реализовать следующие программы:
1. Приветствовать любого пользователя при вводе его имени через командную строку.
2. Отобразить в окне консоли аргументы командной строки в обратном порядке.
3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
4. Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.
5. Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу. Осуществить проверку корректности ввода чисел.*/

//1.
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String name = scanner.next();
	System.out.println("Hello " + name); 
	}
}

//2.
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.print("Введите последовательность цифр: ");
		int value = scanner.nextInt();
		int mirror = 0;
		while (value != 0) {
			mirror = mirror * 10 + (value % 10);
			value = value / 10;
		}
		System.out.print("Введите обраную последовательность цифр: " + mirror);
	}
}

//3.
public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        for (int i : a) {
            System.out.println(i);
        }
        for (int i : a) {
            System.out.print(i);
        }
    }
}

//4.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввести целые цисла: ");
        int value = scanner.nextInt();
        int sum = 0;
        int com = 1;
        while (value != 0) {
            sum += value % 10;
            value = value / 10;
        }
        System.out.println("Cумма введённых чисел: " + sum);
        while (value != 0) {
            composition *= value % 10;
            value = value / 10;
        }
        System.out.println("Произведение введённых чисел: " + composition);
    }
}

//5.
import java.util.Scanner;
public class Main {
	static void setMonth(int a) {
	String[] month = {"январь", "феваль", "март", "апрель", "май", "июнь",
		"июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
	String[] s;
		try {
		s = month[a - 1];
		System.out.println("Это месяц - " + s + ".");
	} 
		catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Такого месяца не существует");
	}
}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите номер месяца " + number);
		int number = scan.nextInt();
		setMonth(number);
	}
}

/*Задание. Ввести n чисел с консоли.
1. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.
4. Найти число, в котором количество различных цифр минимально. Если таких чисел несколько, найти первое из них.*/

//1.
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n =Integer.parseInt(br.readLine());
        String[] l  = new String[n];
        for (int i = 0; i <n ; i++) {
            l[i] =String.valueOf(Integer.parseInt(br.readLine()));
        }
    }
    public static void max(String n) {
        String[] num=n[0];
        int max = n[0].length();
        for (int i = 0; i <n.length ; i++) {
            if (n[i].length()>max) {
                max=n[i].length();
                num=n[i];
            }
        }
        System.out.println("Максимальное число: "+num+" Его длинна: "+max);
    }
    public static void min(String n) {
        String[] num=n[0];
        int min = n[0].length();
        for (int i = 0; i <n.length ; i++) {
            if (n[i].length()<min){
                min=n[i].length();
                num=n[i];
            }
        }
        System.out.println("Минимальное число: "+num+" Его длинна: "+min);
    }
}

//4.
import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Integer n = new Integer{225698, 111111, 325687, 4545458, 20222, 3654789};
        String str, tmp = new String();
        Random r = new Random();
        int counter = 0, tmpNumber = 0;

        System.out.println("AR: " + Arrays.List(n));
        for (int i = 0; i < n.length; i++) {
            str = n[i].toString();
            for (int j = 0; j < str.length() - 1; j++) {
                tmpNumber = 0;
                for (int k = j; k < str.length(); k++) {
                    if (str.toString().charAt(j) == str.toString().charAt(k)) {
                        tmpNumber++;
                    }
                    if (tmpNumber > counter) {
                        counter = tmpNumber;
                        tmp = str;
                    }
                }
            }
        }
        System.out.println(tmp);
    }
}

/*Задание. Ввести с консоли n - размерность матрицы a [n] [n].
1. Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки).
3. Найти сумму элементов матрицы, расположенных между первым и вторым положительными элементами каждой строки*/

//1.
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class FirstTask{
    public void  firsttask () {
        Scanner scan = new Scanner (System.in);
        final int k = Integer.parseInt (scan.nextLine ());
        int n = Integer.parseInt (scan.nextLine ());
        Integer[][] matrix = new Integer[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scan.nextInt ();
            }
        }
List<Integer[]> matrixList = Arrays.asList (matrix);     //let's override sort of our matrix FOR THE KING!
            Collections.sort (matrixList, new Comparator<Integer[]> () {
                public int compare (Integer[] o1, Integer[] o2) {
                    return o1[k] - o2[k];
                }
            }
        }
        System.out.println (n);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print (matrix[i][j]+"\t");
            }
        }
}

//3.
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ThirdTask {
    public void thirdtask () {
        Scanner scan = new Scanner (System.in);
        int n = Integer.parseInt (scan.nextLine ());
        int[][] matrix = new int[n][n];
        int sum = 0;
        int sumAll = 0;
        boolean firstPositive = false;
        boolean secondPositive = false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scan.nextInt ();
                if ((matrix[i][j]>0) && (firstPositive))
                    secondPositive = true;
                else if ((firstPositive) && (!secondPositive)){
                    sum += matrix[i][j];
                }
                else if ((matrix[i][j]>0) && (!firstPositive))
                    firstPositive = true;
            }
            if (firstPositive && !secondPositive)
            {
                sum = 0;
            }
            firstPositive = false;
            secondPositive = false;
            sumAll += sum;
            sum = 0;
        }

    System.out.println (sumAll);
}

