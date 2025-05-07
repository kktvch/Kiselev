package p2;

import java.util.*;
import java.util.Scanner;

class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество строк:");
        int n = sc.nextInt();
        sc.nextLine(); // поглощаем перевод строки
        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Строка " + (i + 1) + ": ");
            arr[i] = sc.nextLine();
        }

        // инвертируем на месте
        for (int i = 0; i < arr.length / 2; i++) {
            String temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        System.out.println("В обратном порядке:");
        for (String s : arr) {
            System.out.println(s);
        }
    }
}


class Poker {
    public static void main(String[] args) {
        String[] suits = {"♠", "♥", "♦", "♣"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        List<String> deck = new ArrayList<>();

        // создаём колоду
        for (String suit : suits)
            for (String rank : ranks)
                deck.add(rank + suit);

        Collections.shuffle(deck);

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество игроков: ");
        int n = sc.nextInt();

        if (n * 5 > deck.size()) {
            System.out.println("Слишком много игроков!");
            return;
        }

        for (int i = 0; i < n; i++) {
            System.out.print("Игрок " + (i + 1) + ": ");
            for (int j = 0; j < 5; j++) {
                System.out.print(deck.get(i * 5 + j) + " ");
            }
            System.out.println();
        }
    }
}


class HowMany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку:");
        String line = sc.nextLine();

        if (line.trim().isEmpty()) {
            System.out.println("Вы ввели 0 слов.");
            return;
        }

        String[] words = line.trim().split("\\s+");
        System.out.println("Вы ввели " + words.length + " слов.");
    }
}
