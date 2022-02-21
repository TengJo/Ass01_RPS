import java.sql.SQLOutput;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String playerA;
        String playerB;


        System.out.print("Player A, what is your move? (R,P,S): ");
            playerA = in.nextLine();

        System.out.print("Player B, what is your move? (R,P,S): ");
        playerB = in.nextLine();

        if (playerA.equalsIgnoreCase(playerB))
        {
            System.out.println("It was a tie!");
        }
        else
        {
            if (playerA.equalsIgnoreCase("R"))
            {
                if (playerB.equalsIgnoreCase("P"))
                {
                    System.out.println("Player B wins!");
                }
                else
                {
                    System.out.println("Player A wins!");
                }
            }
            else if (playerA.equalsIgnoreCase("S"))
                {
                if (playerB.equalsIgnoreCase("P"))
                {
                    System.out.println("Player A wins!");
                }
                else
                {
                    System.out.println("Player B wins!");
                }
                }
            else if (playerA.equalsIgnoreCase("P"))
            {
                if (playerB.equalsIgnoreCase("R"))
                {
                    System.out.println("Player A wins!");
                }
                else
                {
                    System.out.println("Player B wins!");
                }
            }
        }
    }
}
