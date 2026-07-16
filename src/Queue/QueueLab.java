import java.util.LinkedList;
import java.util.Queue;

public class QueueLab {

    public static void main(String[] args) {
        System.out.println("=== CUSTOMER SERVICE QUEUE SYSTEM ===");
        System.out.println("Learning Queue operations through customer service simulation\n");

        // ========== SECTION 1 ==========
        System.out.println("1. Setting up the customer service queue...");

        Queue<String> customerQueue = new LinkedList<String>();

        System.out.println("   Queue created successfully!");
        System.out.println("   Queue size: " + customerQueue.size());
        System.out.println("   Is queue empty: " + customerQueue.isEmpty());
        System.out.println();

        // ========== SECTION 2 ==========
        System.out.println("2. Customers arriving at the service desk...");

        customerQueue.offer("Alice");
        customerQueue.offer("Bob");
        customerQueue.offer("Charlie");
        customerQueue.offer("Diana");
        customerQueue.offer("Eve");

        System.out.println("   Customers added to queue!");
        System.out.println("   Queue size: " + customerQueue.size());
        System.out.println("   Current queue: " + customerQueue);
        System.out.println();

        // ========== SECTION 3 ==========
        System.out.println("3. Checking who's next in line...");

        String nextCustomer = customerQueue.peek();

        System.out.println("   Next customer to be served: " + nextCustomer);
        System.out.println("   Queue after peek: " + customerQueue);
        System.out.println("   Queue size after peek: " + customerQueue.size());
        System.out.println("   (Notice: peek doesn't remove the element!)");
        System.out.println();

        // ========== SECTION 4 ==========
        System.out.println("4. Serving customers one by one...");

        System.out.println("   Serving customer: " + customerQueue.poll());

        System.out.println("   Queue after serving the first customer: " + customerQueue);
        System.out.println("   Queue size after serving the first customer: " + customerQueue.size());

        System.out.println();

        System.out.println("   Serving customer: " + customerQueue.poll());
        System.out.println("   Queue after serving the second customer: " + customerQueue);
        System.out.println("   Queue size: " + customerQueue.size());

        System.out.println();

        // ========== SECTION 5 ==========
        System.out.println("5. More customers arriving while others are being served...");

        customerQueue.offer("Frank");
        customerQueue.offer("Grace");

        System.out.println("   New customers added!");
        System.out.println("   Updated queue: " + customerQueue);
        System.out.println("   Queue size: " + customerQueue.size());
        System.out.println();

        // ========== SECTION 6 ==========
        System.out.println("6. Processing all remaining customers...");

        while (!customerQueue.isEmpty()) {
            System.out.println("   Serving: " + customerQueue.poll());
            System.out.println("   Remaining in queue: " + customerQueue.size());
        }

        System.out.println();

        // ========== SECTION 7 ==========
        System.out.println("7. Testing operations on empty queue...");

        System.out.println("   Queue after serving all customers: " + customerQueue);
        System.out.println("   Is queue empty: " + customerQueue.isEmpty());
        System.out.println("   Queue size: " + customerQueue.size());

        String emptyPeek = customerQueue.peek();
        String emptyPoll = customerQueue.poll();

        System.out.println("   Peek on empty queue: " + emptyPeek);
        System.out.println("   Poll on empty queue: " + emptyPoll);
        System.out.println("   (Notice: peek() and poll() return null for empty queue)");
        System.out.println();

        // ========== SECTION 8 ==========
        System.out.println("8. Demonstrating FIFO (First In, First Out) behavior...");

        System.out.println("   Adding customers in order: John, Jane, Jack");

        customerQueue.offer("John");
        customerQueue.offer("Jane");
        customerQueue.offer("Jack");

        System.out.println("   Queue: " + customerQueue);
        System.out.println("   Serving in FIFO order:");
        System.out.println("   First out: " + customerQueue.poll());
        System.out.println("   Second out: " + customerQueue.poll());
        System.out.println("   Third out: " + customerQueue.poll());

        System.out.println();

        // ========== SECTION 9 ==========
        System.out.println("9. Customer service session summary:");
        System.out.println("   Final queue state: " + customerQueue);
        System.out.println("   Is queue empty: " + customerQueue.isEmpty());
        System.out.println("   Final queue size: " + customerQueue.size());

        System.out.println("\n=== LAB COMPLETE ===");
    }
}