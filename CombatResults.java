
import java.util.Scanner;
public class CombatResults {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Welcome to Combat Game!");

            // Attacker enters combat result
            System.out.print("Attacker, enter your combat result: ");
            int attackerResult = scanner.nextInt();

            // Defender enters combat result
            System.out.print("Defender, enter your combat result: ");
            int defenderResult = scanner.nextInt();

            // Compare combat results
            int result = attackerResult - defenderResult;

            if (result > 0) {
                System.out.println("Attacker wins!");
            } else if (result < 0) {
                System.out.println("Defender wins!");
            } else {
                System.out.println("It's a tie!");
            }

            scanner.close();
        }
    }


