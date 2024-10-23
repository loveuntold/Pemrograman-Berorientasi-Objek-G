public class CommandWord{
    private String[] validCommands = {"go", "quit", "help"};
    
    public boolean isCommand(String aString){
        for(int i=0; i<validCommands.length; i++){
            if(validCommands[i].equals(aString)){
                return true;
            }
        }
        return false;
    }
    
    public void showAll(){
        for(String command : validCommands){
            System.out.print(command + " ");
        }
        System.out.println();
    }
}