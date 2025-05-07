package p3;

import java.util.Scanner;

class OnlineStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите цену товара в рублях: ");
        double priceRub = scanner.nextDouble();

        System.out.println("Выберите валюту оплаты (1 - USD, 2 - EUR, 3 - CNY): ");
        int choice = scanner.nextInt();

        double converted = 0;
        String currency = "";

        switch (choice) {
            case 1 -> {
                converted = priceRub / 90;
                currency = "USD";
            }
            case 2 -> {
                converted = priceRub / 97;
                currency = "EUR";
            }
            case 3 -> {
                converted = priceRub / 12.5;
                currency = "CNY";
            }
            default -> System.out.println("Неверный выбор");
        }

        if (!currency.isEmpty()) {
            System.out.printf("Вы выбрали оплату: %.2f %s%n", converted, currency);
        }
    }
}
