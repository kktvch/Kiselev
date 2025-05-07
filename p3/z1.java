package p3;

// Задание 1. Сортировка массива вещественных чисел с Math.random() и Random

import java.util.*;

class Task1 {
    public static void main(String[] args) {
        double[] arr = new double[10];

        System.out.println("Math.random():");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random() * 100;
            System.out.printf("%.2f ", arr[i]);
        }
        System.out.println();

        Arrays.sort(arr);
        System.out.println("Отсортированный массив:");
        for (double d : arr) {
            System.out.printf("%.2f ", d);
        }

        System.out.println("\n\nRandom():");
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextDouble() * 100;
            System.out.printf("%.2f ", arr[i]);
        }
        System.out.println();
        Arrays.sort(arr);
        for (double d : arr) {
            System.out.printf("%.2f ", d);
        }
    }
}

// Задание 2. Классы Point, Circle, Tester
class Point {
    int x, y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Circle {
    Point center;
    double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Tester {
    Circle[] circles;
    int size;

    public Tester(int size) {
        this.size = size;
        this.circles = new Circle[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            Point p = new Point(rand.nextInt(100), rand.nextInt(100));
            double r = 1 + rand.nextDouble() * 10;
            circles[i] = new Circle(p, r);
        }
    }

    public Circle getSmallest() {
        Circle min = circles[0];
        for (Circle c : circles) {
            if (c.radius < min.radius) min = c;
        }
        return min;
    }

    public Circle getLargest() {
        Circle max = circles[0];
        for (Circle c : circles) {
            if (c.radius > max.radius) max = c;
        }
        return max;
    }

    public void sortByRadius() {
        Arrays.sort(circles, Comparator.comparingDouble(c -> c.radius));
    }
}

// Задание 3. Проверка строго возрастающей последовательности
class Task3 {
    public static void main(String[] args) {
        int[] arr = new int[4];
        Random rand = new Random();
        boolean isIncreasing = true;

        for (int i = 0; i < 4; i++) {
            arr[i] = rand.nextInt(90) + 10;
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 1; i < 4; i++) {
            if (arr[i] <= arr[i - 1]) {
                isIncreasing = false;
                break;
            }
        }

        System.out.println(isIncreasing ? "Последовательность строго возрастающая." : "Не строго возрастающая.");
    }
}

// Задание 4 и 5. Массив из n случайных чисел, фильтрация чётных элементов
class Task45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Введите натуральное число больше 0: ");
            n = sc.nextInt();
        } while (n <= 0);

        int[] arr = new int[n];
        ArrayList<Integer> even = new ArrayList<>();
        Random rand = new Random();

        System.out.print("Исходный массив: ");
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(n + 1);
            System.out.print(arr[i] + " ");
            if (arr[i] % 2 == 0) even.add(arr[i]);
        }

        if (even.size() > 0) {
            System.out.print("\nМассив чётных чисел: ");
            for (int e : even) {
                System.out.print(e + " ");
            }
        } else {
            System.out.println("\nЧётные числа не найдены.");
        }
    }
}
