public class buysellstock {
    public static void stocks(int arr[]) {
        int buyprice = Integer.MIN_VALUE, sellprice = 0;
        for (int i = 0; i < arr.length; i++) {
            if(buyprice<arr[i])
            {
                buyprice=arr[i];
            }
            
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 9, 7, 2 };
        stocks(arr);

    }
}
