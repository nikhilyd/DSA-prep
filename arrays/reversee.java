public class reversee {
    public static void revse(int arr[]) {
        int start = arr[0];
        int end = arr.length - 1;
        for (int i = 0; i <= arr.length; i++) {
            while (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        revse(arr);
        System.out.println("updated array:-");
        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
