package Strategy;

import java.util.Comparator;
import java.util.List;

// Concrete strategy for prioritizing tasks by priority level
class PrioritizeByPriority implements TaskPrioritizationStrategy {
    @Override
    public void prioritizeTasks(List<Task> tasks) {
        tasks.sort(Comparator.comparingInt(Task::getPriority));
    }
}