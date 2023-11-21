package Observer;

// Subject interface for tasks being observed
interface TaskSubject {
    void attach(TaskObserver observer);

    void detach(TaskObserver observer);

    void notifyObservers();
}
