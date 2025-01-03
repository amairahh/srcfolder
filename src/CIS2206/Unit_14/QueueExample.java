package CIS2206.Unit_14;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * An example of using a queues and a priority queues
 *
 * @author Ilias Tachmazidis
 * @version September 2024
 */
public class QueueExample {
    public static void main(String[] args) {

        // Example of a Queue in Java
        System.out.println("Example of a Queue in Java");
        Queue<Item> queue = new LinkedList();
        // enqueue(a)
        queue.offer(new Item("a"));
        // enqueue(b)
        queue.offer(new Item("b"));
        // first()
        System.out.println("first(): " + queue.peek());
        // size()
        System.out.println("size(): " + queue.size());
        // dequeue()
        System.out.println("dequeue(): " + queue.poll());
        // isEmpty()
        System.out.println("isEmpty(): " + queue.isEmpty());
        // dequeue()
        System.out.println("dequeue(): " + queue.poll());
        // isEmpty()
        System.out.println("isEmpty(): " + queue.isEmpty());
        // dequeue()
        System.out.println("dequeue(): " + queue.poll());
        // size()
        System.out.println("size(): " + queue.size());

        // Example of a Priority Queue in Java
        System.out.println("\nExample of a Priority Queue in Java");
        PriorityQueue<Item> priorityQueue = new PriorityQueue();
        // insert(5,A)
        priorityQueue.offer(new Item(5,"A"));
        // insert(9,C)
        priorityQueue.offer(new Item(9,"C"));
        // insert(3,B)
        priorityQueue.offer(new Item(3,"B"));
        // min()
        System.out.println("min(): " + priorityQueue.peek());
        // removeMin()
        System.out.println("removeMin(): " + priorityQueue.poll());
        // insert(5,D)
        priorityQueue.offer(new Item(5,"D"));
        // removeMin()
        System.out.println("removeMin(): " + priorityQueue.poll());
        // removeMin()
        System.out.println("removeMin(): " + priorityQueue.poll());
        // removeMin()
        System.out.println("removeMin(): " + priorityQueue.poll());
        // removeMin()
        System.out.println("removeMin(): " + priorityQueue.poll());
        // isEmpty()
        System.out.println("isEmpty(): " + priorityQueue.isEmpty());
    }
}
