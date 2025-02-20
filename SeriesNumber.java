public class SeriesNumber {

    static public int fib(int n) {
        if (n == 0 || n == 1) {
            return 0;
        }
        return fib(n - 2) + fib(n - 1);
    }

    public static void main(String[] args) {
        fib(3);
    }
}
