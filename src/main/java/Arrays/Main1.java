package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        int[] myArray =  getIntArray(5);

        int[] go = {3, 5, 12, 235, 1, -20};
        int[] array = {10, 2, 10, 3, 1, 2, 5};
        System.out.println(Arrays.toString(sortArray(array)));
        System.out.println(Arrays.toString(array));
        for (int left = 0; left < array.length; left++) {

// Вытаскиваем значение элемента

            int value = array[left];

// Перемещаемся по элементам, которые перед вытащенным элементом

            int i = left - 1;
            for (; i >= 0; i--) {

// Если вытащили значение меньшее — передвигаем больший элемент дальше

                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {

// Если вытащенный элемент больше — останавливаемся

                    break;
                }
            }

// В освободившееся место вставляем вытащенное значение

            array[i + 1] = value;
        }
        System.out.println(Arrays.toString(array));

    }

    private static int[] sortArray(int[] array) {
        if (array.length <= 1) return array;
        int[] sorted = array;
        int count = 0;
        while (count < array.length) {
            for (int i = 0; i < array.length - 1; i++) {
                if (sorted[i] < sorted[i + 1]) {
                    int temp = sorted[i];
                    sorted[i] = sorted[i + 1];
                    sorted[i + 1] = temp;
                }
            }
            count++;
        }
        return sorted;
    }


    public static void sort(int[] arr) {
        for (int min = 0; min < arr.length-1; min++) {
            int least = min;
            for (int j = min + 1; j < arr.length; j++) {
                if (arr[j] < arr[least]) {
                    least = j;
                }
            }
            int tmp = arr[min];
            arr[min] = arr[least];
            arr[least] = tmp;
        }
        for(int element : arr){
            System.out.print(element + ", ");
        }
    }

    private static void printArray(int[] arrayName) {
        for (int element : arrayName) {
            System.out.println(element);
        }
    }

    private static int[] getIntArray(int numberOfElements) {
        int[] newArray = new int[numberOfElements];
        System.out.println("Enter " + numberOfElements + " integers:\r");
        for (int i = 0; i < numberOfElements; i++) {
            newArray[i] = scanner.nextInt();
        }
        return newArray;
    }
}
