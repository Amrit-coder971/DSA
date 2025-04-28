
public class QuadraticProbingHashTable {
    private static final int SIZE = 10;
    private Integer[] table;

    public QuadraticProbingHashTable() {
        table = new Integer[SIZE];
    }

    private int hash(int key) {

        return key % SIZE;
    }

    public void insert(int key) {
        int index = hash(key);
        int i = 0;

        // Quadratic probing: (index + i*i) % SIZE
        while (table[(index + i * i) % SIZE] != null) {
            i++;
            if (i == SIZE)
                return; // table is full
        }

        table[(index + i * i) % SIZE] = key;
    }

    public boolean search(int key) {
        int index = hash(key);
        int i = 0;

        while (i < SIZE) {
            int tryIndex = (index + i * i) % SIZE;
            if (table[tryIndex] == null)
                return false;
            if (table[tryIndex] == key)
                return true;
            i++;
        }

        return false;
    }

    public void display() {
        System.out.println("Quadratic Probing Hash Table:");
        for (int i = 0; i < SIZE; i++) {
            System.out.println(i + " => " + (table[i] == null ? "empty" : table[i]));
        }
    }

    public static void main(String[] args) {
        QuadraticProbingHashTable hashTable = new QuadraticProbingHashTable();

        int[] keys = { 23, 43, 13, 27 };

        for (int key : keys) {
            hashTable.insert(key);
        }

        hashTable.display();

        System.out.println("Search 43: " + hashTable.search(43));
        System.out.println("Search 99: " + hashTable.search(99));
    }
}