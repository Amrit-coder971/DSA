public class InsectionSort {
    public static void main(String[] args) {
        int[] numbers = { 5, 6, 30, 21, 35, 55, 60, 45, 55 };
        int size = numbers.length;
        System.out.println("number before sorting \n");

        
        for (int i = 1; i < size; i++) {
            int key = numbers[i];
            int j = i - 1;
            while (j >= 0 && key < numbers[j]) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = key;
        }

        System.out.println();
        System.out.println("After sorting");
        System.out.println();

        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i] + "");
        }
    }
}
