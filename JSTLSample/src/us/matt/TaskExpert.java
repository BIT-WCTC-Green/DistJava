package us.matt;

import java.util.ArrayList;
import java.util.List;

public class TaskExpert {
    List<Task> toDo = new ArrayList<>();

    public TaskExpert() {
        toDo.add(new Task("Rake the Leaves",true,Priority.MEDIUM));
        toDo.add(new Task("Bake Cookies",true,Priority.HIGH));
        toDo.add(new Task("Buy anniversary gift",false,Priority.LOW));
        toDo.add(new Task("Pay Bills",false,Priority.MEDIUM));
    }

    public List<Task> getToDo() {
        return toDo;
    }

    public List<Task> getToDoRemaining() {
        List<Task> toDoRemaining = new ArrayList<>();
        for (Task t: toDo) {
            if (t.isCompleted()) {
                toDoRemaining.add(t);
            }
        }
        return toDoRemaining;
    }

    @Override
    public String toString() {
        return "TaskExpert{" +
                "toDo=" + toDo +
                '}';
    }
}
