/*
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
*/
import javax.swing.*;
import java.awt.*;

public class CombatResults extends JFrame {
    private static int attackerResult = 0;
    private static int defenderResult = 0;

    public CombatResults() {
        setTitle("Combat Results");
        setSize(1400, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel attackerPanel = new JPanel(new GridLayout(0, 2, 8, 8));
        add(attackerPanel, BorderLayout.WEST);

        addQuestion(attackerPanel, "Attacker's Combat Results:");
        JTextField woundsAttackerField = addTextField(attackerPanel, "How many wounds did you do to the unit?", "0");
        JTextField rakeAttackerField = addTextField(attackerPanel, "How many rakes do you have?", "0");
        JTextField standardAttackerField = addTextField(attackerPanel, "Do you have a standard, enter 1 or 0?", "0");
        JTextField battleStandardAttackerField = addTextField(attackerPanel, "Do you have a battle standard, enter 1 or 0?", "0");
        JTextField flankAttackAttackerField = addTextField(attackerPanel, "Did you attack the flank, 1 for yes, 0 for no?", "0");
        JTextField rearAttackAttackerField = addTextField(attackerPanel, "Did you attack the rear, 2 for yes, 0 for no?", "0");
        JTextField highGroundAttackerField = addTextField(attackerPanel, "Are you on the high ground, 1 for yes, 0 for no?", "0");
        JTextField overKillAttackerField = addTextField(attackerPanel, "How many wounds did you do for overkill?", "0");

        JPanel defenderPanel = new JPanel(new GridLayout(0, 2, 10, 10));
        add(defenderPanel, BorderLayout.EAST);

        addQuestion(defenderPanel, "Defender's Combat Results:");
        JTextField woundsDefenderField = addTextField(defenderPanel, "How many wounds did you do to the unit?", "0");
        JTextField rakeDefenderField = addTextField(defenderPanel, "How many ranks do you have?", "0");
        JTextField standardDefenderField = addTextField(defenderPanel, "Do you have a standard, enter 1 or 0?", "0");
        JTextField battleStandardDefenderField = addTextField(defenderPanel, "Do you have a battle standard, enter 1 or 0?", "0");
        JTextField flankAttackDefenderField = addTextField(defenderPanel, "Did you attack the flank, 1 for yes, 0 for no?", "0");
        JTextField rearAttackDefenderField = addTextField(defenderPanel, "Did you attack the rear, 1 for yes, 0 for no?", "0");
        JTextField highGroundDefenderField = addTextField(defenderPanel, "Are you on the high ground, 1 for yes, 0 for no?", "0");
        JTextField overKillDefenderField = addTextField(defenderPanel, "How many wounds did you do for overkill?", "0");

        JButton calculateButton = new JButton("Calculate");
        add(calculateButton, BorderLayout.SOUTH);

        JTextArea resultArea = new JTextArea(10, 30);
        JScrollPane scrollPane = new JScrollPane(resultArea);
        add(scrollPane, BorderLayout.CENTER);

        calculateButton.addActionListener(e -> {
            attackerResult = calculateResult(
                    getIntValue(woundsAttackerField),
                    getIntValue(rakeAttackerField),
                    getIntValue(standardAttackerField),
                    getIntValue(battleStandardAttackerField),
                    getIntValue(flankAttackAttackerField),
                    getIntValue(rearAttackAttackerField),
                    getIntValue(highGroundAttackerField),
                    getIntValue(overKillAttackerField)
            );

            defenderResult = calculateResult(
                    getIntValue(woundsDefenderField),
                    getIntValue(rakeDefenderField),
                    getIntValue(standardDefenderField),
                    getIntValue(battleStandardDefenderField),
                    getIntValue(flankAttackDefenderField),
                    getIntValue(rearAttackDefenderField),
                    getIntValue(highGroundDefenderField),
                    getIntValue(overKillDefenderField)
            );

            resultArea.setText("Attacker's Results: " + attackerResult + "\n");
            resultArea.append("Defender's Results: " + defenderResult + "\n");
            int result = attackerResult - defenderResult;
            if (result > 0) {
                resultArea.append("Attacker wins!\n");
            } else if (result < 0) {
                resultArea.append("Defender wins!\n");
            } else {
                resultArea.append("It's a tie!\n");
            }
        });
    }

    private JTextField addTextField(JPanel panel, String label, String defaultValue) {
        JLabel questionLabel = new JLabel(label);
        panel.add(questionLabel);
        JTextField textField = new JTextField(defaultValue);
        textField.setColumns(10); // Adjust the column width here
        panel.add(textField);
        return textField;
    }

    private void addQuestion(JPanel panel, String question) {
        JLabel questionLabel = new JLabel(question);
        panel.add(questionLabel);
        panel.add(new JLabel());
    }

    private int getIntValue(JTextField textField) {
        return Integer.parseInt(textField.getText());
    }

    private int calculateResult(int wounds, int rake, int standard, int battleStandard,
                                int flankAttack, int rearAttack, int highGround, int overKill) {
        return wounds + rake + standard + battleStandard + flankAttack + rearAttack + highGround + overKill;
    }
}
   /* public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CombatResults().setVisible(true);
        });
    }
}
*/