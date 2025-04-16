public class pairs {

    public static void pair(int arr[]){
        int sum=0;
        int maxsum=0;
        for(int i=1;i<=arr.length;i++)
        {
            for(int j=i+1;j<=arr.length;j++)
            { 

                sum+=i+j; 
                if(sum>maxsum){
                maxsum=sum;
                System.out.println("("+i+","+j+")");
                sum=0;
                }
                
                // System.out.print("("+i+","+j+")"); // for sub array just replace print statement to j 
            }
            System.out.println();
        } System.out.println(maxsum);
    }
public static void main(String[] args) {
    int arr[] ={1,2,3,4,5};
    pair(arr);
    
}
}