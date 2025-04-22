public class assigone {
 
    public static void function(int arr[][] , int target )
{
    int count =0;
for(int i=0;i<arr.length;i++)
{
    for(int j=0;j<arr[0].length;j++)
    {
        if(arr[i][j] == target)
        {
            count++;
        }

        
    
    }


}

System.out.println("the num of time it appears is " + count);



}
    public static void main(String[] args) {
        int[][] arr = {
            {4, 7, 8},
            {8, 8, 7}
        };
        int target =8;
        function(arr , target);
    }
}
