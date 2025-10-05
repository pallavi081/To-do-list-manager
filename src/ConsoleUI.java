
import java.util.Scanner;

public class ConsoleUI {
    private TodoList todoList = new TodoList();
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        while (true) {
            System.out.println("\n--- To-Do List Manager ---");
            System.out.println("1. Add a to-do item");
            System.out.println("2. View to-do items");
            System.out.println("3. Mark a to-do item as done");
            System.out.println("4. Delete a to-do item");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addTodoItem();
                    break;
                case 2:
                    viewTodoItems();
                    break;
                case 3:
                    markTodoItemAsDone();
                    break;
                case 4:
                    deleteTodoItem();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void addTodoItem() {
        System.out.print("Enter the to-do item description: ");
        String description = scanner.nextLine();
        todoList.addTodoItem(description);
        System.out.println("To-do item added.");
    }

    private void viewTodoItems() {
        System.out.println("\n--- To-Do Items ---");
        for (int i = 0; i < todoList.getTodoItems().size(); i++) {
            System.out.println((i + 1) + ". " + todoList.getTodoItems().get(i));
        }
    }

    private void markTodoItemAsDone() {
        viewTodoItems();
        System.out.print("Enter the number of the to-do item to mark as done: ");
        int index = scanner.nextInt() - 1;
        todoList.markTodoItemAsDone(index);
        System.out.println("To-do item marked as done.");
    }

    private void deleteTodoItem() {
        viewTodoItems();
        System.out.print("Enter the number of the to-do item to delete: ");
        int index = scanner.nextInt() - 1;
        todoList.deleteTodoItem(index);
        System.out.println("To-do item deleted.");
    }
}
