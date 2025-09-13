// Java Program to Implement Max Heap
import java.util.ArrayList;

class MaxHeap {
    private ArrayList<Integer> heap;

    // Constructor to initialize the heap
    public MaxHeap() {  
        heap = new ArrayList<>();
    }

    // Returns the index of the parent node
    private int parent(int i) {
        return (i - 1) / 2;
    }

    // Returns the index of the left child node
    private int leftChild(int i) {
        return 2 * i + 1;
    }

    // Returns the index of the right child node
    private int rightChild(int i) {
        return 2 * i + 2;
    }

    // Swaps the elements at indices i and j
    private void swap(int i, int j) {
        int temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    // Inserts a new value into the heap
    public void insert(int value) {
          // Add the new value at the end of the heap
        heap.add(value); 
      
          // Get the index of the newly added value
        int currentIndex = heap.size() - 1; 

        // Bubble up to restore heap property
        while (currentIndex > 0 && heap.get(currentIndex) > heap.get(parent(currentIndex))) {
              // Swap with parent if current value is greater
            swap(currentIndex, parent(currentIndex));
          
              // Move up to the parent index
            currentIndex = parent(currentIndex); 
        }
    }

    // Extracts and returns the maximum value from the heap
    public int extractMax() {
        if (heap.isEmpty()) {
            throw new RuntimeException("Heap is empty");
        }

          // The maximum value is at the root
        int max = heap.get(0); 
      
          // Remove the last element
        int lastElement = heap.remove(heap.size() - 1); 

        if (!heap.isEmpty()) {
          
              // Move the last element to the root
            heap.set(0, lastElement); 

            // Bubble down to restore heap property
            int currentIndex = 0;
            while (true) {
                int left = leftChild(currentIndex);
                int right = rightChild(currentIndex);

                int largest = currentIndex;

                // Find the largest value among current, left child, and right child
                if (left < heap.size() && heap.get(left) > heap.get(largest)) {
                    largest = left;
                }

                if (right < heap.size() && heap.get(right) > heap.get(largest)) {
                    largest = right;
                }

                if (largest == currentIndex) {
                      // Heap property is restored
                    break; 
                }

                  // Swap with the largest child
                swap(currentIndex, largest); 
              
                  // Move down to the largest child's index
                currentIndex = largest; 
            }
        }

          // Return the maximum value
        return max; 
    }

    // Checks if the heap is empty
    public boolean isEmpty() {
        return heap.isEmpty();
    }
}

public class HeapExample {
    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap();

        // Insert values into the max heap
        maxHeap.insert(10);
        maxHeap.insert(5);
        maxHeap.insert(15);
        maxHeap.insert(20);
        maxHeap.insert(25);

        // Extract and print the maximum values from the heap
        System.out.println("Extracted Max: " + maxHeap.extractMax());
        // System.out.println("Extracted Max: " + maxHeap.extractMax());
    }
}