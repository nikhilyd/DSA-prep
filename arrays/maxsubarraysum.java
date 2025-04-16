import java.util.Arrays;

public class maxsubarraysum {

    public static void prefix(int arr[]) {
        int sum[] = new int[arr.length];
        int summ = 0;

        for (int i = 0; i < arr.length; i++) {
            summ += arr[i];
            sum[i] = summ;
        }

        System.out.println(Arrays.toString(sum));
        System.out.println("hello succeed");
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 5, 4, 3, 6, 8 };
        prefix(arr);
    }
}
