public class Ticket {
    private String name;
    private double baseFare;

    public Ticket(String name, double baseFare){
        this.name = name;
        this.baseFare = baseFare;
    }

    public String getName(){
        return name;
    }

    public double getBaseFare(){
        return baseFare;
    }

    public double calculateFare(){
        return baseFare; 
    }

    public String getFacilities(){
        return "Standard Facilities";
    }

    @Override
    public String toString(){
        return "Passenger Name: " + name +
               "\nBase Fare: Rp " + baseFare +
               "\nTotal Fare: Rp " + calculateFare() +
               "\nFacilities: " + getFacilities();
    }
}
