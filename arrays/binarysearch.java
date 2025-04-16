import java.util.*;

public class binarysearch {

    public static int function(int arr[], int key) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == key) {
                return mid;

            }
            if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 2, 3, 4, 6, 8, 9, 10, 20 };
        // enter the key you wanna find

        int key = sc.nextInt();

        int result = function(arr, key);
        System.out.println("Index of key: " + result);
    }
}
