import java.util.Scanner;

public class AuctionSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter item name: ");
        String item = sc.nextLine();
        Auction auction = new Auction(item);
    

        System.out.println("\nWelcome to the Auction System!");
        System.out.println("Item: " + auction.getItem());

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Bidder");
            System.out.println("2. Remove Bidder");
            System.out.println("3. List Bidders");
            System.out.println("4. Start Auction");
            System.out.println("5. Exit");

            System.out.print("Option: ");
            int choice = sc.nextInt();
            sc.nextLine(); 
            switch (choice) {
                case 1:
                    System.out.print("Enter bidder name: ");
                    String name = sc.nextLine();
                    Bidder bidder = new Bidder(name);
                    auction.addBidder(bidder);
                    break;
                case 2:
                    System.out.print("Enter bidder name to remove: ");
                    String nameToRemove = sc.nextLine();
                    auction.removeBidder(nameToRemove);
                    break;
                case 3:
                    auction.listBidders();
                    break;
                case 4:
                    auction.startAuction();
                    break;
                case 5:
                    sc.close(); 
                    System.out.println("\nExiting the system.");
                    System.exit(0);
                default:
                    System.out.println("\nInvalid option! Please choose a valid option.");
            }
        }
    }
}
