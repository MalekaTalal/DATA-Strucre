public class ArrayB {
    void printRepeating(int arr[], int size)
    {
        int count[] = new int[size];
        int i;

        System.out.println("Repeated element is : ");
        for (i = 0; i < size; i++)
        {
            if (count[arr[i]] == 5)
                System.out.print(arr[i] + " ");
            else
                count[arr[i]]++;
        }
    }

    public static void main(String[] args)
    {
        ArrayB repeat = new ArrayB();
        int arr[] = {4, 4, 4, 5, 4, 3, 1, 4, 4, 9};
        int arraySize = arr.length;
        repeat.printRepeating(arr, arraySize);
    }
}
