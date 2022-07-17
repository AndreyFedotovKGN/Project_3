import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
//Задание 1
        System.out.println("Задание 1");
        int clientOs = 0;
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Данная версия ОС не поддерживается");
        }

//Задание 2
        System.out.println("Задание 2");
        int clientDeviceYear = 2012;
        boolean android = clientOs == 1;
        boolean iOs = clientOs == 0;
        if (android && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (android && clientDeviceYear < 2015) {
            System.out.println("Установите версию приложения для Android облегченной версии по ссылке");
        } else if (iOs && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (iOs && clientDeviceYear < 2015) {
            System.out.println("Установите версию приложения для iOS облегченной версии по ссылке");
        } else {
            System.out.println("Данная версия ОС не поддерживается");
        }
//Задание 3
        System.out.println("Задание 3");
        int year = 2000;
        if ((year % 4 == 0 && year != 100) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год является не високосным");
        }
//Задание 4
//        вернемся к делам банковским. У нас хороший банк, поэтому для наших клиентов мы организуем доставку банковских карт на дом с четкой датой доставки.
//        Чтобы известить клиента о том, когда будет доставлена его карта, нам нужно знать расстояние от нашего офиса до адреса доставки.
//        Правила доставки такие:
//        Доставка в пределах 20 км занимает сутки.
//        Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
//        Доставка в пределах 60 км до 100 км добавляет еще одни сутки.
//                То есть с каждым следующим интервалом доставки срок увеличивается на 1 день.
//                Напишите программу, которая выдает сообщение в консоль:
//        "Потребуется дней: " + срок доставки
//        Объявите целочисленную переменную deliveryDistance = 95, которая содержит дистанцию до клиента.
        System.out.println("Задание 4");
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней " + 1);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней " + 2);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней " + 3);
        } else {
            System.out.println("Срок поставки составит более 3 дней");
        }
//Задание 5
//напишите программу, которая определяет по номеру месяца в году, к какому сезону этот месяц принадлежит.
// Например, 1 месяц (он же январь) принадлежит к сезону зима.
//Для написания программы используйте оператор switch. Для обозначения номера месяца используйте переменную monthNumber = 12.
// Пропишите условие, при котором программа не будет выполняться (номер месяца больше 13).
        System.out.println("Задание 5");
        byte monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Месяц принадлежит к сезону ЗИМА");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Месяц принадлежит к сезону ВЕСНА");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Месяц принадлежит к сезону ЛЕТО");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Месяц принадлежит к сезону ОСЕНЬ");
                break;
            default:
                System.out.println("Такого месяца не существует");
            }
    }
}







