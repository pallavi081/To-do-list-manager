
public class TodoItem {
    private String description;
    private boolean isDone;

    public TodoItem(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean isDone) {
        this.isDone = isDone;
    }

    @Override
    public String toString() {
        return (isDone ? "[x]" : "[ ]") + " " + description;
    }
}
