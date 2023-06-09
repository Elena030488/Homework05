public class Main {
    public static void main(String[] args) {
        //Задача 1
        char clientOS = '1';
        if (clientOS == '0') {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //Задача 2
        int clientDeviceYear = 2013;
        char clientOS2 = '0';
        if (clientOS2 == '0') {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //Задача 3
        int year = 2023;
        int fourthYear = year % 4;
        int hundredthYear = year % 100;
        int fourHundredthYear = year % 400;
        if (fourHundredthYear == 0) {
            System.out.println(year + " год является високосным");
        } else if (hundredthYear == 0) {
            System.out.println(year + " год не является високосным");
        } else if (fourthYear == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        //Задача 4
        int deliveryDistance = 20;
        int deliveryDays;
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        } else if (deliveryDistance > 60) {
            deliveryDays = 3;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance > 20) {
            deliveryDays = 2;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            deliveryDays = 1;
            System.out.println("Потребуется дней: " + deliveryDays);
        }
        //Задача 5
        int monthNumber = 13;
        switch (monthNumber) {
            case 1:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону зима");
                break;
            case 2:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону зима");
                break;
            case 3:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону весна");
                break;
            case 4:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону весна");
                break;
            case 5:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону весна");
                break;
            case 6:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону лето");
                break;
            case 7:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону лето");
                break;
            case 8:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону лето");
                break;
            case 9:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону осень");
                break;
            case 10:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону осень");
                break;
            case 11:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону осень");
                break;
            case 12:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону зима");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}