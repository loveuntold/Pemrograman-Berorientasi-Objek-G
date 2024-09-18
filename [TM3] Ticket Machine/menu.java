import java.util.Scanner;

// class TicketMachine ada di file yang berbeda
public class menu{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        TicketMachine tm = new TicketMachine(100);

        System.out.println("\nWelcome to the Ticket Machine!");
        System.out.println("Ticket price: " + tm.getPrice() + " cents.");
        System.out.println("\nPlease insert money.");
        
        int choice = 0;
        do{
            System.out.println("1. Insert money");
            System.out.println("2. Print ticket");
            System.out.println("3. Refund");
            System.out.println("4. Exit");
            System.out.print("Choice: ");
            choice = input.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Insert money: ");
                    int money = input.nextInt();
                    tm.insertMoney(money);
                    System.out.println("\nBalance: " + tm.getBalance() + " cents.\n");

                    break;
                case 2:
                    tm.printTicket();
                    break;
                case 3:
                    System.out.println("\nRefunded: " + tm.refund() + " cents.\n");
                    break;
                case 4:
                    System.out.println("\nGoodbye!\n");
                    break;
                default:
                    System.out.println("\nInvalid choice!\n");
            }
        } while(choice != 4);
    }
    
}
