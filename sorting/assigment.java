// Question :Use the following sorting algorithms tosort an array in DESCENDING order 
// :a.Bubble Sort
// b.Selection Sort
// c.Insertion Sort
// d.Counting SortYou

//  can use this array as an example :[3,6,2,1,8,7,4,5,3,1


public class assigment {

    public static void fun(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(i>j)
                {
                    arr[i] = arr[j];
                }
            }
        }

       

    }
    public static void main(String[] args) {
     int arr[] = { 3,6,2,1,8,7,4,5,3,1}; 
     fun(arr); 
    }
}
