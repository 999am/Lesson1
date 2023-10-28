import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    /**
     * Задача 1:
     * 1. Задать массив целых чисел длинной 10 элементов.
     * 2. Отсортировать числа в массиве
     * 3. Вывести на экран результат.
     * 4. Сделать возможность наполнения массива с клавиатуры*.
     */
    public static void task1() {
        System.out.println("Задача 1");
        // массив целых чисел длинной 10 элементов
        int[] array = {-50, 50, -25, 25, -15, 15, -10, 10, -1, 1};
        // отсортирован числа в массиве по возрастанию
        Arrays.sort(array);
        System.out.println("массив целых чисел длинной 10 элементов: " + Arrays.toString(array));

        // перенесена элементы из одного массива в другой (по убыванию)
        int j = 0;
        int[] array1 = new int[array.length];
        for (int i = array.length - 1; i > 0; i--) {
            array1[j] = array[i];
            j++;
        }
        System.out.println("Отсортированный массив целых чисел длинной 10 элементов: " + Arrays.toString(array1));


        System.out.println();
        //заполнения массива с клавиатуры
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int sizeArray = scan.nextInt();
        int[] array3 = new int[sizeArray];

        System.out.println("Заполните элементы массива:");
        for (int i = 0; i < sizeArray; i++) {
            array3[i] = scan.nextInt();

        }
        // Выводим на экран, полученный массив
        System.out.print("Наш массив: " + Arrays.toString(array3) + " из " + array3.length + " элементов\n \n");

    }

    /**
     * Задача 2:
     * 1. Задать массив целых чисел длинной N эл.
     * 2. Поменять 1-й и последний элемент местами.
     * 3. Вывести массив на экран.
     */
    public static void task2() {
        System.out.println("Задача 2");
        int n = 10;
        int[] array = new int[n];

        for (int i = 0; i < array.length - 1; i++) {
            array[i] = n;
            n--;
        }
        System.out.println("массив целых чисел длинной N: " + Arrays.toString(array));
        int[] array1 = array.clone();
        array1[0] = array[array.length - 1];
        array1[array.length - 1] = array[0];
        System.out.println("Изменен 1-й и последний элемент массива: " + Arrays.toString(array1));
    }

    /**
     * Задача 3:
     * 1. Ввести с клавиатуры массив из 10 чисел.
     * 2. Разбить его на 2 массива равной длинны.
     * 3. Отсортировать каждую из половинок и вывести их содержимое на экран.
     */
    public static void task3() {
        System.out.println("\nЗадача 3");
        //заполнения массива с клавиатуры
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 10 чисел: ");
        int[] array = new int[10];

        System.out.println("Заполните элементы массива:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();

        }
        System.out.print("получений массив без сортировки: " + Arrays.toString(array) + " из " + array.length + " элементов\n");
        Arrays.sort(array);
        // Выводим на экран, полученный массив
        System.out.print("получений массив после сортировки: " + Arrays.toString(array) + " из " + array.length + " элементов\n");
        System.out.println("Первая часть массива: ");
        int j = 0;
        for (int i = 0; i < array.length / 2; i++) {
            System.out.print(array[i] + ",");

        }
        System.out.println();
        System.out.println("Вторая часть массива: ");
        for (int i = array.length / 2; i <= array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    /**
     * Задача 4:
     * 1. Среднее арифметическое элементов массива.
     */
    public static void task4() {
        System.out.println("\nЗадача 4");
        int[] array = {10, 20, 30, 40, 50};
        double sum = Arrays.stream(array).sum();
        double average = sum / array.length;
        System.out.println("Среднее арифметическое значение массива: " + average);
    }

    /**
     * Задачи на 5-ку ☺
     * Написать код для зеркального переворота массива (1,2,3,4) -> (4,3,2,1).
     * Написать программу, которая позволит задать длину массива с клавиатуры, наполнить его
     * элементами, а затем выводить нужный элемент по его индексу на консоль.
     */
    public static void task5() {
        System.out.println("\nЗадача 5");
        int j = 0;
        int[] array = {1, 2, 3, 4};
        System.out.println("Начальный массив: " + Arrays.toString(array));
        int[] array1 = new int[array.length];
        for (int i = array1.length - 1; i >= 0; i--) {
            array1[j] = array[i];
            j++;
        }
        System.out.println("Массив с зеркальным поворотом: " + Arrays.toString(array1));

        System.out.println();
        //заполнения массива с клавиатуры
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int sizeArray = scan.nextInt();
        int[] array2 = new int[sizeArray];

        System.out.println("Заполните элементы массива:");
        for (int i = 0; i < sizeArray; i++) {
            array2[i] = scan.nextInt();

        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Напишите нужный индекс нужного элемента из массива: \n" + Arrays.toString(array2));
        int num = sc.nextInt();
        System.out.println("Элемент по индексу: " + num + " = " + array2[num]);
    }
}
