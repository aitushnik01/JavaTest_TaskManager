import java.util.Scanner;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    public static void main(String[] args) {
        System.out.println(ANSI_CYAN + "=== Welcome to Task Management System ===" + ANSI_RESET);

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println(ANSI_YELLOW + "\nMenu:");
            System.out.println("1. " + ANSI_GREEN + "Create Task");
            System.out.println("2. " + ANSI_GREEN + "View Tasks");
            System.out.println("3. " + ANSI_GREEN + "Update Task Priority");
            System.out.println("4. " + ANSI_GREEN + "Delete Task");
            System.out.println("5. " + ANSI_RED + "Exit");
            System.out.print(ANSI_CYAN + "Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    createTask(scanner);
                    break;
                case 2:
                    viewTasks();
                    break;
                case 3:
                    updateTaskPriority(scanner);
                    break;
                case 4:
                    deleteTask(scanner);
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println(ANSI_RED + "Invalid choice. Please enter a valid option.");
            }
        }

        System.out.println(ANSI_CYAN + "Exiting Task Management System. " + ANSI_YELLOW + "Goodbye!" + ANSI_RESET);
    }

    private static void createTask(Scanner scanner) {
        System.out.println(ANSI_CYAN + "\n===============================");
        System.out.println("  Create New Task");
        System.out.println("===============================");

        System.out.print("Enter task name: ");
        String taskName = scanner.nextLine();

        System.out.print("Enter priority (1-5): ");
        int priority;
        try {
            priority = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println(ANSI_RED + "Invalid priority. Please enter a number.");
            return;
        }

        System.out.print("Enter due date (YYYY-MM-DD): ");
        String dueDate = scanner.nextLine();

        // Call method to create task with entered details
        SQL.TaskCRUD.createTask(taskName, priority, dueDate);
        System.out.println(ANSI_GREEN + "Task created successfully!");
    }

    private static void viewTasks() {
        System.out.println(ANSI_CYAN + "\n===============================");
        System.out.println("  View Tasks");
        System.out.println("===============================");

        // Call method to fetch and display tasks
        SQL.TaskCRUD.readTasks();
        System.out.println("Displaying tasks...");
    }

    private static void updateTaskPriority(Scanner scanner) {
        System.out.println(ANSI_CYAN + "\n===============================");
        System.out.println("  Update Task Priority");
        System.out.println("===============================");

        System.out.print("Enter task name to update priority: ");
        String taskName = scanner.nextLine();

        System.out.print("Enter new priority (1-5): ");
        int newPriority;
        try {
            newPriority = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println(ANSI_RED + "Invalid priority. Please enter a number.");
            return;
        }

        // Call method to update task priority
        SQL.TaskCRUD.updateTaskPriority(taskName, newPriority);
        System.out.println(ANSI_GREEN + "Task priority updated successfully!");
    }

    private static void deleteTask(Scanner scanner) {
        System.out.println(ANSI_CYAN + "\n===============================");
        System.out.println("  Delete Task");
        System.out.println("===============================");

        System.out.print("Enter task name to delete: ");
        String taskName = scanner.nextLine();

        // Call method to delete task
        SQL.TaskCRUD.deleteTask(taskName);
        System.out.println(ANSI_GREEN + "Task deleted successfully!");
    }
}
