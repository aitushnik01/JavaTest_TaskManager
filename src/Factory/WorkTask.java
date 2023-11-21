package Factory;

class WorkTask implements Task {
    @Override
    public void displayTaskInfo() {
        System.out.println("This is a Work Task");
    }
}