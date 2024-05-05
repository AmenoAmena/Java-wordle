import java.util.ArrayList;
import java.util.Scanner;

public class Wordle {
    ArrayList<String> arrList = new ArrayList<String>();
    String[] word = {"h", "e", "l", "l", "o"};
    public Wordle(String[] word){
        this.word = word;
    }

    public void showWord(){
        for (int i = 0;i<word.length;i++){
            System.out.print(word[i]);
        }
    }

    public ArrayList<String> gameStart(){
        for (int i = 0;i<word.length;i++){
            arrList.add(i,"_ ");
        }
        return arrList;
    }

    public ArrayList<String> takeGuess(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String _scan = scan.nextLine();

        for (int i = 0;i<word.length;i++){
            if (word[i].equals(_scan)){
                arrList.set(i,_scan);
            }
        }
        System.out.println(arrList);
        return arrList;
    }

    public boolean isEnded(){
        int counter = arrList.size();
        for (String s:arrList){
            if (s.equals("_ ")){
                return true;
            }
        }
        System.out.println("Game is ended you won");
        return false;
    }

}

