public class ArrayA {
    static int findRepeating(int arr[], int n)
    {


        int res = 0;
        for (int i = 0; i < n - 1; i++)
            res = res ^ (i+1) ^ arr[i];
        res = res ^ arr[n - 1];

        return res;
    }


    public static void main(String[] args)
    {
        int arr[] = { 9, 5, 2, 6, 1, 4, 8, 3, 7, 5 };
        int n = arr.length;
        System.out.println(" the repeated number is : "+findRepeating(arr, n));
    }
}
