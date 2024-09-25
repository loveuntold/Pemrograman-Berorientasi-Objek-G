class ClockDisplay{
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private NumberDisplay seconds;
    private String displayString; 

    public ClockDisplay(){
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
        updateDisplay();
    }

    public ClockDisplay(int hour, int minute, int second){
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
        setTime(hour, minute, second);
    }

    public void timeTick(){
        seconds.inc();
        if(seconds.getValue() == 0){
            minutes.inc();
            if(minutes.getValue() == 0){
                hours.inc();
            }
        }
        updateDisplay();
    }

    public void setTime(int hour, int minute, int second){
        hours.setValue(hour);
        minutes.setValue(minute);
        seconds.setValue(second);
        updateDisplay();
    }

    private void updateDisplay(){
        displayString = hours.getDisplayValue() + ":" + minutes.getDisplayValue() + "." + seconds.getDisplayValue();
    }
    
    public String getTime(){
        return displayString;
    }
}