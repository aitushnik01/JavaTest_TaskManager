package Decorator;

// BaseTask represents the basic task without additional functionalities
class BasicTask implements Task {
    private String taskName;

    public BasicTask(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void displayTaskDetails() {
        System.out.println("Task: " + taskName);
    }
}
