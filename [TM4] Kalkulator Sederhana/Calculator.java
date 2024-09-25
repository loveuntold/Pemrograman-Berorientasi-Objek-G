public class Calculator{
    private double num1;
    private double num2;

    public void enterFirstNum(double num){
        this.num1 = num;
    }

    public void enterSecondNum(double num){
        this.num2 = num;
    }

    public double add(){
        return num1 + num2;
    }

    public double subtract(){
        return num1 - num2;
    }

    public double multiply(){
        return num1 * num2;
    }

    public double divide(){
        return num1 / num2;
    } 
}
