import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProjectManager {
    private String name;
    private List<Task> tasks;
    private Map<User, List<Task>> taskAssignments = new HashMap<>();

    public ProjectManager(String projectName) {
        this.name = projectName;
    }

    public void assignTask(User user, List<Task> tasks){
        taskAssignments.put(user,tasks);
    }
}
