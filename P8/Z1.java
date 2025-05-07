package P8;
class Task1 {
    public static void main(String[] args) {
        int n = 15;
        int count = 0;
        for (int k = 1; count < n; k++) {
            for (int i = 0; i < k && count < n; i++) {
                System.out.print(k + " ");
                count++;
            }
        }
    }
}
class Task2 {
    public static void printFrom1ToN(int n) {
        if (n == 0) return;
        printFrom1ToN(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 7;
        printFrom1ToN(n);
    }
}
class Task3 {
    public static void printFromAToB(int a, int b) {
        System.out.print(a + " ");
        if (a == b) return;
        if (a < b) printFromAToB(a + 1, b);
        else printFromAToB(a - 1, b);
    }

    public static void main(String[] args) {
        int a = 3, b = 8;
        printFromAToB(a, b); // 3 4 5 6 7 8
    }
}


public class Z1 {
}
