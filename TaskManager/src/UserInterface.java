import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TaskManager taskManager = new TaskManager();

        System.out.println("Welcome to the Task Manager!");

        while (true) {
            System.out.println("\nSelect an operation:");
            System.out.println("1. Show all current tasks");
            System.out.println("2. Add a new task");
            System.out.println("3. Remove an existing task");
            System.out.println("4. Exit the program");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("All Tasks:\n" + taskManager.getAllTasks());
                    break;
                case 2:
                    System.out.println("Enter task ID:");
                    int newTaskID = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.println("Enter task name:");
                    String newTaskName = scanner.nextLine();
                    System.out.println("Enter task description (optional):");
                    String newTaskDescription = scanner.nextLine();
                    Task newTask = new Task(newTaskID, newTaskName, newTaskDescription);
                    if (taskManager.addTask(newTask)) {
                        System.out.println("Task added successfully.");
                    } else {
                        System.out.println("Task with the same ID already exists. Operation unsuccessful.");
                    }
                    break;
                case 3:
                    System.out.println("Enter the ID of the task to remove:");
                    int taskToRemoveID = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    if (taskManager.removeTask(taskToRemoveID)) {
                        System.out.println("Task removed successfully.");
                    } else {
                        System.out.println("Task with the given ID not found. Operation unsuccessful.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid operation.");
            }
        }
    }
}
