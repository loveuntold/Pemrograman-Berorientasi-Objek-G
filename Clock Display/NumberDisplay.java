class NumberDisplay {
    private int limit;
    private int value;

    public NumberDisplay(int maxValue){
        limit = maxValue;
        value = 0;
    }

    public int getValue(){
        return value;
    }

    public String getDisplayValue(){
        if(value < 10){
            return "0" + value;
        }else{
            return "" + value;
        }
    }

    public void setValue(int newValue){
        if(newValue >= 0 && newValue < limit){
            value = newValue;
        }
    }

    public void inc(){
        value = (value + 1) % limit;
    }
}