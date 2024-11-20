public class FirstClass extends Ticket{
    public FirstClass(String name, double baseFare){
        super(name, baseFare);
    }

    @Override
    public double calculateFare(){
        return super.calculateFare() * 1.5; 
    }

    @Override
    public String getFacilities(){
        return "Priority Check-in, Priority Boarding, Free Lounge, and Extra Legroom";    
    }
    
}
