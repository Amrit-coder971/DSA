
class QuickSort_L_Pivot {
    /*
     * This function takes first element as pivot, the
     * function places the pivot element(first element) on its
     * sorted position and all the element lesser than pivot
     * will placed left to it, and all the element greater than
     * pivot placed right to it.
     */
    int partition(int arr[], int low, int high) {
        // First element as pivot
        int pivot = arr[low];
        int i = low; // st points to the starting of array
        // end points to the ending of the array
        int j = high;
        for (i = high; i > low; i--) {
            if (arr[i] > pivot)
                swap(arr, i, j--);
        }
        swap(arr, low, j);
        // As we got pivot element index is end
        // now pivot element is at its sorted position
        // return pivot element index (end)
        return j;
    }

    // Function to swap two elements
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /*
     * The main function that implements QuickSort
     * arr[] --> Array to be sorted,
     * low --> Starting index,
     * high --> Ending index
     */
    void quickSort(int arr[], int low, int high) {
        // If low is lesser than high
        if (low < high) {
            // idx is index of pivot element which is at its
            // sorted position
            int idx = partition(arr, low, high);

            // Separately sort elements before
            // partition and after partition
            quickSort(arr, low, idx - 1);
            quickSort(arr, idx + 1, high);
        }
    }

    /* Function to print an array */
    void printArray(int arr[], int size) {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver Code
    public static void main(String args[]) {
        int arr[] = { 7, 6, 10, 5, 9, 2, 1, 15, 7 };
        int n = arr.length;

        QuickSort_L_Pivot ob = new QuickSort_L_Pivot();
        ob.quickSort(arr, 0, n - 1);

        System.out.println("Sorted array");
        ob.printArray(arr, n);
    }
}
