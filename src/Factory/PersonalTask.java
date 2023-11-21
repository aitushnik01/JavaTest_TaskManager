package Factory;

class PersonalTask implements Task {
    @Override
    public void displayTaskInfo() {
        System.out.println("This is a Personal Task");
    }
}

