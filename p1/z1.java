package p1;
import java.util.Scanner;
class Task3 {
    public static void main(String[] args) {
        int[] array = {4, 7, 1, 9, 3};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = (double) sum / array.length;
        System.out.println("Сумма: " + sum);
        System.out.println("Среднее: " + average);
    }
}
class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        int i = 0;
        do {
            System.out.print("Введите элемент " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
            i++;
        } while (i < n);

        int sum = 0;
        int max = arr[0];
        int min = arr[0];
        i = 0;
        while (i < n) {
            sum += arr[i];
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
            i++;
        }

        System.out.println("Сумма: " + sum);
        System.out.println("Максимум: " + max);
        System.out.println("Минимум: " + min);
    }
}
class Task5 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент " + i + ": " + args[i]);
        }
    }
}
class Task6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("1/%d = %.4f\n", i, 1.0 / i);
        }
    }
}
class Task7 {
    public static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Факториал " + num + " = " + factorial(num));
    }
}

public class z1 {

}
