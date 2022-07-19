import java.util.Arrays;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrays = new int[]{1, 2, 12, 3, 445, 46, 12, 24, 64, 12};
        Arrays.sort(arrays);
        binarySearch(arrays, 1, 445, 46);
    }

    public static int binarySearch(int[] array, int left, int right, int value) {
        int middle = (left + right) / 2;
        if (array[middle] == value) return middle;
        else if (value > array[middle]) {
            left = middle + 1;
            return binarySearch(array, left, right, value);
        } else if (value < array[middle]) {
            right = middle - 1;
            return binarySearch(array, left, right, value);
        }
    }
}
