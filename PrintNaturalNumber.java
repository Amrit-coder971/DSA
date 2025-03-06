public class PrintNaturalNumber {

    static public void printNaturalNumber(int n) {
        if (n <= 0) {
            return;
        }
        printNaturalNumber(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        printNaturalNumber(10);
    }
}
