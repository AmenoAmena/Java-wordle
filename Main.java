import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String[] word  = {"a","p","p","l","e"};
        Wordle w = new Wordle(word);
        ArrayList<String> arrList = w.gameStart();
        boolean end = true;
        System.out.println(arrList);
        while (end){
            ArrayList<String> gameFieldList = w.takeGuess();
            end = w.isEnded();
        }
    }
}