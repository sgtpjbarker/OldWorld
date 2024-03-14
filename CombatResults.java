
import java.util.Scanner;
import java.util.Random;
public class CombatResults {
    int wounds=0;
    int rake=0;
    int standard=0;
    int battleStandard=0;
    int flankAttack=0;
    int rearAttack=0;
    int highGround=0;
    int overKill=0;
    static int attackerResult=0;
    static int defenderResult=0;
    static int roll=0;
    public static int attackerResults(){
        Scanner attacker = new Scanner(System.in);
        System.out.println("Attacker, please ask these questions.");
        System.out.println("How many wounds did you do to the unit?");
        int wounds = attacker.nextInt();
        System.out.println("How many rakes do you have?");
        int rake = attacker.nextInt();
        System.out.println("Do you have a standard, enter 1 or 0?");
        int standard = attacker.nextInt();
        System.out.println("Do you have a battle standard, enter 1 or 0?");
        int battleStandard = attacker.nextInt();
        System.out.println("Did you attack the flank, 1 for yes, 0 for no?");
        int flankAttack = attacker.nextInt();
        System.out.println("Did you attack the rear, 2 for yes, 0 for no?");
        int rearAttack = attacker.nextInt();
        System.out.println("Are you on the high ground, 1 for yes, 0 for no?");
        int highGround = attacker.nextInt();
        System.out.println("How many wounds did you do for overkill?");
        int overKill = attacker.nextInt();

        return attackerResult=wounds+rake+standard+battleStandard+flankAttack+rearAttack+highGround+overKill;

    }
    public static int defenderResults(){
        Scanner attacker = new Scanner(System.in);
        System.out.println("Defender, please ask these questions.");
        System.out.println("How many wounds did you do to the unit?");
        int wounds = attacker.nextInt();
        System.out.println("How many ranks do you have?");
        int rake = attacker.nextInt();
        System.out.println("Do you have a standard, enter 1 or 0?");
        int standard = attacker.nextInt();
        System.out.println("Do you have a battle standard, enter 1 or 0?");
        int battleStandard = attacker.nextInt();
        System.out.println("Did you attack the flank, 1 for yes, 0 for no?");
        int flankAttack = attacker.nextInt();
        System.out.println("Did you attack the rear, 1 for yes, 0 for no?");
        int rearAttack = attacker.nextInt();
        System.out.println("Are you on the high ground, 1 for yes, 0 for no?");
        int highGround = attacker.nextInt();
        System.out.println("How many wounds did you do for overkill?");
        int overKill = attacker.nextInt();

        return defenderResult=wounds+rake+standard+battleStandard+flankAttack+rearAttack+highGround+overKill;

    }
        public int rollDice(){
            System.out.println("Here is a dice roll");
            return roll;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println(attackerResults());


            // Defender enters combat result
            System.out.print(defenderResults());

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


