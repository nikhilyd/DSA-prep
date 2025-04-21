import java.util.Scanner;


public class assigment1 {

    public boolean fun(int arr[])
    {
for(int i=0;i<arr.length-1;i++)
{
    for(int j=i+1;j<arr.length-1;j++)
    {
        if(arr[i]==arr[j])
        {
            return true;
            break;
        }
    }
    return false;
}



    }

    }
    public static void main(String[] args) {
        int arr[] = {1,3,6,9,56,32,3,1};
        fun(arr);
    }
}