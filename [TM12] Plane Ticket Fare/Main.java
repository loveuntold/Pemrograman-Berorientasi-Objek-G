import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        ArrayList<Ticket> tickets = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        int choice;

        System.out.println("Welcome to Ticket Reservation System");
        do{
            System.out.println("1. Buy Ticket");
            System.out.println("2. View All Tickets");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch(choice){
                case 1: 
                    System.out.print("\nEnter your name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter base fare: ");
                    double baseFare = scanner.nextDouble();
                    System.out.println("1. First Class");
                    System.out.println("2. Business");
                    System.out.println("3. Economy");
                    System.out.print("Choose ticket class: ");
                    int ticketClass = scanner.nextInt();

                    scanner.nextLine();
                    Ticket ticket = null;
                    switch(ticketClass){
                        case 1:
                            ticket = new FirstClass(name, baseFare);
                            break;
                        case 2:
                            ticket = new Business(name, baseFare);
                            break;
                        case 3:
                            ticket = new Economy(name, baseFare);
                            break;
                        default:
                            System.out.println("Invalid ticket class");
                            break;
                    }

                    if(ticket != null){
                        tickets.add(ticket); 
                        System.out.println("\nTicket bought successfully\n");
                    }
                    break;

                case 2:
                    if(tickets.isEmpty()){
                        System.out.println("No tickets bought yet");
                    }else{
                        System.out.println("\nAll Tickets");
                        for(int i=0; i<tickets.size(); i++){
                            System.out.println((i + 1) + ". \n" + tickets.get(i) + "\n");
                        }
                    }
                    break;

                case 3: 
                    System.out.println("\nThank you for using Ticket Reservation System");
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        } while(choice != 3);
    }
}
