public class TowerOfHanoi {

    public static void towerOfHanoi(int n, int A, int B, int C) {
        if (n > 0) {
            towerOfHanoi(n - 1, A, C, B);
            System.out.println("(" + A + "," + C + ")");
            towerOfHanoi(n - 1, B, A, C);
        }
    }

    public static void main(String[] args) {
        int n = 3; // Number of disks
        towerOfHanoi(n, 1, 2, 3);
    }
}

 