import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks = new ArrayList<>();

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    public void addTask(String description){
        tasks.add(new Task(description));
        System.out.println("New Task :"+description+" added");
    }

    public void removeTask(String desc){
        for (Task task:
             tasks) {
            if(task.getDescription().equals(desc)){
                tasks.remove(task);
                System.out.println("Task: "+task.getDescription()+" removed");
                return;
            }
        }
        System.out.println("No data found!");

    }

    public void isFinished(String description){
        for (Task task:
                tasks) {
            if(task.getDescription().equals(description)){
                task.setCompleted(true);
                System.out.println("The task you entered was marked completed");
                return;
            }
        }
        System.out.println("No data found!");
    }
}

class Task{
    private String description;
    private boolean isCompleted;

    public Task(String description) {
        this.description = description;
        this.isCompleted = false;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}
