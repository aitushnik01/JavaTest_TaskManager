package Strategy;

class Task {
    private String taskName;
    private int priority;
    private String dueDate;

    public Task(String taskName, int priority, String dueDate) {
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
    }

    public String getTaskName() {
        return taskName;
    }

    public int getPriority() {
        return priority;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void displayTaskInfo() {
        System.out.println("Task: " + taskName + ", Priority: " + priority + ", Due Date: " + dueDate);
    }
}
