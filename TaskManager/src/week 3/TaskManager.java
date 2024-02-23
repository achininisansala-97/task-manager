import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;

    // Constructor to initialize the list of tasks
    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    // Method to add a new task
    public boolean addTask(Task newTask) {
        for (Task task : tasks) {
            if (task.getID() == newTask.getID()) {
                return false; // Task with the same ID already exists
            }
        }
        return tasks.add(newTask);
    }

    // Method to remove a task by ID
    public boolean removeTask(int taskID) {
        for (Task task : tasks) {
            if (task.getID() == taskID) {
                return tasks.remove(task);
            }
        }
        return false; // Task with the given ID not found
    }

    // Method to get the size of the task list
    public int getSize() {
        return tasks.size();
    }

    // Method to get textual representation of all tasks
    public String getAllTasks() {
        StringBuilder result = new StringBuilder();
        if (tasks.isEmpty()) {
            result.append("No tasks available.");
        } else {
            for (Task task : tasks) {
                result.append(task.toString()).append("\n");
            }
        }
        return result.toString();
    }
}
