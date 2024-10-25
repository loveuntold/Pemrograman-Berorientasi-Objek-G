import java.util.ArrayList;

public class FoodOrder {
    private ArrayList<String> menuItems;  
    private double totalPrice;            
    private boolean isPaid;               

    public FoodOrder(){
        menuItems = new ArrayList<>();
        totalPrice = 0.0;
        isPaid = false;
    }

    public void addMenuItem(String itemName, double price){
        menuItems.add(itemName);  
        totalPrice += price;      
        System.out.println(itemName + " added to the order. Price: Rp" + price);
    }

    public double calculateTotalPrice(){
        return totalPrice;
    }

    public void markAsPaid(){
        isPaid = true;
        System.out.println("Order has been paid.");
    }

    public void getOrderDetails(){
        System.out.println("\nOrder Details:");
        for(String item : menuItems) {
            System.out.println("- " + item);
        }

        System.out.println("Total Price: Rp" + totalPrice);
        if(isPaid) {
            System.out.println("Status: Paid\n");
        } else {
            System.out.println("Status: Unpaid\n");
        }
    }

    public static void main(String[] args){
        FoodOrder order = new FoodOrder();

        order.addMenuItem("Nasi Goreng", 25000);
        order.addMenuItem("Ayam Bakar", 35000);
        order.addMenuItem("Es Teh", 5000);

        order.getOrderDetails();
        order.markAsPaid();
        order.getOrderDetails();
    }
}
