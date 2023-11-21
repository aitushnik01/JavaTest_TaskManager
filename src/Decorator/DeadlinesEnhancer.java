package Decorator;

// Concrete decorator for setting deadlines to tasks
class DeadlinesEnhancer implements TaskEnhancer {
    private Task task;

    public DeadlinesEnhancer(Task task) {
        this.task = task;
    }

    @Override
    public void displayTaskDetails() {
        task.displayTaskDetails();
        addFunctionality();
    }

    @Override
    public void addFunctionality() {
        System.out.println("Deadline set for the task.");
    }
}
