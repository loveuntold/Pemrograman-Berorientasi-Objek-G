public class Economy extends Ticket{
    public Economy(String name, double baseFare){
        super(name, baseFare);
    }

    @Override
    public double calculateFare(){
        return super.calculateFare() * 1.1; 
    }

    @Override
    public String getFacilities(){
        return "Standard Check-in, Standard Boarding, and Standard Legroom";    
    }
    
}
