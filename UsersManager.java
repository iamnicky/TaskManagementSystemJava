import java.util.ArrayList;
import java.util.List;

public class UsersManager {
    private List<User> users= new ArrayList<>();

    public User getUser(String name) {
        for (User user:
             users) {
            if(user.getName().equals(name)){
                return user;
            }
        }
        return null;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void addUser(String username){
        users.add(new User(username));
    }
    public void removeUser(String username){
        users.remove(new User(username));
    }
}

class User{
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
