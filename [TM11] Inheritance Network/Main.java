import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Network net = new Network(); 
        Scanner scanner = new Scanner(System.in);
        String input = "";
        int choice = 0;

        do {
            System.out.println("1. Add user");
            System.out.println("2. Add post");
            System.out.println("3. Like post");
            System.out.println("4. Unlike post");
            System.out.println("5. Display posts");
            System.out.println("6. Remove user");
            System.out.println("7. Display users");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch(choice){
                case 1:
                    System.out.println("\n");

                    System.out.print("Enter username: ");
                    String username = scanner.nextLine();
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter status: ");
                    String status = scanner.nextLine();

                    User u = new User(username, name, status); 
                    System.out.println("\n");
                    net.addUser(u);
                    System.out.println("\n");
                    break;

                case 2:
                    System.out.println("\n");

                    System.out.print("Enter username: ");
                    username = scanner.nextLine();
                    System.out.print("Enter content: ");
                    String content = scanner.nextLine();

                    Post p = new Post(username, content); 
                    System.out.println("\n");
                    net.addPost(p);
                    System.out.println("\n");
                    break;

                case 3:
                    System.out.println("\n");

                    System.out.print("Enter username: ");
                    username = scanner.nextLine();
                    System.out.print("Enter post content: ");
                    content = scanner.nextLine();
                    System.out.println("\n");

                    for(Post post : net.getPosts()){ 
                        if(post.getContent().equals(content)){
                            net.likePost(username, post);
                            break;
                        }
                    }
                    System.out.println("\n");
                    break;

                case 4:
                    System.out.println("\n");

                    System.out.print("Enter username: ");
                    username = scanner.nextLine();
                    System.out.print("Enter post content: ");
                    content = scanner.nextLine();
                    System.out.println("\n");

                    for(Post post : net.getPosts()){ 
                        if(post.getContent().equals(content)){
                            net.unlikePost(username, post);
                            break;
                        }
                    }
                    System.out.println("\n");
                    break;

                case 5:
                    System.out.println("\n");
                    net.displayPosts();
                    System.out.println("\n");
                    break;

                case 6:
                    System.out.println("\n");
                    System.out.print("Enter username: ");
                    username = scanner.nextLine();
                    for(User user : net.getUsers()){  
                        if(user.getUsername().equals(username)){
                            net.removeUser(user);
                            break;
                        }
                    }
                    System.out.println("\n");
                    break;

                case 7:
                    System.out.println("\n");
                    net.displayUsers();
                    System.out.println("\n");
                    break;

                case 8:
                    System.out.println("\n");
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while(choice != 8);
    }
}
