public class LinearProbingHashTable {
    private static final int SIZE = 10;
    private final Integer[] table;

    public LinearProbingHashTable() {
        table = new Integer[SIZE];
    }

    private int hash(int key) {
        return key % SIZE;
    }

    public void insert(int key) {
        int index = hash(key);

        // Linear probing to find next empty slot
        while (table[index] != null) {
            index = (index + 1) % SIZE;
        }

        table[index] = key;
    }

    public boolean search(int key) {
        int index = hash(key);
        int start = index;

        while (table[index] != null) {
            if (table[index] == key) {
                return true;
            }

            index = (index + 1) % SIZE;
            if (index == start)
                break; // Full loop completed
        }

        return false;
    }

    public void display() {
        System.out.println("Hash Table:");
        for (int i = 0; i < SIZE; i++) {
            System.out.println(i + " => " + (table[i] == null ? "empty" : table[i]));
        }
    }

    public static void main(String[] args) {
        LinearProbingHashTable hashTable = new LinearProbingHashTable();

        int[] keys = { 23, 43, 13, 27 };

        for (int key : keys) {
            hashTable.insert(key);
        }

        hashTable.display();

        System.out.println("Search 43: " + hashTable.search(43));
        System.out.println("Search 99: " + hashTable.search(99));
    }
}