import java.util.Arrays;

public class DemoWithFunction {
    public static void main(String[] args) {
        int[] arr = {120,20,30,40,50};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int key = 30;
        int result = Arrays.binarySearch(arr,key);
        if (result < 0)
            System.out.println("Element is not found!");
        else
            System.out.println("Element is found at index: " + result);
    }
}
