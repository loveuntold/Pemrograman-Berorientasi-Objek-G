class ParkingTicketMachine{
    private int balance; 
    private int ticketPrice;
    private int ticketTime;

    public ParkingTicketMachine(int ticketPrice){
        this.ticketPrice = ticketPrice;
        this.balance = 0;
        this.ticketTime = 0;
    }

    public void insertMoney(int amount){
        if(amount > 0){
            balance += amount;
            System.out.println("You inserted: Rp" + amount + ". Current balance: Rp" + balance);
        } else{
            System.out.println("Please insert a valid amount of money.");
        }
    }

    public void issueTicket(){
        if(balance >= ticketPrice){
            ticketTime = balance / ticketPrice;
            balance -= ticketTime * ticketPrice;
            System.out.println("Ticket issued for " + ticketTime + " hours of parking.");
            System.out.println("Remaining balance: Rp" + balance);
        } else{
            System.out.println("Insufficient balance to issue a ticket.");
        }
    }

    public int getTimePurchased() {
        return ticketTime;
    }
}

public class Main{
    public static void main(String[] args){
        ParkingTicketMachine machine = new ParkingTicketMachine(5000);

        machine.insertMoney(15000);
        machine.issueTicket();  
        
        System.out.println("You have purchased " + machine.getTimePurchased() + " hours of parking.");
    }
}