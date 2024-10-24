class Bag{
    protected String brand;
    protected String bagName;

    public Bag(String brand, String bagName){
        this.brand = brand;
        this.bagName = bagName;
    }

    public String getBrand(){
        return bagName + " is from " + brand;
    }
} 

class Hermes extends Bag{
    private String color;

    public Hermes(String brand, String bagName, String color){
        super(brand, bagName);
        this.color = color;
    }

    @Override
    public String getBrand() {
        return bagName + " is from " + brand + " with color " + color;
    }
}

class Main{
    public static void main(String[] args) {
        Hermes hermesBag = new Hermes("Hermes", "Birkin", "Orange");
        
        System.out.println(hermesBag.getBrand());
    }
}