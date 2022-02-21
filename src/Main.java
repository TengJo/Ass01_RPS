import java.sql.SQLOutput;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String playerA;
        String playerB;


        System.out.print("Player A, what is your move? (R,P,S): ");
        playerA = in.nextLine();

        System.out.print("Player B, what is your move? (R,P,S): ");
        playerB = in.nextLine();

        if (playerA.equalsIgnoreCase("R") && (playerB.equalsIgnoreCase("R")))
        {
            System.out.println("It was a tie!");
        }
        else if (playerA.equalsIgnoreCase("P") && (playerB.equalsIgnoreCase("P")))
        {
            System.out.println("It was a tie!");
        }
        else if (playerA.equalsIgnoreCase("S") && (playerB.equalsIgnoreCase("S")))
        {
            System.out.println("It was a tie!");
        }
        else if (playerA.equalsIgnoreCase("R"))
        {
            {
                if (playerB.equalsIgnoreCase("P"))
                {
                    System.out.println("Player B wins!");
                }
                else if (playerB.equalsIgnoreCase("S"))
                {
                    System.out.println("Player A wins!");
                }
                else
                {
                    System.out.println("Player B has entered an incorrect value.");
                }
            }
        }
        else if (playerA.equalsIgnoreCase("S"))
        {
            if (playerB.equalsIgnoreCase("P"))
            {
                System.out.println("Player A wins!");
            }
            else if (playerB.equalsIgnoreCase("R"))
            {
                System.out.println("Player B wins!");
            }
            else
            {
                System.out.println("Player B has entered an incorrect value.");
            }
        }
        else if (playerA.equalsIgnoreCase("P"))
        {
            if (playerB.equalsIgnoreCase("R"))
            {
                System.out.println("Player A wins!");
            }
            else if (playerB.equalsIgnoreCase("S"))
            {
                System.out.println("Player B wins!");
            }
            else
            {
                System.out.println("Player B has entered an incorrect value.");
            }
        }
        else
        {
            System.out.println("Player A has entered an incorrect value.");
        }
        System.out.println("Do you want to play again.");
        // We never learned how to loop so, I thought this was fine for now
    }
}
