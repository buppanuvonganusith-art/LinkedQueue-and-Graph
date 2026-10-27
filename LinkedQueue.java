public class LinkedQueue {

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node front;
    private Node rear;

    public LinkedQueue() {
        front = null;
        rear = null;
    }

    // Add an element to the rear of the queue
    public void enqueue(int data) {
        Node newNode = new Node(data);

        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        System.out.println("Enqueued: " + data);
    }

    // Remove the front element
    public void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.println("Dequeued: " + front.data);
        front = front.next;

        if (front == null) {
            rear = null;
        }
    }

    // View the front element
    public void peek() {
        if (front == null) {
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Front element: " + front.data);
        }
    }

    // Check whether the queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Display all elements
    public void display() {
        if (front == null) {
            System.out.println("Queue is empty.");
            return;
        }

        Node current = front;
        System.out.print("Queue: ");

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }
}