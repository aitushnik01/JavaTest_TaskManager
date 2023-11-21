package Observer;

import java.util.ArrayList;
import java.util.List;

// Concrete Task class implementing the TaskSubject interface
class TaskItem implements TaskSubject {
    private String taskName;
    private String taskStatus;
    private List<TaskObserver> observers = new ArrayList<>();

    public TaskItem(String taskName) {
        this.taskName = taskName;
        this.taskStatus = "Not started";
    }

    public void setStatus(String status) {
        this.taskStatus = status;
        notifyObservers(); // Notify observers when status changes
    }

    @Override
    public void attach(TaskObserver observer) {
        observers.add(observer);
    }

    @Override
    public void detach(TaskObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (TaskObserver observer : observers) {
            observer.update(this);
        }
    }

    // Other methods specific to TaskItem
    public Object displayTaskInfo() {
        System.out.println("Task: " + taskName + ", Status: " + taskStatus);
        return null;
    }
}