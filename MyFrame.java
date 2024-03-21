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

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        fileMenu.add(loadItem);
        fileMenu.add(editMenu);
        fileMenu.add(exitItem);

        this.setJMenuBar(menuBar);


        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loadItem) {
            System.out.println("Loaded");

            if (e.getSource() == saveItem) {
                System.out.println("saved");

                if (e.getSource() == exitItem) {
                    System.exit(0);
                }
            }


        }
    }
}