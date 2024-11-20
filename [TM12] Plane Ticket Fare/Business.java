public class Business extends Ticket{
    public Business(String name, double baseFare){
        super(name, baseFare);
    }

    @Override
    public double calculateFare(){
        return super.calculateFare() * 1.25; 
    }

    @Override
    public String getFacilities(){
        return "Priority Check-in, Priority Boarding, and Extra Legroom";    
    }
}
