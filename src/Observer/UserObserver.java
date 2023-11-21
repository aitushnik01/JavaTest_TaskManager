package Observer;

class UserObserver implements TaskObserver {
    private String username;

    public UserObserver(String username) {
        this.username = username;
    }

    @Override
    public void update(TaskItem task) {
        System.out.println(new StringBuilder().append("User ").append(username).append(" notified: Task ").append(task.displayTaskInfo()).append(" has been updated.").toString());
    }
}