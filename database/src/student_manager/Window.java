package student_manager;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Window {
    public static void addComponetsToNorthPane(Container frame){
       JLabel title = new JLabel("STUDENT MANAGER");
        title.setFont( new Font("Serif", Font.CENTER_BASELINE, 25));

       frame.add(title);
    }
    public static void addComponetsToCenterPane(Container frame){

        JPanel panel1 = new JPanel();
        JTextField id2 = new JTextField(30);


        JPanel panel2 = new JPanel();
        JTextField name2 = new JTextField(30);

        JPanel panel3 = new JPanel();
        JTextField city2 = new JTextField(30);

        JPanel panel4 = new JPanel();
        JTextField phone2 = new JTextField(30);


        JPanel panel5 = new JPanel();
        JTextField birthdate2 = new JTextField(30);


        panel1.add(id2);
        panel2.add(name2);
        panel3.add(city2);
        panel4.add(phone2);
        panel5.add(birthdate2);

        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);
        frame.add(panel5);

    }
    public static void addComponetsToSouthPane(Container frame){

        JPanel panel1 = new JPanel();
        JLabel degree = new JLabel("Degree:");
        JComboBox degreebox = new JComboBox();




        JPanel panel2 = new JPanel();
        JToggleButton botton1 = new JToggleButton("Search");
        JToggleButton botton2 = new JToggleButton("Insert");
        JToggleButton botton3 = new JToggleButton("Modify");
        JToggleButton botton4 = new JToggleButton("Delete");

        JPanel panel3 = new JPanel();
        JTextArea write = new JTextArea(3,27);



        panel1.add(degree);
        panel1.add(degreebox);
        panel2.add(botton1);
        panel2.add(botton2);
        panel2.add(botton3);
        panel2.add(botton4);
        panel3.add(write);


        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);


    }
    public static void addComponetsToCenterPane2(Container frame){

        JPanel panel1 = new JPanel();
        JLabel id = new JLabel("ID:");


        JPanel panel2 = new JPanel();
        JLabel name = new JLabel("Name:");

        JPanel panel3 = new JPanel();
        JLabel city = new JLabel("City:");

        JPanel panel4 = new JPanel();
        JLabel phone = new JLabel("Phone:");


        JPanel panel5 = new JPanel();
        JLabel birthdate = new JLabel("Birthdate:");


        panel1.add(id);
        panel2.add(name);
        panel3.add(city);
        panel4.add(phone);
        panel5.add(birthdate);

        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);
        frame.add(panel5);

    }
    public static void createAndShowGUI() {

        JFrame window = new JFrame("Student Manager");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(new BorderLayout());

        JPanel tPanel = new JPanel();
        tPanel.setLayout(new FlowLayout());


        JPanel cPanel = new JPanel();
        cPanel.setLayout(new GridLayout(5, 1, 30, 0));
        cPanel.setBorder(BorderFactory.createTitledBorder("cPanel"));

        JPanel pPanel = new JPanel();
        pPanel.setLayout(new FlowLayout());
        pPanel.setBorder(BorderFactory.createTitledBorder("pPanel"));
        pPanel.setLayout(new GridLayout(5, 1 , 10, 0));

        JPanel thesouth = new JPanel();
        thesouth.setLayout(new BoxLayout(thesouth,BoxLayout.Y_AXIS));
        thesouth.setBorder(BorderFactory.createTitledBorder("thesouth"));

        addComponetsToNorthPane(tPanel);
        addComponetsToCenterPane(cPanel);
        addComponetsToCenterPane2(pPanel);
        addComponetsToSouthPane(thesouth);

        window.add(tPanel,BorderLayout.NORTH);
        window.add(pPanel,BorderLayout.LINE_START);
        window.add(cPanel,BorderLayout.LINE_END);
        window.add(thesouth,BorderLayout.SOUTH);

        window.setVisible(true);
        window.setSize(800, 400);
    }

    public static void main(String[] args) {
        createAndShowGUI();

    }

}
