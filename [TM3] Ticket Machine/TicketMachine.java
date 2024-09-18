public class TicketMachine {
    private int price;
    private int balance;
    // private int total;

    public TicketMachine(int ticketcost){
        price = ticketcost;
        balance = 0;
    }

    public int getPrice(){
        return price;
    }

    public int getBalance(){
        return balance;
    }

    public void insertMoney(int amount){
        if(amount > 0){
            balance += amount;
        } else {
            System.out.println("Insert a positive amount of money!");
        }
    }

    public void printTicket(){
        if(balance >= price){
            System.out.println("\n##################");
            System.out.println("# The BlueJ Line");
            System.out.println("# Ticket");
            System.out.println("# " + price + " cents.");
            System.out.println("##################");
            balance -= price;
            System.out.println("Balance: " + balance + " cents.\n");
        } else {
            System.out.println("\nYou must insert at least: " + (price - balance) + " cents.\n");
        }
    }

    public int refund(){
        int amountToRefund = balance;
        balance = 0;
        return amountToRefund;
    }
}
