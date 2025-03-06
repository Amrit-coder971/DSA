public class Merge {

    // divided &
    // divide the array equal part
    // merge part to creat a sort array
    // single array not than continue merge but single array come than stop continue
    // ([1,2,3] ,[1,2][3],[1],[2],[3]) --> tree in figure

    // recursive function
    static void sort(int[] a, int start, int mid, int end) {
        int k = 0;
        int size = end - start;
        int i = start;
        int j = mid;
        int[] temp = new int[size];

        // i is call by left side
        // j is call by right side
        // k is keys

        // i and j combined

        while (i < mid && j < end) {
            if (a[i] < a[j]) {

                // Array temp is used as a place to temporarily copy records during the merge
                // process
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
        }

        while (i < mid) {
            temp[k++] = a[i++];
        }
        while (j < end) {
            temp[k++] = a[j++];
        }

        // copy i
        for (int l = start; l < size; l++) {
            a[l] = temp[l];
        }

        for (int d = 0; d < size; d++) {
            System.out.print(a[d] + " ");
        }

    }

    public static void main(String[] args) {
        // methods
        int[] a = { 1, 6, 8, 20, 2, 3, 7, 12 };
        int start = 0;
        int end = a.length;

        // not overflow int
        int mid = start + (end - start) / 2;
        Merge.sort(a, start, mid, end);

    }
}

// stack based questions
