import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by pinq on 14.11.17.
 */
public class Main {

    public static void main(String[] args) {

        int[] array = {1, 2, 7, 8, 11, 2, 3, 1};
        int[] array2 = {1, 1, 9};
        int sum = 10;

        System.out.println(findSum(array2, sum));

    }


    public static boolean findSum(int[] array, int sum) {
        boolean pairFound = false;
        Arrays.sort(array);

        int low = 0;
        int high = array.length - 1;
        while (low < high) {
            if (array[low] + array[high] == sum) {
                System.out.println("Pair found on indexes " + low + " and " + high);
                pairFound = true;
                break;
            } else if (array[low] + array[high] < sum) {
                low++;
            } else if (array[low] + array[high] > sum) {
                high--;
            }
        }

        if (low == high) {
            System.out.println("no pair found!");
            pairFound = false;

        }
        return pairFound;
    }
}
