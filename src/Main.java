public class Main {
    public static void main(String[] args) {
        //Задача 1
        char iOS = '0';
        char android = '1';
        char clientOS = '2';
        if (clientOS == iOS) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == android) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Версии программы для данной операционной системы не существует. Пожалуйста, выберите устройство на iOS или Android");
        }
        //Задача 2
        char iOS2 = '0';
        char android2 = '1';
        int checkYear = 2015;
        int clientDeviceYear = 2012;
        char clientOS2 = '1';
        if (clientOS2 == iOS2) {
            if (clientDeviceYear < checkYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS2 == android2) {
            if (clientDeviceYear < checkYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else {
            System.out.println("Версии программы для данной операционной системы не существует. Пожалуйста, выберите устройство на iOS или Android");
        }
        //Задача 3
        int year = 2000;
        if (year % 4 == 0 &&  year % 100 != 0 || year % 400 == 0) {
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
        int monthNumber = 8;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}