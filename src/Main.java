
public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int clientOS = 0;
        if (clientOS == 0)
            System.out.println("Установите версию приложения для iOS по ссылке");
        else if (clientOS == 1)
            System.out.println("Установите версию приложения для Android по ссылке");

        System.out.println("\nЗадание 2");
        int clientDeviceYear = 2015;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else
                System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else
                System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("\nЗадание 3");
        int year = 2021;
        boolean leapYear = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
        if (leapYear)
            System.out.println(year + " год является високосным");
        else
            System.out.println(year + " год не является високосным");

        System.out.println("\nЗадание 4");
        int deliveryDistance = 100;
        int days = 1;
        if (deliveryDistance > 100) {
            System.out.println("Свыше 100 км доставки нет");
        } else {
            if (deliveryDistance >= 20) {
                days++;
            }
            if (deliveryDistance >= 60) {
                days++;
            }

            System.out.println("Потребуется дней: " + days);
        }

        System.out.println("\nЗадание 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца нету");
        }
    }
}