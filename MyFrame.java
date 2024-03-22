
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener {
    JMenuBar menuBar;
    JMenu fileMenu;
    JMenu editMenu;
    JMenu turnMenu;
    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;
    JMenuItem combatResultsItem;

    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000, 700);
        this.setLayout(new FlowLayout());

        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        turnMenu = new JMenu("Turn");

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(turnMenu);

        loadItem = new JMenuItem("Load");
        saveItem = new JMenuItem("Save");
        exitItem = new JMenuItem("Exit");
        combatResultsItem = new JMenuItem("Combat Results");

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);
        combatResultsItem.addActionListener(this);

        fileMenu.setMnemonic(KeyEvent.VK_F); // alt + F for file
        editMenu.setMnemonic(KeyEvent.VK_E); // alt + E for edit
        turnMenu.setMnemonic(KeyEvent.VK_T); // alt + T for turn
        loadItem.setMnemonic(KeyEvent.VK_L); // alt + L for load
        saveItem.setMnemonic(KeyEvent.VK_S); // alt + S for save
        exitItem.setMnemonic(KeyEvent.VK_Q); // alt + Q for exit
        combatResultsItem.setMnemonic(KeyEvent.VK_R);

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);
        turnMenu.add(combatResultsItem);

        this.setJMenuBar(menuBar);


        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loadItem) {
            System.out.println("Loaded");
                }
        if (e.getSource() == saveItem) {
            System.out.println("saved");
                }
        if (e.getSource() == exitItem) {
            System.exit(0);
                }
        if (e.getSource() == combatResultsItem) {
             {
                SwingUtilities.invokeLater(() -> {
                new CombatResults().setVisible(true);
                            });
                        }
                    }
                }
}