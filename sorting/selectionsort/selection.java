public class selection {

    public static void fun(int arr[]) {
        for(int i = 0; i < arr.length - 1; i++) {
            int minelement = i;
            for(int j = i; j < arr.length; j++) {
                if(arr[minelement] > arr[j]) {
                    minelement = j;
                }
            }

            // Swap the values
            int temp = arr[minelement];
            arr[minelement] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        fun(arr);

        // Print the sorted array
        for(int val : arr) {
            System.out.print(val + " ");
        }
    }
}
