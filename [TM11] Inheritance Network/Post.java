import java.util.ArrayList;
import java.util.List;

public class Post {
    private String username;
    private String content;
    private List<String> likes;

    public Post(String username, String content){
        this.username = username;
        this.content = content;
        this.likes = new ArrayList<>();
    }

    public String getUsername(){
        return username;
    }

    public String getContent(){
        return content;
    }

    public List<String> getLikes(){
        return likes;
    }

    public void like(String username){
        if(!likes.contains(username)){
            likes.add(username);
            System.out.println(username + " likes " + content);
        }
    }

    public void unlike(String username){
        if(likes.contains(username)){
            likes.remove(username);
            System.out.println(username + " unlikes " + content);
        }

    }
}
