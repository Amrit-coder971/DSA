import java.util.Arrays;

class DataItem {
   int data;
   int key;

   public DataItem(int key, int data) {
       this.key = key;
       this.data = data;
   }
}

public class HashTable {

   private static final int SIZE = 20;
   private DataItem[] hashArray;
   private DataItem dummyItem;
   private DataItem item;

   public HashTable() {
       hashArray = new DataItem[SIZE];
       dummyItem = new DataItem(-1, -1);
   }

   private int hashCode(int key) {
       return key % SIZE;
   }

   public DataItem search(int key) {
       int hashIndex = hashCode(key);

       while(hashArray[hashIndex] != null) {
           if(hashArray[hashIndex].key == key)
               return hashArray[hashIndex];

           ++hashIndex;
           hashIndex %= SIZE;
       }

       return null;
   }

   public void insert(int key, int data) {
       DataItem item = new DataItem(key, data);
       int hashIndex = hashCode(key);

       while(hashArray[hashIndex] != null && hashArray[hashIndex].key != -1) {
           ++hashIndex;
           hashIndex %= SIZE;
       }

       hashArray[hashIndex] = item;
   }

   public DataItem delete(DataItem item) {
       int key = item.key;
       int hashIndex = hashCode(key);

       while(hashArray[hashIndex] != null) {

           if(hashArray[hashIndex].key == key) {
               DataItem temp = hashArray[hashIndex];
               hashArray[hashIndex] = dummyItem;
               return temp;
           }

           ++hashIndex;
           hashIndex %= SIZE;
       }

       return null;
   }

   public void display() {
       Arrays.stream(hashArray).forEach(item -> {
           if(item != null)
               System.out.printf(" (%d,%d)",item.key,item.data);
           else
               System.out.printf(" ~~ ");
       });

       System.out.println();
   }

   public static void main(String[] args) {
       HashTable hashTable = new HashTable();

       hashTable.insert(1, 20);
       hashTable.insert(2, 70);
       hashTable.insert(42, 80);
       hashTable.insert(4, 25);
       hashTable.insert(12, 44);
       hashTable.insert(14, 32);
       hashTable.insert(17, 11);
       hashTable.insert(13, 78);
       hashTable.insert(37, 97);

       hashTable.display();
       DataItem item = hashTable.search(37);

       if(item != null) {
           System.out.println("Element found: " + item.data);
       } else {
           System.out.println("Element not found");
       }

       hashTable.delete(item);
       item = hashTable.search(37);

       if(item != null) {
           System.out.println("Element found: " + item.data);
       } else {
           System.out.println("Element not found");
       }
   }
}

