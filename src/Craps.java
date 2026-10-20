import java.util.Random;
import java.util.Scanner;
public class Craps {
    static void main() {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        int sumGoal = 0;
        int sum = 1;
        boolean done = false;
        boolean done2 = false;
        int die1 = 1;
        int die2 = 2;
        int die3 = 3;
        int die4 = 4;
        String again = "";
        do{
            done2 = false;
            done = false;
            System.out.printf("%3s\t%3s\t%3s\n", "DIE 1", "DIE 2", "SUM");

            die1 = rnd.nextInt(6) + 1;
            die2 = rnd.nextInt(6) + 1;

            sumGoal = die1 + die2;
            System.out.printf("%3s\t%7s\t%6s\n", die1, die2, sumGoal);
            if (sumGoal == 7 || sumGoal == 11) {
                done2 = true;
                IO.println("NATURAL: YOU WIN");
                IO.println("Do you want to play again? [Y/N]");
                again = in.nextLine();
                if(again.equalsIgnoreCase("N"))
                {
                    done = true;
                }

            }
            else if (sumGoal == 2 || sumGoal == 3 || sumGoal == 12) {
                done2 = true;
                IO.println("CRAPS: YOU LOSE");
                IO.println("Do you want to play again? [Y/N]");
                again = in.nextLine();
                if (again.equalsIgnoreCase("N")) {
                    done = true;
                }

            }
            else
            {
                IO.println("THE POINT IS " + sumGoal);
            }
            while(!done2){
                IO.println("ROLLING AGAIN...");
                System.out.printf("%3s\t%3s\t%3s\n", "DIE 3", "DIE 4", "SUM");
                die3 = rnd.nextInt(6) + 1;
                die4 = rnd.nextInt(6) + 1;
                sum = die3 + die4;
                System.out.printf("%3s\t%7s\t%6s\n", die3, die4, sum);
                if(sum == 7)
                {
                    IO.println("YOU LOSE");
                    IO.println("Do you want to play again? [Y/N]");
                    again = in.nextLine();
                    if (again.equalsIgnoreCase("Y")) {
                        done2 = true;
                    }
                    else{
                        done2 = true;
                        done = true;
                    }
                }
                else if(sum == sumGoal){
                    IO.println("YOU WIN");
                    IO.println("Do you want to play again? [Y/N]");
                    again = in.nextLine();
                    if (again.equalsIgnoreCase("Y")) {
                        done2 = true;
                    }
                    else{
                        done2 = true;
                        done = true;
                    }
                }
            }
        }while(!done);
    }
}