public class BubbleSort {
    public static void main(String[] args) {

        // array
        int[] numbers = { 4, 1, 5, 2, 3 };
        int size = numbers.length; // 8
        System.out.println("number before sorting \n");

        // before sort loop
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i] + "");
        }

        for (int i = 0; i < size; i++) {
            // right element < (less) left element
            // size(n)-i-1 --> interations
            for (int j = 0; j < size - i - 1; j++) {
                // right element >(great) right element + 1
                // compare always first element int second element
                if (numbers[j] > numbers[j + 1]) {

                    // Array temp is used as a place to temporarily copy records during the merge
                    // process
                    // Swap arr[j] and arr[j+1]
                    int temp = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = temp;

                }
            }
        }
        // System.out.println();
        System.out.println("After sorting");
        // System.out.println();

        // After sort loop
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i] + "");
        }
    }
}
