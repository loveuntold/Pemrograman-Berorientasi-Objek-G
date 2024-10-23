import java.util.Scanner;

public class Parser{
    private CommandWord commands;
    private Scanner reader;
    
    public Parser(){
        commands = new CommandWord();
        reader = new Scanner(System.in);
    }
    
    public Command getCommand(){
        String inputLine;
        String word1 = null;
        String word2 = null;
        
        System.out.print("> ");
        
        inputLine = reader.nextLine();
        String words[] = inputLine.split(" ");

        if(words.length > 0){
            word1 = words[0];
        }

        if(words.length > 1){
            word2 = words[1];
        }



        if(commands.isCommand(word1)){
            return new Command(word1, word2);
        }else{
            return new Command(null, word2);
        }
    }
    
    public void showCommands(){
        commands.showAll();
    }
}