// Class representing a Circular Queue
class CircularQueue {
    int front; // Points to the front element in the queue
    int rear; // Points to the rear element in the queue
    int queue[]; // Array to store the elements in the queue
    int size; // The maximum size of the queue

    // Constructor to initialize the circular queue with a specific size
    CircularQueue(int queueSize) {
        this.queue = new int[queueSize];
        this.front = -1;
        this.rear = -1;
        this.size = queueSize;  
    }

    // Check if the queue is full (i.e., if rear is just before the front)
    public boolean isFull() {
        return (rear + 1) % size == front;
    }

    // Check if the queue is empty (i.e., no elements are present)
    public boolean isEmpty() {
        return front == -1;
    }

    // Enqueue operation: Add an element to the queue
    public void enQueue(int data) {
        // If the queue is full, print a message and return
        if (isFull()) {
            System.out.println("Queue is Full");
            return;
        }

        // If the queue is empty, set the front to 0 (first element insertion)
        if (isEmpty()) {
            front = 0;
        }

        // Move rear to the next position (circularly)
        rear = (rear + 1) % size;
        queue[rear] = data; // Insert the element at the rear
    }

    // Dequeue operation: Remove an element from the front of the queue
    public int deQueue() throws Exception {
        // If the queue is empty, throw an exception
        if (isEmpty()) {
            throw new Exception("Queue is Empty");
        }

        int data = queue[front]; // Store the front element

        // If there was only one element in the queue, reset the front and rear
        if (front == rear) {
            front = -1;
            rear = -1;
        } else {
            // Move front to the next position (circularly)
            front = (front + 1) % size;
        }

        return data; // Return the dequeued element
    }

    // Print the elements of the queue
    void print() {
        // If the queue is empty, print a message and return
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }

        // Traverse the queue from front to rear and print the elements
        int i = front;
        while (true) {
            System.out.print(queue[i] + " ");
            //
            if (i == rear)
                break;
            i = (i + 1) % size; // Move to the next position circularly
        }
        System.out.println(); // Move to the next line after printing the queue
    }

    // Driver Class with the main method
    public static void main(String[] args) throws Exception {
        // Create a circular queue with a size of 5
        CircularQueue queue = new CircularQueue(5);

        // Enqueue some elements into the queue
        queue.enQueue(10);
        queue.enQueue(11);
        queue.enQueue(12);
        queue.enQueue(13);
        queue.enQueue(14);

        // Print the queue after enqueue operations
        System.out.println("Queue after enQueue operations:");
        queue.print();

        // Try to insert another element when the queue is full
        System.out.println("Trying to insert another element:");
        queue.enQueue(15); // This should print "Queue is Full"

        // Dequeue two elements from the queue
        System.out.println("Dequeuing elements:");
        System.out.println("Removed: " + queue.deQueue());
        System.out.println("Removed: " + queue.deQueue());

        // Print the queue after dequeue operations
        System.out.println("Queue after deQueue operations:");
        queue.print();

        // Add elements after the dequeue operations
        System.out.println("Adding elements after dequeue:");
        queue.enQueue(15);
        queue.enQueue(16);
        queue.print(); // Print the final queue state
    }
}
