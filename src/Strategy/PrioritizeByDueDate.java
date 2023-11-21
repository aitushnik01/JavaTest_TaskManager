package Strategy;

import java.util.Comparator;
import java.util.List;

// Concrete strategy for prioritizing tasks by due date
class PrioritizeByDueDate implements TaskPrioritizationStrategy {
    @Override
    public void prioritizeTasks(List<Task> tasks) {
        tasks.sort(Comparator.comparing(Task::getDueDate));
    }

}