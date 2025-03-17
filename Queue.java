class Queue {
    // Points to the front of the queue
    int front;
    // Points to the next available position in the queue
    int rear;
    // Array to store queue elements
    int queue[];

    // Constructor to initialize the queue with a given size
    Queue(int queueSize) {
        this.queue = new int[queueSize];
        // Start position of the queue
        this.front = 0;
        // Indicates where the next element will be inserted
        this.rear = 0;
    }

    // Method to insert an element into the queue
    public void enQueue(int data) {
        // Check if the queue is full
        if (rear == queue.length) {
            System.out.println("queue is full");
            return;
        }
        // Insert data and move rear forward
        queue[rear++] = data;
    }

    // Method to remove an element from the queue
    public int deQueue() throws Exception {
        // Check if the queue is empty
        if (front >= rear) {
            System.out.println("Queue is empty");
            throw new Exception("Queue is empty");
        }
        // Remove front element and move front forward
        int data = queue[front++];
        return data;
    }

    // Main method to test the queue implementation
    public static void main(String[] args) throws Exception {
        // Create a queue of size 3
        Queue a = new Queue(3);
        // Insert 11
        a.enQueue(11);
        // Insert 12
        a.enQueue(12);
        // Insert 13
        a.enQueue(13);
        // Try inserting 14 (should print "Queue is full")
        a.enQueue(14);

        // Remove first element
        int removeData1 = a.deQueue();
        System.out.println("remover" + removeData1);
    }
}
