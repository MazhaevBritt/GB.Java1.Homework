package GB.Mazhaev;


import java.util.Random;
import java.util.Scanner;

public class Main {

    /*
     * 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
     * 2. Конструктор класса должен заполнять эти поля при создании объекта.
     * 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
     * 4. Создать массив из 5-ти сотрудников.
     * 5. С помощью цикла, вывести инф-цию только о сотрудниках старше 40 лет.
     */


    public static void main(String[] args) {

        Employee[] arrEmployees = new Employee[5];

        arrEmployees[0] = new Employee("Доронин Роберт Владимирович", 55,
                "Нач.группы", 55000,
                "88009561232", "doronin.roberto@gmail.com");

        arrEmployees[1] = new Employee("Валерий Иванович Шпак", 40,
                "Инженер тех. без-ти", 50000,
                "88005691232", "shpak.flat@gmail.com");

        arrEmployees[2] = new Employee("Тарасова Евгения Александровна", 25,
                "Инженер Г.О./Ч.С.", 50000,
                "88002356412", "tarasuk.evgesha@gmail.com");

        arrEmployees[3] = new Employee("Глинистая Индеборга Владимировна", 42,
                "Нач. отдела кадров", 45000,
                "88007563212", "indeborga.glina@gmail.com");

        arrEmployees[4] = new Employee("Гаврилюк Иннокентий Григорьевич", 38,
                "Контроллер", 25000,
                "88002369898", "kesha.gavrila@gmail.com");

        getInfoThroughArr(arrEmployees);

    }

    // методы
    public static void getInfoThroughArr (Employee[] arrEmployees) {
        for (int i = 0; i < arrEmployees.length; i++) {
            if (arrEmployees[i].getAge() > 40) {
                arrEmployees[i].getInfoEmployee();
            }
        }
    }

}



