import java.util.ArrayList;
import java.util.List;

public class Network {
    private List<User> users;
    private List<Post> posts;

    public Network(){
        this.users = new ArrayList<>();
        this.posts = new ArrayList<>();
    }

    public void addUser(User u){
        users.add(u);
        System.out.println(u.getName() + " has joined the network");
    }

    public void addPost(Post p){
        posts.add(p);
        System.out.println(p.getUsername() + " has posted: " + p.getContent());
    }

    public void likePost(String username, Post p){
        p.like(username);
    }

    public void unlikePost(String username, Post p){
        p.unlike(username);
    }

    public void displayPosts(){
        for(Post p : posts){
            System.out.println(p.getUsername() + " posted: " + p.getContent());
            System.out.println("Likes: " + p.getLikes());
        }
    }

    public void removeUser(User u){
        users.remove(u);
        System.out.println(u.getName() + " has left the network");
    }

    public void displayUsers(){
        for (int i=0; i<users.size(); i++) {
            System.out.println((i + 1) + ". " + users.get(i).getName());
        }
    }

    public List<Post> getPosts(){
        return posts;
    }

    public List<User> getUsers(){
        return users;
    }
}
