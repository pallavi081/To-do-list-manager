
import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private List<TodoItem> todoItems = new ArrayList<>();

    public void addTodoItem(String description) {
        todoItems.add(new TodoItem(description));
    }

    public List<TodoItem> getTodoItems() {
        return todoItems;
    }

    public void markTodoItemAsDone(int index) {
        if (index >= 0 && index < todoItems.size()) {
            todoItems.get(index).setDone(true);
        }
    }

    public void deleteTodoItem(int index) {
        if (index >= 0 && index < todoItems.size()) {
            todoItems.remove(index);
        }
    }
}
