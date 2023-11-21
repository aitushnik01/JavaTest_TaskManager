package Strategy;

import java.util.List;

// Context class that uses the strategy
class TaskManager {
    private TaskPrioritizationStrategy strategy;

    public TaskManager(TaskPrioritizationStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(TaskPrioritizationStrategy strategy) {
        this.strategy = strategy;
    }

    public void prioritizeTasks(List<Task> tasks) {
        strategy.prioritizeTasks(tasks);
    }
}