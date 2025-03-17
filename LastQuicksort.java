public class LastQuicksort {
    static int partition(int[] arr, int low, int high) {

        // choose last element of pivot
        int pivot = arr[high];
        // search pivot small array before element come in array
        int i = low - 1;

        // not have small array after pivot
        for (int j = low; j < high; j++) {
            // which array empty put next array
            if (arr[j] < pivot) {
                // we find empty array
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // we make empty place then we do swap
        // we need empty place for pivot
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;

        // right postion pivot index8
        return i;

    }

    static void sort(int[] arr, int low, int high) {
        // If low is lesser than high
        if (low < high) {

            // idx is index of pivot element which is at its
            // sorted position
            int pi = partition(arr, low, high);

            // Separately sort elements before
            // partition and after partition
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

    /* Function to print an array */

    public static void main(String[] args) {
        int arr[] = { 8, 5, 6, 2, 9, 1, 11 };
        int n = arr.length;
        LastQuicksort.sort(arr, 0, n - 1);

        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
    }

}
