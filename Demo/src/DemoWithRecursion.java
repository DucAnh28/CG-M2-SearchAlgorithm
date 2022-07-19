public class DemoWithRecursion {
    public static int binarySearch(int[] A, int first, int last, int x)
    {
        if (first > last) {
            return -1;
        }
        int mid = (first + last) / 2;
        if (x == A[mid]) {
            return mid;
        }
        else if (x < A[mid]) {
            return binarySearch(A, first,  mid - 1, x);
        }
        else {
            return binarySearch(A, mid + 1,  last, x);
        }
    }
    public static void main(String[] args)
    {
        int[] A = { 2, 5, 6, 8, 9, 10 };
        int key = 5;
        int first = 0;
        int last = A.length - 1;
        int index = binarySearch(A, first, last, key);

        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found in the array");
        }
    }
}
