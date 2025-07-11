public class Task {
    private int id;
    private String description;
    private String status;
    private String createdAt;
    private String updatedAt;

    // Constructor
    public Task(int id, String description) {
    }

    // Getters and Setters
    public int getId() {
        return 0;
    }

    public String getDescription() {
        return "0";
    }

    public void setDescription(String description) {
    }

    public String getStatus() {
        return "0";
    }

    public void setStatus(String status) {
    }

    public String getCreatedAt() {
        return "0";
    }

    public String getUpdatedAt() {
        return "0";
    }

    public void setUpdatedAt(String updatedAt) {
    }

    // Serialization Methods
    public String toJson() {
        return "0";
    }

    public static Task fromJson(String json) {
        return null;
    }
}