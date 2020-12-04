package GB.Mazhaev;


import java.util.Random;
import java.util.Scanner;

public class Main {

    /*
     * 1. Создать классы Собака и Кот с наследованием от класса Животное.
     * 2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
     * Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
     * 3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
     * 4*. Добавить подсчет созданных котов, собак и животных.
     */


    public static void main(String[] args) {

        Animal[] arrAnimals = new Animal[6];
        arrAnimals[0] = new Dog("Шарик");
        arrAnimals[0].setRunningDistance(300);
        arrAnimals[0].setSwimmingDistance(6);

        arrAnimals[1] = new Dog("Бобик");
        arrAnimals[1].setRunningDistance(450);
        arrAnimals[1].setSwimmingDistance(9);

        arrAnimals[2] = new Dog("Рокки");
        arrAnimals[2].setRunningDistance(500);
        arrAnimals[2].setSwimmingDistance(10);

        arrAnimals[3] = new Cat("Крисс");
        arrAnimals[3].setRunningDistance(150);
        arrAnimals[3].setSwimmingDistance(0);

        arrAnimals[4] = new Cat("Шейла");
        arrAnimals[4].setRunningDistance(200);
        arrAnimals[4].setSwimmingDistance(0);

        arrAnimals[5] = new Cat("Фокс");
        arrAnimals[5].setRunningDistance(100);
        arrAnimals[5].setSwimmingDistance(0);

        getInfoThroughArr(arrAnimals);
        System.out.println();
        passingObstacles(arrAnimals);
        System.out.println();
        countOfAnimals(arrAnimals);

    }
    // методы

    public static void getInfoThroughArr (Animal[] arrAnimals) {
        for (int i = 0; i < arrAnimals.length; i++) {
            arrAnimals[i].infoAnimal();
        }
    }

    public static void passingObstacles (Animal[] arrAnimals) {
        for (int i = 0; i < arrAnimals.length; i++) {
            arrAnimals[i].run(500);
            arrAnimals[i].swim(10);
            System.out.println("-------------------------------------------------");
        }
    }

    public static void countOfAnimals (Animal[] arrAnimals) {
        int countDog = 0;
        int countCat = 0;
        for (int i = 0; i < arrAnimals.length; i++) {
            if (arrAnimals[i].typeAnimal == "Собака") {
                countDog++;
            }
            if (arrAnimals[i].typeAnimal == "Кот") {
                countCat++;
            }
        }

        System.out.println("Общее кол-во животных - " + arrAnimals.length + ". Кол-во собак - " + countDog
                + ". Кол-во котов - " + countCat);
    }

}



