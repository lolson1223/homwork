package basic;

import java.util.Scanner;

public class Shipping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Вопросы пользователю
        System.out.print("Сколько коробок вы хотите отправить? ");
        int numberOfBoxes = scanner.nextInt();

        System.out.print("Сколько весит каждая коробка в килограммах? ");
        double weightPerBox = scanner.nextDouble();

        System.out.print("Введите имя получателя посылки: ");
        String firstName = scanner.nextLine(); // Чтение пустой строки после ввода числа
        String recipientName = scanner.nextLine();

        System.out.print("Введите фамилию получателя посылки: ");
        String lastName = scanner.nextLine();

        System.out.print("Введите адрес получателя посылки: ");
        String address = scanner.nextLine();

        // Вывод информации
        System.out.println("Получатель: \"" + recipientName + "\"");
        System.out.println("Адрес получателя: \"" + address.toUpperCase() + "\"");
        System.out.println("Вес посылки: " + (numberOfBoxes * weightPerBox) + " кг");

        // Проверка подтверждения
        System.out.print("Все верно? (true/false) ");
        boolean isConfirmed = scanner.nextBoolean();
    }
}
