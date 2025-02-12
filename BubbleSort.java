public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = { 5, 6, 30, 21, 35, 55, 60, 45, 55 };
        int size = numbers.length;
        System.out.println("number before sorting \n");
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i] + "");
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = temp;

                }
            }
        }
        System.out.println();
        System.out.println("After sorting");
        System.out.println();

        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i] + "");
        }
    }
}
