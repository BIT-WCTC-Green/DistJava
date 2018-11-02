package us.matt;

public class Task {
    private String task;
    private boolean completed;
    private Priority priority;

    public Task(String task, boolean completed, Priority priority) {
        this.task = task;
        this.completed = completed;
        this.priority = priority;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }
}
