
public class DoubleHashingHashTable {
    private static final int SIZE = 10;
    private Integer[] table;

    public DoubleHashingHashTable() {
        table = new Integer[SIZE];
    }

    private int hash1(int key) {
        return key % SIZE;
    }

    private int hash2(int key) {
        return 7 - (key % 7); // 7 < SIZE, should be a prime
    }

    public void insert(int key) {
        int index = hash1(key);
        int step = hash2(key);
        int i = 0;

        // Double hashing probing
        while (table[(index + i * step) % SIZE] != null) {
            i++;
            if (i == SIZE)
                return; // table is full
        }

        table[(index + i * step) % SIZE] = key;
    }

    public boolean search(int key) {
        int index = hash1(key);
        int step = hash2(key);
        int i = 0;

        while (i < SIZE) {
            int tryIndex = (index + i * step) % SIZE;
            if (table[tryIndex] == null)
                return false;
            if (table[tryIndex] == key)
                return true;
            i++;
        }

        return false;
    }

    public void display() {
        System.out.println("Double Hashing Hash Table:");
        for (int i = 0; i < SIZE; i++) {
            System.out.println(i + " => " + (table[i] == null ? "empty" : table[i]));
        }
    }

    public static void main(String[] args) {
        DoubleHashingHashTable hashTable = new DoubleHashingHashTable();

        int[] keys = { 23, 43, 13, 27 };

        for (int key : keys) {
            hashTable.insert(key);
        }

        hashTable.display();

        System.out.println("Search 43: " + hashTable.search(43));
        System.out.println("Search 99: " + hashTable.search(99));
    }
}