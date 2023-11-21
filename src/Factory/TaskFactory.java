package Factory;

// TaskFactory to create different types of tasks
class TaskFactory {
    public Task createTask(String taskType) {
        switch (taskType.toLowerCase()) {
            case "personal":
                return new PersonalTask();
            case "work":
                return new WorkTask();
            default:
                throw new IllegalArgumentException("Invalid task type: " + taskType);
        }
    }
}