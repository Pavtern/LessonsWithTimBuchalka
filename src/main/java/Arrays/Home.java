package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Home {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception{
        System.out.println("Enter number of elements in the array:");
        int[] array = createArray(scan.nextInt());
        System.out.println("You entered: " + Arrays.toString(array));
        System.out.println("The minimal int = " + findMin(array));

    }

    private static int[] createArray(int count){
        if(count <= 0)return new int[0];
        int[] createdArray = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.println("Enter a number:");
            try {
            createdArray[i] = scan.nextInt();}
            catch (Exception e) {
                System.out.println("It wasn't a number!");
                i--;
            }
            scan.nextLine();
        }
        return createdArray;
    }

    private static int findMin(int[] array) throws Exception{
        if(array.length < 1) throw new Exception();
        if(array.length == 1) return array[0];
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) min = array[i];
        }
        return min;
    }
}
