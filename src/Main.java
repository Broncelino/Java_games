import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;  // Import the Scanner class


public class Main {
    public static void main(String[] args) {
        //hilo.total(hilo.roll(10));
        //toe.playGame();
        //hilo.playGame();
        Scanner myObj = new Scanner(System.in);
        while(true){
            System.out.println("1. Tic Tac Toe");
            System.out.println("2. Higher or Lower");
            System.out.println("Enter the number of the game you want to play:");
            String selection = myObj.nextLine();
            if (selection.equals("1")){
                toe.playGame();
            }
            if (selection.equals("2")){
                hilo.playGame();
            }
            System.out.println("Want to play another game? (y/n)");
            String again = myObj.nextLine();
            if (Objects.equals(again, "n")) {
                break;
            }
        }
        System.out.println("End of games");
    }




}