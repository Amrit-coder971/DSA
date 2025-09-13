
public class  Binary{
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        int se = 1;
        int start = 0;
        int end = a.length - 1;
        int mid;

        while (start <= end) {
            mid = (start + end) / 2;
            if (a[mid] == se) {
                System.out.println("found");
                break;
            } else if (a[mid] < se) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
    }
}

