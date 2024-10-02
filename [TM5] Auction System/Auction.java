import java.util.ArrayList;
import java.util.Scanner;

public class Auction {
    private ArrayList<Bidder> bidders;
    private String item;
    private double highestBid;
    private Bidder highestBidder;

    public Auction(String item){
        this.item = item;
        this.bidders = new ArrayList<>();
        this.highestBid = 0;
        this.highestBidder = null;
    }

    public void addBidder(Bidder bidder){
        bidders.add(bidder);
        System.out.println("\nBidder " + bidder.getName() + " has been added.");
    }

    public void removeBidder(String name){
        Bidder toRemove = null;
        for(Bidder b : bidders){
            if(b.getName().equalsIgnoreCase(name)){
                toRemove = b;
                break;
            }
        }
        if(toRemove != null){
            bidders.remove(toRemove);
            System.out.println("\nBidder " + name + " has been removed.");
        } else {
            System.out.println("\nBidder with name " + name + " not found.");
        }
    }

    public void listBidders(){
        if(bidders.isEmpty()){
            System.out.println("\nNo bidders registered.");
        } else{
            System.out.println("\nList of Bidders:");
            for(Bidder b : bidders){
                System.out.println("- " + b.getName());
            }
        }
    }

    private Bidder findBidder(String name){
        for(Bidder b : bidders){
            if(b.getName().equalsIgnoreCase(name)){
                return b;
            }
        }
        return null;
    }

    public void startAuction(){
        Scanner sc = new Scanner(System.in);
        double bid;
        String name;
        Bidder bidder;

        System.out.println("\nStarting auction for " + item + "...");
        System.out.println("Enter 'stop' to stop the auction.");

        while(true){
            System.out.print("\nEnter bidder name: ");
            name = sc.nextLine();

            if(name.equalsIgnoreCase("stop")){
                break;
            }

            bidder = findBidder(name);
            if(bidder == null){
                System.out.println("\nBidder not found.");
                continue;
            }

            System.out.print("Enter bid amount: ");
            if(sc.hasNextDouble()){
                bid = sc.nextDouble();
                sc.nextLine();

                if(bid > highestBid){
                    highestBid = bid;
                    highestBidder = bidder;
                    System.out.println("\nNew highest bid: " + highestBid);
                } else{
                    System.out.println("\nBid amount must be higher than the current highest bid of " + highestBid);
                }
            } else{
                System.out.println("\nInvalid bid. Please enter a valid number.");
                sc.next(); 
            }
        }

        System.out.println("\nAuction has ended.");
        if(highestBidder != null){
            System.out.println("Winner: " + highestBidder.getName());
            System.out.println("Winning bid: " + highestBid);
        } else {
            System.out.println("\nNo bids were placed.");
        }

    }

    public String getItem(){
        return this.item;
    }
    
}
