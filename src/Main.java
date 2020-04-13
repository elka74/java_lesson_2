import java.util.Arrays;
import java.util.Random;

public class Main {
    static Random random = new Random();
    static int i = 0;
    static int j = 0;
    static int n = 8;
    public static void main(String[] args) {
        //1. Задать целочисленный массив, состоящий из элементов 0 и 1.
        // Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        int[] arr = {0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1};
        System.out.println("Задача 1  " + Arrays.toString(arr));
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println("          " + Arrays.toString(arr));


        //2. Задать пустой целочисленный массив размером 8.
        // С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        int[] mas = new int[8];
        for (i = 1; i < mas.length; i++) {
            mas[0] = 0;
            mas[i] = mas[i - 1] + 3;
        }
        System.out.println("Задача 2  " + Arrays.toString(mas));

        //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
        // пройти по нему циклом, и числа меньшие 6 умножить на 2;
        int[] repl = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Задача 3  " + Arrays.toString(repl));
        for (i = 0; i < repl.length; i++) {
            if (repl[i] < 6)
                repl[i] = repl[i] * 2;
        }
        System.out.println("          " + Arrays.toString(repl));

        //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

        int[][] arr1 = new int[n][n];
        System.out.println("Задача 4   ");
        for (i = 0; i < arr1.length; i++) {
            for (j = 0; j < arr1.length; j++) {
                if ((i == j) || (j + i == arr1.length - 1)) {
                    arr1[i][j] = 1;
                } else {
                    arr1[i][j] = 0;
                }
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        //5. ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        int[] mass = new int[n];
        int max = 0;
        int min = 100;
        System.out.println("Задача 5 ");
        for (i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(100);
            System.out.print(mass[i] + " ");
            if (mass[i] > max) {
                max = mass[i];
            } else if (mass[i] < min) {
                min = mass[i];
            }
        }
        System.out.println();
        System.out.println("Максимальный элемент массива = " + max + ".\nМинимальный элемент массива = " + min + ".");

       /* //6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
        // метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
        // Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
        // граница показана символами ||, эти символы в массив не входят.
        int [] sum = new int [n];
        int left = 0;
        int right = 0;
        for (i = 0; i < n; i++){
            sum[i] = random.nextInt(100);
            System.out.print(sum[i] + " ");
        }
        for (i = 0; i < n; i++){
            for (j= sum.length -1; j < sum.length; j--) {
                left = left + sum[i];
                right = right + sum[i];
                if ((i < j && (left == right)))
                    System.out.println("true");
                else
                    System.out.println(false);

            }
        }


        //7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
        // или отрицательным), при этом метод должен сместить все элементымассива на n позиций. Для усложнения задачи
        // нельзя пользоваться вспомогательными массивами.

        int m = 5;
        int[] mas1 = {2, 4, 6, 8, 7, 5, 4, 1};

        shiftNumbers( mas1, m);
    }
        private static void shiftNumbers(int[] arrParam, int n) {
            //посмотрим матрицу до сдвмга
            for (int i = 0; i < arrParam.length; i++) {
            //}
            System.out.print(Arrays.toString(arrParam));
            // while (true){
            int t = arrParam[0];
            int c = arrParam[arrParam.length-1];
            //for (i = 0; i < arrParam.length - 1; i++) {
                for (j = i + 1; j < arrParam.length; j++) {
                    //arrParam[i] = arrParam[i + 1];
                    arrParam[arrParam.length - 2] = c;
                    arrParam[arrParam.length - 1] = t;
                    System.out.println(arrParam[j]);
                }
            }
            //  }

*/
    }


}