package Strategy;

import java.util.List;

// Strategy interface for task prioritization
interface TaskPrioritizationStrategy {
    void prioritizeTasks(List<Task> tasks);
}