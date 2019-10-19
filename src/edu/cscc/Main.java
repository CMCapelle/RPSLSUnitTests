package edu.cscc;
import java.util.*;

/**
 * Savings main class
 * @author Corey Capelle
 * @version 1.0
 */


public class Main {

    /**
     * Scanner reads input for evaluation by application
     */
    private static Scanner input = new Scanner(System.in);

    /** Main method prompts user for input, validates input, and uses RPSLSpock class to decide winner
     * @param args command-line arguments for the application
     */
    public static void main(String[] args) {

        String h_pick;
        String c_pick;
        String answer;
        boolean isValid;


        do {
            System.out.println("Let's play rock, paper, scissors, lizard, spock");
            do {
                System.out.print("Enter your choice: ");
                h_pick = input.nextLine();
                isValid = RPSLSpock.isValidPick(h_pick);
                if (!isValid) {
                    System.out.println(h_pick + " is not a valid choice");
                }
            } while (!isValid);

            c_pick = RPSLSpock.generatePick();
            System.out.print("Computer picked " + c_pick + "  ");

            if (c_pick.equalsIgnoreCase(h_pick)) {
                System.out.println("Tie!");
            } else if (RPSLSpock.isComputerWin(c_pick, h_pick)) {
                System.out.println("Computer wins!");
            } else {
                System.out.println("You win!");
            }

            System.out.print("Play again ('y' or 'n'): ");
            answer = input.nextLine();
        } while ("Y".equalsIgnoreCase(answer));
        System.out.println("Live long and prosper!");
    }
}