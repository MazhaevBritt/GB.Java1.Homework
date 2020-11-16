package GB.Mazhaev;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    /*
    * 1. Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это
    * число.
    * При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
    * После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
    * ------------------------------------------------------------------------------------------------------------------
    * 2*. Создать массив из слов: String[] words = {"apple", "orange", "lemon", "banana", "apricot",
    *                                               "avocado", "broccoli", "carrot", "cherry", "garlic",
    *                                               "grape", "melon", "leak", "kiwi", "mango",
    *                                               "mushroom", "nut", "olive", "pea", "peanut",
    *                                               "pear", "pepper", "pineapple", "pumpkin", "potato"};
    * При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя, сравнивает его
    * с загаданным словом и сообщает правильно ли ответил пользователь.
    * Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
    * Пример: apple – загаданное
    *         apricot - ответ игрока
    *         ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
    * Для сравнения двух слов посимвольно, можно пользоваться:
    * String str = "apple";
    * str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции.
    * Играем до тех пор, пока игрок не отгадает слово. Используем только маленькие буквы!
    * ------------------------------------------------------------------------------------------------------------------
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя:");
        String userName = scanner.nextLine();
        int choice;
        do {
            System.out.println(userName + ", введите 1 - для игры в 'Угадай число', " +
                                      "2 - для игры в 'Угадай слово', 0 - для выхода.");
            choice = scanner.nextInt();
            if (choice == 1) {
                guessNumber(userName);
            } else if (choice == 2) {
                guessWord(userName);
            }
        } while (choice != 0);
        scanner.close();
    }

    // Методы

    public static int inputNumInConsole () {
        Scanner scanner = new Scanner(System.in);
        do {
            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            }
            System.out.println("Некорректная команда ввода. Повторите запрос");
            scanner.nextLine();
        } while (true);
    }

    public static void guessNumber (String userName) {
        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Добро пожаловать в игру 'Угадай число', " + userName + ".");
            System.out.println("Вам предстоит угадать число от 0 до 9. Вам будет дано 3 попытки.");
            Random rand = new Random();
            int guessedNum = rand.nextInt(10);
            // System.out.println(guessedNum); // - проверка загаданного числа.
            for (int i = 0; i < 3; i++) {
                System.out.println("Попробуйте угадать число. Введите число:");
                int userNum;
                do {
                    System.out.println("Введите число от 0 до 9");
                    userNum = inputNumInConsole();
                } while (!(0 <= userNum && userNum <= 9));

                if (userNum == guessedNum) {
                    System.out.println("Ваше число - " + userNum);
                    System.out.println("Загаданное число - " + guessedNum);
                    System.out.println(userName + ", вы угадали число!");
                    break;
                } else if (userNum > guessedNum) {
                    System.out.println("Вы не угадали число. Загаданное число меньше. Попробуйте еще раз.");
                } else if (userNum < guessedNum) {
                    System.out.println("Вы не угадали число. Загаданное число больше. Попробуйте еще раз.");
                }
            }
            System.out.println("Игра окончена.");
            System.out.println("Хотите повторить игру? Для повтора введите 1, для выхода - 0:");
            choice = scanner.nextInt();
            System.out.println("-------------------------------------------------------------------------------------");
        } while (choice != 0);

    }

    public static void guessWord (String userName) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            String[] arrWords = {"apple", "orange", "lemon", "banana", "apricot",
                    "avocado", "broccoli", "carrot", "cherry", "garlic",
                    "grape", "melon", "leak", "kiwi", "mango",
                    "mushroom", "nut", "olive", "pea", "peanut",
                    "pear", "pepper", "pineapple", "pumpkin", "potato"};
            Random rand = new Random();
            int guessedWord = rand.nextInt(arrWords.length);
            System.out.println("Добро пожаловать в игру 'Угадай слово', " + userName + ".");
            System.out.println("Вам предстоит угадать слово из предложенного списка:");
            System.out.println("----------------------------------------");
            int j = 0;
            for (int i = 1; i < 6; i++) {
                System.out.print("| ");
                for ( ; j < 5 * i ; j++) {
                    System.out.print(arrWords[j] + " ");
                }
                System.out.println();
            }
            System.out.println("----------------------------------------");
            // System.out.println(arrWords[guessedWord]); // - проверка загаданного слова.
            System.out.println("Количество попыток неограничено.");
            while (true) {
                System.out.println("Попробуйте угадать загаданное слово. Введите слово:");
                String userWord  = scanner.nextLine();
                if (userWord.equals(arrWords[guessedWord]) == true) {
                    System.out.println("Ваше слово - " + userWord);
                    System.out.println("Загаданное слово - " + arrWords[guessedWord]);
                    System.out.println(userName + ", вы угадали слово!");
                    break;
                } else if (userWord.equals(arrWords[guessedWord]) == false) {
                    System.out.println("Вы не угадали слово.");
                    for (int i = 0; i < userWord.length(); i++) {
                        if (userWord.charAt(i) == arrWords[guessedWord].charAt(i)) {
                            System.out.print(userWord.charAt(i));
                        } else {
                            System.out.print("###############");
                            System.out.println();
                            choice = 1;
                            break;
                        }
                    }
                }
            }
            System.out.println("Игра окончена.");
            System.out.println("Хотите повторить игру? Для повтора введите 1, для выхода - 0:");
            choice = scanner.nextInt();
            System.out.println("-------------------------------------------------------------------------------------");
        } while (choice != 0);
    }
}