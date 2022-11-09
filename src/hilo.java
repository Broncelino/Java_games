import java.lang.Math;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class hilo {
    public static void playGame() {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Rules: House rolls the dice and you choose if your roll will be greater or lesser");
        System.out.println("Duplicate numbers will be doubled");
        System.out.println();
        System.out.println("how many dice do you want to use?");
        String diceNums = myObj.nextLine();  // Read user input
        int diceNum = Integer.parseInt(diceNums);
        int wins = 0;
        int losses = 0;
        while (true) {
            int roll1 = total(roll(diceNum));
            System.out.println(roll1);
            System.out.println("Higher or Lower? enter h/l");
            String hilo = myObj.nextLine();
            if (Objects.equals(hilo, "h")) {
                System.out.println("higher");
                int roll2 = total(roll(diceNum));
                System.out.println("Your total is: " + roll2);
                if (roll2 > roll1) {
                    System.out.println("Congratulations, you win");
                    wins+=1;
                } else {
                    System.out.println("Sorry, you lose");
                    losses+=1;
                }
            }
            if (Objects.equals(hilo, "l")) {
                System.out.println("lower");
                int roll2 = total(roll(diceNum));
                System.out.println("Your total is: " + roll2);
                if (roll2 < roll1) {
                    System.out.println("Congratulations, you win");
                    wins+=1;
                } else {
                    System.out.println("Sorry, you lose");
                    losses+=1;
                }
            }
            System.out.println("Want to play again? (y/n)");
            String again = myObj.nextLine();
            if (Objects.equals(again, "n")) {
                break;
            }
        }
        System.out.println("The final score is "+wins+" Win(s) and "+losses+" Loss(es)");
    }
    public static ArrayList<Integer> roll(int num) {
        ArrayList<Integer> dice = new ArrayList<Integer>();
        for (int i = 0; i < num; i++) {
            int b = (int) (Math.random() * (6 - 1 + 1) + 1);
            dice.add(b);
        }

        System.out.println(dice);
        return dice;
    }

    public static int total(ArrayList<Integer> nums) {
        ArrayList<Integer> values = new ArrayList<Integer>();
        for (int i = 0; i < nums.size(); i++) {
            for (int k = 0; k < nums.size(); k++) {
                if (i != k && nums.get(i) == nums.get(k)) {
                    values.add(nums.get(i) * 2);
                    break; //number can only be added once so this stops it after it sees a single dupe
                }
            }
            if (values.size() != i+1) {
                values.add(nums.get(i));
            }
        }
        //System.out.println(values);
        int total = 0;
        for(int i : values){
            total +=i;
        }

        return total;
    }
}