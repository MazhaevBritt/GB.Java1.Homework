package GB.Mazhaev;


import java.util.Random;
import java.util.Scanner;

public class Main {

    /*
     * 1. Расширить задачу про котов и тарелки с едой.
     * 2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды (например, в миске 10 еды,
     * а кот пытается покушать 15-20).
     * 3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны).
     * Если коту удалось покушать (хватило еды), сытость = true.
     * 4. Считаем, что если коту мало еды в тарелке, то он ее просто не трогает, то есть не может быть наполовину сыт
     * (это сделано для упрощения логики программы).
     * 5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов
     * в консоль.
     * 6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
     */

    public static boolean plateIsEmpty;
    public static int countOfEaten;

    public static void main(String[] args) {

        Plate p = new Plate(50);

        Cat c = new Cat("1");

        Cat[] arrCats = new Cat[6];
        arrCats[0] = new Cat("Крисс");
        arrCats[1] = new Cat("Шейла");
        arrCats[2] = new Cat("Фокс");
        arrCats[3] = new Cat("Пушок");
        arrCats[4] = new Cat("Амурчик");
        arrCats[5] = new Cat("Маруся");

        do {
            countOfEaten = 0;
            getInfoThroughArrCats(arrCats);
            p.getInfoPlate();
            foodTime(arrCats, p);
            for (int i = 0; i < arrCats.length; i++) {
                if (arrCats[i].getSatiety() != true) {
                    plateIsEmpty = true;
                } else {
                    countOfEaten++;
                }
            }
            if (plateIsEmpty == true && countOfEaten != arrCats.length) {
                p.fillingThePlate();
            }
        } while (countOfEaten != arrCats.length);
        System.out.println("Все коты поели");

    }

    // методы

    public static void getInfoThroughArrCats (Cat[] arrCats) {
        for (int i = 0; i < arrCats.length; i++) {
            arrCats[i].getInfoCat();
        }
        System.out.println("-----------------------------------");
    }

    public static void foodTime (Cat[] arrCats, Plate p) {
        for (int i = 0; i < arrCats.length; i++) {
            if (arrCats[i].getHunger() > 0) {
                arrCats[i].eat(p);
            } else {
                System.out.println(arrCats[i].getName() + " не хочет есть.");
            }
        }
        System.out.println("-----------------------------------");
    }

}



