package Arrays;
import java.util.Arrays;

public class HomeRevers {
    public static void main(String[] args) {
        int[] array = {0,1,2,3,4,5};
        System.out.println(Arrays.toString(revers(array)));
    }

    private static int[] revers(int[] array){
        int len = array.length;
        if(len <= 1)return array;
        int[] reversedArray = new int[len];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[len-1];
            len--;
        }
        return reversedArray;
    }
}
