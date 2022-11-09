import java.util.Objects;
import java.util.Scanner;  // Import the Scanner class
public class toe {
    public static void playGame(){
        Scanner myObj = new Scanner(System.in);
        while(true){
        String[] game = {"0","1","2","3","4","5","6","7","8"};
        int moveCount = 0;
        while(true){
            printBoard(game);
            getGuess("O",game);
            moveCount+=1;
            if(checkWin(game)) {
                printBoard(game);
                System.out.println("the O player wins");
                break;
            }
            else if (moveCount == 9){
                System.out.println("It's a draw");
                break;
            }
            printBoard(game);
            getGuess("X",game);
            moveCount+=1;
            if(checkWin(game)){
                printBoard(game);
                System.out.println("the X player wins");
                break;
            }
            else if (moveCount == 9){
                System.out.println("It's a draw");
                break;
            }
        }
            System.out.println("Want to play again? (y/n)");
            String again = myObj.nextLine();
            if (Objects.equals(again, "n")) {
                break;
            }
    }

    }
    public static void printBoard(String[] game){
        //System.out.println(game);
        System.out.println(game[0] + '|' + game[1] + '|' + game[2]);
        System.out.println("-----");
        System.out.println(game[3] + '|' + game[4] + '|' + game[5]);
        System.out.println("-----");
        System.out.println(game[6] + '|' + game[7] + '|' + game[8]);
    }
    public static String[] getGuess(String player, String[] game){
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter move");
        while(true){

            String move = myObj.nextLine();  // Read user input
            System.out.println("You chose: " + move);  // Output user input
            int moveint = Integer.parseInt(move);
            if (move.equals(game[moveint])){

                game[moveint] = player;

                break;
            }
            else{
                System.out.println("Enter a Valid Move:");
            }
        }

        return game;
    }
    public static boolean checkWin(String[] game){
        if(game[0] == game[1] && game[0] == game[2]){
            return true;
        }
        if(game[3] == game[4] && game[3] == game[5]){
            return true;
        }
        if(game[6] == game[7] && game[6] == game[8]){
            return true;
        }
        if(game[0] == game[3] && game[0] == game[6]){
            return true;
        }
        if(game[1] == game[4] && game[1] == game[7]){
            return true;
        }
        if(game[2] == game[5] && game[2] == game[8]){
            return true;
        }
        if(game[0] == game[4] && game[0] == game[8]){
            return true;
        }
        if(game[2] == game[4] && game[2] == game[6]){
            return true;
        }
        else{
            return false;
        }
    }
}
