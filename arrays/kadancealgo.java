public class kadancealgo {
    public static void maxsum(int arr[])
    {
     int cs=0;
     int maxsum=Integer.MIN_VALUE;
     for(int i=0;i<arr.length;i++)
     {
        cs+=arr[i];
        if(cs<0)
        {
            cs=0;
        }
        maxsum=Math.max(maxsum, cs);
     }
     System.out.println("out max subarray sum is "+ maxsum);
    }

    public static void main(String[] args) {
        int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        maxsum(arr);
    }
}
