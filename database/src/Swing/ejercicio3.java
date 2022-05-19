package Swing;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class ejercicio3 {
    public static void addComponetsToNorthPane(Container frame) {



        JCheckBox katniss = new JCheckBox("Katniss");

        JCheckBox peeta = new JCheckBox("Peeta");


        frame.add(katniss);
        frame.add(peeta);




    }
    public static void addComponetsToEastPane(Container frame4) {

        ButtonGroup group = new ButtonGroup();
        JRadioButton[] array = new JRadioButton[3];

        array[0] = new JRadioButton("OPT 1");
        array[0].setSelected(true);
        array[1] = new JRadioButton("OPT 2");
        array[2] = new JRadioButton("OPT 3");

        group.add(array[0]);
        group.add(array[1]);
        group.add(array[2]);
    /*
        frame4.add(array[0]);
        frame4.add(array[1]);
        frame4.add(array[2]);
        JRadioButton one = new JRadioButton("OPT 1");

        JRadioButton two = new JRadioButton("OPT 2");
        JRadioButton three = new JRadioButton("OPT 3");

        frame4.add(one);
        frame4.add(two);
        frame4.add(three);

    */


    }
    public static void addComponetsToSounthPane(Container frame2) {



        JToggleButton one = new JToggleButton("Button 1");

        JToggleButton two = new JToggleButton("Button 2");


        frame2.add(one);
        frame2.add(two);





    }
    public  static void createAndShowGUI(){

        JFrame window = new JFrame();
        window.setLayout(new BorderLayout());

        JPanel nPanel = new JPanel();
        nPanel.setBackground(Color.RED);
        nPanel.setLayout(new FlowLayout());
        window.add(nPanel,BorderLayout.NORTH);
       addComponetsToNorthPane(nPanel);



        JPanel sPanel = new JPanel();
        sPanel.setLayout(new BoxLayout(sPanel,BoxLayout.X_AXIS));
        sPanel.setBackground(Color.BLUE);
        window.add(sPanel,BorderLayout.SOUTH);
        addComponetsToSounthPane(sPanel);
        sPanel.setBorder(new EmptyBorder(new Insets(10 , 0, 10, 10)));
       // sPanel.setPreferredSize(new Dimension(0, 50));



        JPanel ePanel = new JPanel();
        ePanel.setLayout(new BoxLayout(ePanel,BoxLayout.Y_AXIS));
        ePanel.setBackground(Color.GREEN);
        window.add(ePanel,BorderLayout.EAST);
       // ePanel.setBorder(new Insets(50, 10, 100, 40));
        addComponetsToEastPane(ePanel);


        JPanel cPanel = new JPanel();
        cPanel.setLayout(new GridLayout( 2, 2));
        cPanel.setBackground(Color.YELLOW);
        window.add(cPanel,BorderLayout.CENTER);
      // addComponetsToWestPane(cPanel);



        window.setSize(800, 400);
        window.setVisible(true);
    }
    public static void main(String[] args) {

        createAndShowGUI();
    }
}
