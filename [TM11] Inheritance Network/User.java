import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String name;
    private String status;

    public User(String username, String name, String status){
        this.username = username;
        this.name = name;
        this.status = status;
    }

    public String getUsername(){
        return username;
    }

    public String getName(){
        return name;
    }

    public String getStatus(){
        return status;
    }
}
