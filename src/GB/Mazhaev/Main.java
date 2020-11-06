package GB.Mazhaev;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        /*
        * 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        * С помощью цикла и условия заменить 0 на 1, 1 на 0;
        *
        * 2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        *
        * 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        *
        * 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        * и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        *
        * 5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        *
        * 6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
        * метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
        * Примеры:
        * checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
        * checkBalance([1, 1, 1, || 2, 1]) → true,
        * Граница показана символами ||, эти символы в массив не входят.
        *
        * 7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
        * при этом метод должен сместить все элементымассива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
        * ----------------------------------------------------------------------------------------------------------------------------------------
        */



        // Задание 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
        // С помощью цикла и условия заменить 0 на 1, 1 на 0;

        System.out.println("Задание № 1");
        int[] zeroOneArr = {0, 0, 1, 1, 0, 1, 0, 0, 1, 1};
        printArr(replacementElementsArray(zeroOneArr));

        // Задание 2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        System.out.println("Задание № 2");
        int[] increaseBy3Arr = new int[8];
        printArr(fillArray(increaseBy3Arr));

        // Задание 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
        System.out.println("Задание № 3");
        int[] arrayToBeMultipliedBy6 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        printArr(arrayToBeMultipliedBy6);
        printArr(arrayElementsMultipliedBy6(arrayToBeMultipliedBy6));

        // Задание 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        System.out.println("Задание № 4");
        int[][] squareArr = new int[5][5];
        fillingDiagonalElementsOfArray(squareArr);

        // Задание 5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        System.out.println("Задание № 5");
        int[] myArrForTusk5 = {-5, -20, -9, -1, -3, -18, -78, -56, -7, -11, -44};
        minAndMaxElementsArray(myArrForTusk5);

        // Задание 6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
        // метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
        // Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true
        //          checkBalance([1, 1, 1, || 2, 1]) → true
        // Граница показана символами ||, эти символы в массив не входят.
        System.out.println("Задание № 6");
        int[] myArrForTusk6 = {2, 1, 1, 1, 1};
        printArr(myArrForTusk6);
        checkBalance(myArrForTusk6); // метод просто возвращает true или false
        checkBalanceExtended(myArrForTusk6); // метод выводит в консоль ответ, как в задании

        // Задание 7****. Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
        // при этом метод должен сместить все элементымассива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
        System.out.println("Задание № 7");
        int[] myArr1ForTusk7 = {1, 2, 3, 4, 5, 6, 7};
        int[] myArr2ForTusk7 = {1, 2, 3, 4, 5, 6, 7};
        int n = 2;
        displacedArrayComplex(myArr1ForTusk7, n); // сложно написанный метод
        shiftArray(myArr2ForTusk7, n); // просто написанный метод
        System.out.println(Arrays.toString(myArr2ForTusk7));
    }

    // Методы для заданий
    public static void printArr (int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static int[] replacementElementsArray (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        return arr;
    }

    public static int[] fillArray (int[] arr) {
        int initValForElementsArr = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initValForElementsArr;
            initValForElementsArr += 3;
        }
      return arr;
    }

    public static int[] arrayElementsMultipliedBy6 (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        return arr;
    }

    public static void fillingDiagonalElementsOfArray (int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j || i == (arr.length - 1) -j || j == (arr.length - 1) - i) {
                    arr[i][j] = 1;
                    System.out.print(arr[i][j]);
                } else {
                    System.out.print(arr[i][j]);
                }
            }
            System.out.println();
        }
    }

    public static void minAndMaxElementsArray (int[] arr) {
        int minVal = arr[0], maxVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minVal) {
                minVal = arr[i];
            }
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        System.out.println(minVal + " - минимальный элемент массива.");
        System.out.println(maxVal + " - максимальный элемент массива.");
    }

    public static boolean checkBalance (int[] arr) {
        int storeVal = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            storeVal += arr[i];
            int Sum = 0;
            for (int z = i + 1; z < arr.length; z++) {
                Sum += arr[z];
            }
            if (storeVal == Sum) {
                System.out.println("true");
                return true;
            }
        }
        System.out.println("false");
        return false;
    }

    public static boolean checkBalanceExtended(int[] arr) {
        int storeVal = 0;
        int[] storeElementsLeft = new int[arr.length];
        int[] storeElementsRight = new int[arr.length];
        for (int i = 0; i < arr.length - 1; i++) {
            storeElementsLeft[i] = arr[i];
            storeVal += arr[i];
            int count= 0;
            int Sum = 0;
            for (int z = i + 1; z < arr.length; z++) {
                storeElementsRight[z - 1 - i] = arr[z];
                Sum += arr[z];
               count++;
            }
            if (storeVal == Sum) {
                for (int j = 0; j < storeElementsLeft.length - count; j++) {
                    System.out.print(storeElementsLeft[j] + " ");
                }
                System.out.print("|| ");
                for (int j = 0; j < count; j++) {
                    System.out.print(storeElementsRight[j] + " ");
                }
                System.out.println(" - true");
                return true;
            }
            storeElementsRight = new int[arr.length];
        }
        System.out.println("false");
        return false;
    }

    public static void displacedArrayComplex(int [] Arr, int n) {
        if(n > 0) {
            int buffer = Arr[0];
            for (int x = 0; x < n; x++) {
                for (int i = Arr.length - 1; i > 0; i--) {
                    if (i == Arr.length - 1) {
                        Arr[i - i] = Arr[i];
                    } else if (i == 1) {
                        Arr[i + 1] = Arr[i];
                        Arr[i] = buffer;
                    } else {
                        Arr[i + 1] = Arr[i];
                    }
                }
                buffer = Arr[0];
            }
            System.out.println(Arrays.toString(Arr));
        } else if (n < 0) {
            n *= -1;
            for (int x = 0; x < n; x++) {
                int buffer = Arr[Arr.length - 1];
                for (int i = 0; i < Arr.length; i++) {
                    if (i == Arr.length - Arr.length) {
                        Arr[Arr.length - 1] = Arr[i];
                    } else if (i == Arr.length - 1) {
                        Arr[i - 1] = buffer;
                    } else {
                        Arr[i - 1] = Arr[i];
                    }
                }
                buffer = Arr[Arr.length - 1];
            }
            System.out.println(Arrays.toString(Arr));
        } else {
            System.out.println(Arrays.toString(Arr));
        }
    }

    static void shiftArray(int[] array, int shift)
    {
        // В какую сторону надо перемещать элементы массива?
        if (isNegative(shift))
            {
                // Цикл идёт влево.
                for (int i = 0; i > shift; i--)
                {
                    leftShift(array);
                }
            }
            else
            {
                // Цикл идёт вправо.
                for (int i = 0; i < shift; i++)
                {
                    rightShift(array);
                }
            }
    }

    static void rightShift(int[] inputArray)
    {
        // первым делом - заменить первый элемент последним. Но первый элемент терять нельзя.
        int buffer = inputArray[0];
        inputArray[0] = inputArray[inputArray.length - 1];
        for (int j = 1; j < (inputArray.length - 1); j++) {
            inputArray[inputArray.length - j] = inputArray[inputArray.length - j - 1];
        }
        inputArray[1] = buffer;
    }

    static void leftShift(int[] inputArray)
    {
        int buffer = inputArray[inputArray.length - 1];
        inputArray[inputArray.length - 1] = inputArray[0];
        for (int j = 1; j < (inputArray.length - 1); j++)
        {
            inputArray[j - 1] = inputArray[j];
        }
        inputArray[inputArray.length - 2] = buffer;
    }
    static boolean isNegative(int number) {
        return number < 0;
    }
}