import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the project");
        String projectName = sc.nextLine();
        ProjectManager projectManager = new ProjectManager(projectName);
        UsersManager usersManager = new UsersManager();
        usersManager.addUser("Nicky");
        usersManager.addUser("Shruti");
        TaskManager taskManager = new TaskManager();
        taskManager.addTask("Learn Java");
        taskManager.addTask("Practice OOPS");

        System.out.println("Enter username you want to give task");
        String name = sc.nextLine();
        if(usersManager.getUser(name)!=null){
            projectManager.assignTask(usersManager.getUser(name),taskManager.getTasks());
        }
    }
}
