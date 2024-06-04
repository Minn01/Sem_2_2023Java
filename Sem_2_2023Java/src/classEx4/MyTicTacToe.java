/*
 * Name : Min Thant
 * ID : 6612012
 * Sec : 544
 */


package classEx4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyTicTacToe {
    public static void main(String[] args) {
        char[][] tttBoard = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        boolean gameFinished = false;
        char firstPlayer = ' ', secondPlayer = ' ';
        int player1Score = 0, player2Score = 0;

        System.out.println("=".repeat(50));
        System.out.printf("%" + 25 + "s%n", "TicTacToe");
        System.out.println("=".repeat(50));
        System.out.println("Instructions\n1. Firstly pick 'X' or 'O' what player(1) picks decides what player(2) picks.\n2. Then you are going to enter the matrix values of the chart which range from 0-2 and that's how you pick the square that you want to play\n");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            // you can choose what you want to pick
            System.out.print("First Player --> 'X' or 'O'? : ");
            try {
                char choice = scanner.nextLine().toUpperCase().charAt(0);
                if (choice == 'X') {
                    firstPlayer = 'X';
                    secondPlayer = 'O';
                    break;
                } else if (choice == 'O') {
                    firstPlayer = 'O';
                    secondPlayer = 'X';
                    break;
                } else {
                    System.out.println("Choice is invalid");
                }
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("YOUR CHOICE CANNOT BE BLANK PLEASE ENTER AN OPTION");
            }
        }

        while (!gameFinished) {
            showChart(tttBoard);
            player1Move(tttBoard, firstPlayer);
            showChart(tttBoard);
            if (whoWins(tttBoard) == firstPlayer) {
                player1Score++;
                System.out.println("\n"+ "*".repeat(21) + " Congratulations Player(1) " + "*".repeat(21));
                System.out.println("=".repeat(70));
                System.out.println("""
                 ____  _                            _               _                \s
                |  _ \\| | __ _ _   _  ___ _ __     / |    __      _(_)_ __  ___      \s
                | |_) | |/ _` | | | |/ _ \\ '__|    | |    \\ \\ /\\ / / | '_ \\/ __|     \s
                |  __/| | (_| | |_| |  __/ |       | |     \\ V  V /| | | | \\__ \\_ _ _\s
                |_|   |_|\\__,_|\\__, |\\___|_|       |_|      \\_/\\_/ |_|_| |_|___(_|_|_)
                               |___/                                                 \s
                """);
                System.out.println("=".repeat(70));
                System.out.print("Play Again? y/n : ");
                char yesNo = scanner.nextLine().toLowerCase().charAt(0);
                gameFinished = yesNo(yesNo, tttBoard);
            } else if (checkFull(tttBoard)) {
                System.out.println("""
                 ____                        \s
                |  _ \\ _ __ __ ___      __   \s
                | | | | '__/ _` \\ \\ /\\ / /   \s
                | |_| | | | (_| |\\ V  V / _ _\s
                |____/|_|  \\__,_| \\_/\\_(_|_|_) 
                """);
                System.out.print("Play Again? y/n : ");
                char yesNo = scanner.nextLine().toLowerCase().charAt(0);
                gameFinished = yesNo(yesNo, tttBoard);
            } else {
                player2Move(tttBoard, secondPlayer);
                if (whoWins(tttBoard) == secondPlayer) {
                    player2Score++;
                    System.out.println("\n"+ "*".repeat(23) + " Congratulations Player(2) " + "*".repeat(23));
                    System.out.println("=".repeat(74));
                    System.out.println("""
                 ____  _                            ____                _                \s
                |  _ \\| | __ _ _   _  ___ _ __     |___ \\     __      _(_)_ __  ___      \s
                | |_) | |/ _` | | | |/ _ \\ '__|      __) |    \\ \\ /\\ / / | '_ \\/ __|     \s
                |  __/| | (_| | |_| |  __/ |        / __/      \\ V  V /| | | | \\__ \\_ _ _\s
                |_|   |_|\\__,_|\\__, |\\___|_|       |_____|      \\_/\\_/ |_|_| |_|___(_|_|_)
                               |___/                                                     \s
                """);
                    System.out.println("=".repeat(74));
                    System.out.print("Play Again? y/n : ");
                    char yesNo = scanner.nextLine().toLowerCase().charAt(0);
                    gameFinished = yesNo(yesNo, tttBoard);
                } else if (checkFull(tttBoard)) {
                    System.out.println("""
                 ____                        \s
                |  _ \\ _ __ __ ___      __   \s
                | | | | '__/ _` \\ \\ /\\ / /   \s
                | |_| | | | (_| |\\ V  V / _ _\s
                |____/|_|  \\__,_| \\_/\\_(_|_|_) 
                """);
                    System.out.print("Play Again? y/n : ");
                    char yesNo = scanner.nextLine().toLowerCase().charAt(0);
                    gameFinished = yesNo(yesNo, tttBoard);
                }
            }
        }
        int lv = Math.max(String.valueOf(player1Score).length(), String.valueOf(player2Score).length());
        System.out.println("\nFinal scoreboard : ");
        System.out.println("+" + "-".repeat(11 + lv + 2) + "+");
        System.out.println(" Player(1) | " + player1Score);
        System.out.println(" Player(2) | " + player2Score);
        System.out.println("+" + "-".repeat(11 + lv + 2) + "+");
    }

    public static void showChart(char[][] tttBoard) { // This displays the chart
        for (int row = 0; row < tttBoard.length; row++) {
            for (int col = 0; col < tttBoard[row].length; col++) {
                if (col < tttBoard.length - 1) {
                    System.out.print(tttBoard[row][col] + " | ");
                } else {
                    System.out.print(tttBoard[row][col]);
                }
            }
            if (row < tttBoard.length - 1) {
                System.out.println("\n--|---|---");

            }
        }
        System.out.println();
    }

    public static boolean checkFull(char[][] tttBoard) { // checks if it's full
        int count = 0;
        for (char[] row : tttBoard) {
            for (char rowItem : row) {
                if (rowItem != ' ') {
                    count += 1;
                }
            }
        }
        return count == 9;
    }

    public static void player1Move (char[][] tttBoard, char firstPlayer) { // player 1 makes a move
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player(1)'s turn:-");
        while (true) {
            try {
                System.out.print("Enter row : ");
                int firstRowIndex = scanner.nextInt();
                if (firstRowIndex < 0 || firstRowIndex > 2) {
                    System.out.println("Player(1), The row needs to be within 0-2. Try Again");
                } else {
                    System.out.print("Enter column : ");
                    int firstColIndex = scanner.nextInt();
                    if (firstColIndex < 0 || firstColIndex > 2) {
                        System.out.println("Player(1), The column needs to be within 0-2. Try Again");
                    } else {
                        if (tttBoard[firstRowIndex][firstColIndex] == ' ') {
                            tttBoard[firstRowIndex][firstColIndex] = firstPlayer;
                        } else {
                            System.out.println("Player(1), that spot has already been filled");
                            continue;
                        }
                        break;
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Player(1), Please enter a number");
                scanner.nextLine();
            }
        }
    }

    public static void player2Move (char[][] tttBoard, char secondPlayer) { // player 2 makes a move
        Scanner scanner = new Scanner(System.in);
        System.out.println("Now it's Player(2)'s turn");
        while (true) {
            try {
                System.out.print("Enter row : ");
                int secondRowIndex = scanner.nextInt();
                if (secondRowIndex < 0 || secondRowIndex > 2) {
                    System.out.println("Player(2), The row needs to be within 0-2. Try Again");
                } else {
                    System.out.print("Enter column : ");
                    int secondColIndex = scanner.nextInt();
                    if (secondColIndex < 0 || secondColIndex > 2) {
                        System.out.println("Player(2), The column needs to be within 0-2. Try Again");
                    } else {
                        if (tttBoard[secondRowIndex][secondColIndex] == ' ') {
                            tttBoard[secondRowIndex][secondColIndex] = secondPlayer;
                        } else {
                            System.out.println("Player(2), that spot has already been filled");
                            continue;
                        }
                        break;
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Player(2), Please enter a number");
                scanner.nextLine();
            }
        }
    }



    public static char whoWins(char[][] tttBoard) {
        // Horizontal Check
        for (int rowIndex = 0; rowIndex < 3; rowIndex++) {
            if (tttBoard[rowIndex][0] == tttBoard[rowIndex][1] && tttBoard[rowIndex][1] == tttBoard[rowIndex][2] && tttBoard[rowIndex][1] != ' ') {
                return tttBoard[rowIndex][1];
            }
        }

        // Vertical Check
        for (int colIndex = 0; colIndex < 3; colIndex++) {
            if (tttBoard[0][colIndex] == tttBoard[1][colIndex] && tttBoard[1][colIndex] == tttBoard[2][colIndex] && tttBoard[1][colIndex] != ' ') {
                return tttBoard[1][colIndex];
            }
        }

        // Diagonal Check
        if (tttBoard[0][0] == tttBoard[1][1] && tttBoard[1][1] == tttBoard[2][2] && tttBoard[1][1] != ' ') {
            return tttBoard[1][1];
        } else if (tttBoard[0][2] == tttBoard[1][1] && tttBoard[1][1] == tttBoard[2][0] && tttBoard[1][1] != ' ') {
            return tttBoard[1][1];
        }

        // no condition
        return 'N';
    }

    public static void resetChart(char[][] tttBoard) { // resetting the chart
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tttBoard[i][j] = ' ';
            }
        }
    }

    public static boolean yesNo(char choice, char[][] tttBoard) { // determining the user's choice
        if (choice == 'y') {
            System.out.println("OK Let's go again");
            resetChart(tttBoard);
            return false;
        } else if (choice == 'n') {
            System.out.println("Thanks for playing");
            return true;
        } else {
            System.out.println("Invalid input! Exiting the program");
            return true;
        }
    }
}
