import java.util.Objects;

public class Task {
    private int ID;
    private String name;
    private String description;

    // Constructor with mandatory fields
    public Task(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    // Constructor with all fields
    public Task(int ID, String name, String description) {
        this.ID = ID;
        this.name = name;
        this.description = description;
    }

    // Getter for ID
    public int getID() {
        return ID;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for description
    public String getDescription() {
        return description;
    }

    // Method to generate textual representation
    public String toString() {
        return "Task[ID=" + ID + ", name='" + name + "', description='" + description + "']";
    }

    // Ensuring high cohesion and low coupling by not including any TaskManager related logic here
}
