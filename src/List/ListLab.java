import java.util.ArrayList;
import java.util.List;

/**
 * Data Structures Lab 1: List - To-Do List Manager
 */
public class ListLab {

    public static void main(String[] args) {
        System.out.println("=== TO-DO LIST MANAGER ===");

        // ========== SECTION 1: Creating and Initializing the List ==========
        System.out.println("1. Creating a new to-do list...");

        List<String> todoList = new ArrayList<String>();

        System.out.println("   Empty list created successfully!");
        System.out.println("   List size: " + todoList.size());
        System.out.println("   Is empty: " + todoList.isEmpty());
        System.out.println();

        // ========== SECTION 2: Adding Tasks to the List ==========
        System.out.println("2. Adding tasks to our to-do list...");

        todoList.add("Buy groceries");
        todoList.add("Walk the dog");
        todoList.add("Study for exam");
        todoList.add("Call mom");

        todoList.add("Clean room");
        todoList.add("Finish homework");
        todoList.add("Wash the car");
        todoList.add("Prepare lunch");

        System.out.println("   Tasks added successfully!");
        System.out.println("   List size: " + todoList.size());
        System.out.println("   Current tasks: " + todoList);
        System.out.println();

        // ========== SECTION 3: Accessing Specific Tasks ==========
        System.out.println("3. Accessing specific tasks...");

        String firstTask = todoList.get(0);
        String lastTask = todoList.get(todoList.size() - 1);

        System.out.println("   First task: " + firstTask);
        System.out.println("   Last task: " + lastTask);
        System.out.println("   Task at index 2: " + todoList.get(2));
        System.out.println();

        // ========== SECTION 4: Inserting a Priority Task ==========
        System.out.println("4. Inserting a priority task at the beginning...");

        todoList.add(0, "URGENT: Submit assignment");

        System.out.println("   Priority task inserted!");
        System.out.println("   Updated list: " + todoList);
        System.out.println("   New list size: " + todoList.size());
        System.out.println();

        // ========== SECTION 5: Searching for Tasks ==========
        System.out.println("5. Searching for specific tasks...");

        String searchTask = "Walk the dog";

        boolean containsTask = todoList.contains(searchTask);
        int taskIndex = todoList.indexOf(searchTask);

        System.out.println("   Does list contain '" + searchTask + "'? " + containsTask);
        System.out.println("   Index of '" + searchTask + "': " + taskIndex);
        System.out.println();

        // ========== SECTION 6: Completing Tasks (Removing) ==========
        System.out.println("6. Completing tasks (removing from list)...");

        System.out.println("   Before completing tasks: " + todoList);

        String completedTask = todoList.remove(0);
        boolean removed = todoList.remove("Walk the dog");

        System.out.println("   Completed task: " + completedTask);
        System.out.println("   Successfully removed 'Walk the dog': " + removed);
        System.out.println("   After completing tasks: " + todoList);
        System.out.println("   Remaining tasks: " + todoList.size());
        System.out.println();

        // ========== SECTION 7: Iterating Through Remaining Tasks ==========
        System.out.println("7. Displaying all remaining tasks...");

        for (String task : todoList) {
            System.out.println("   - " + task);
        }

        System.out.println();

        // ========== SECTION 8: List Operations Summary ==========
        System.out.println("8. Final list summary:");
        System.out.println("   Total remaining tasks: " + todoList.size());
        System.out.println("   Is list empty: " + todoList.isEmpty());
        System.out.println("   Final list: " + todoList);

        System.out.println("\n=== LAB COMPLETE ===");
    }
}