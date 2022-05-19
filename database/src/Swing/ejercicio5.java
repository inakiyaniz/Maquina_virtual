package Swing;

import javax.swing.*;
import java.awt.*;

public class ejercicio5 {

    public static void addComponetsToNorthPane(Container frame){

        JPanel p1 = new JPanel(new GridLayout(1, 2, 10, 10));
        JLabel red = new JLabel("Red: ");
        JScrollPane scrollPane = new JScrollPane();
        p1.add(red);


        p1.add(scrollPane);
        frame.add(red);
        frame.add(p1);
        //frame.add(scrollPane);
    }
    public  static void createAndShowGUI(){

        JFrame window = new JFrame("My window");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(800, 400);


        JPanel nPanel = new JPanel();
        nPanel.setBackground(Color.RED);
        nPanel.setLayout(new BoxLayout(nPanel,BoxLayout.Y_AXIS));
        nPanel.setLayout(new FlowLayout());
        nPanel.setLayout(new GridLayout(3,1,1,1));
        window.add(nPanel,BorderLayout.NORTH);
        addComponetsToNorthPane(nPanel);





        window.setVisible(true);
    }
    public static void main(String[] args) {

        createAndShowGUI();
    }
}
