/*
Name : Min Thant
ID : 6612012
Section : 544
 */
package classEx6;

import java.util.Scanner;

public class SimpleDiceGame {
    public static void main(String[] args) {
        Dice dice = new Dice(6);
        Scanner scanner = new Scanner(System.in);
        System.out.println("|DICE GAME|\n");
        System.out.println("How it works");
        System.out.println("A dice will be rolled and two players will guess what the number will be\nThe player's guess closest to the number wins!\nYou can set how many side the dice can be");
        System.out.print("\nHow many sides for the die : ");
        dice.setSides(scanner.nextInt());
        scanner.nextLine();

        int diceRoll = dice.roll();
        System.out.println("\nThe Dice has been rolled!");

        System.out.print("Player(1)'s guess : ");
        int player1Guess = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Player(2)'s guess : ");
        int player2Guess = scanner.nextInt();

        int p1Difference = Math.abs(diceRoll - player1Guess);
        int p2Difference = Math.abs(diceRoll - player2Guess);

        System.out.println("\nLets see who wins");
        for (int i = 5; i > 0; i--) {
            System.out.print(i + " ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (p1Difference < p2Difference) {
            System.out.println("\nPlayer(1) wins");
        } else if (p1Difference > p2Difference){
            System.out.println("\nPlayer(2) wins");
        } else {
            System.out.println("\nDraw! no one wins");
        }
        System.out.println("The roll was " + diceRoll);
    }
}
