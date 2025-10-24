import java.time.LocalDate;

public class Main {
    public static void checkYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не яляется високосным");
        }
    }

    public static void deviceType(int yearDevice, int device) {
        final int currentYear = LocalDate.now().getYear();
        if (yearDevice < currentYear && device == 1) {
            System.out.println("Установите облегченную версию приложения для Android.");
        } else if (yearDevice < currentYear && device == 0) {
            System.out.println("Установите облегченную версию приложения для iOS.");

        } else if (yearDevice >= currentYear && device == 1) {
            System.out.println("Установите приложение для Android.");
        } else if (yearDevice >= currentYear && device == 0) {
            System.out.println("Установите приложение для iOS.");
        }
    }

    public static void deliveryDistance(int distance) {
        if (distance <= 20) {
            System.out.println("Потребуется один день для доставки.");
        } else if (distance <= 60) {
            System.out.println("Потребуется два дня для доставки.");
        } else if (distance <= 100) {
            System.out.println("Потребуется три дня для доставки.");
        } else {
            System.out.println("Доставка не осушествляется");
        }
    }

    public static void main(String[] args) {
        System.out.println("Task 1");
        {
            checkYear(2000);
        }
        System.out.println();

        System.out.println("Task 2");
        {
            deviceType(2024, 0);
        }
        System.out.println();

        System.out.println("Task 3");
        {
            deliveryDistance(70);
        }
    }
}