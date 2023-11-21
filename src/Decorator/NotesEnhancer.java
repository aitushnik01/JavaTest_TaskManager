package Decorator;

// Concrete decorator for adding notes to tasks
class NotesEnhancer implements TaskEnhancer {
    private Task task;

    public NotesEnhancer(Task task) {
        this.task = task;
    }

    @Override
    public void displayTaskDetails() {
        task.displayTaskDetails();
        addFunctionality();
    }

    @Override
    public void addFunctionality() {
        System.out.println("Notes added to the task.");
    }
}
