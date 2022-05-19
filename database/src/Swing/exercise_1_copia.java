package Swing;

import javax.swing.*;
import java.awt.*;

public class exercise_1_copia {
    public static void addComponetsToPane(Container frame) {

        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(10, 75, 100, 95);
        panel1.setVisible(true);
        panel1.setBorder(BorderFactory.createLineBorder(Color.RED));

        JLabel labelAge = new JLabel("Age: ");
        labelAge.setBounds(10, 10, 70, 20);// esto tampoco se acepta


        JComboBox combo = new JComboBox();
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        combo.setModel(model);

        for (int i = 0; i<=120; i++) {
            model.addElement(i);
        }
        combo.setBounds(10, 35, 70, 20);



        JLabel labelSex = new JLabel("Sex:");
        labelSex.setBounds(10, 10, 90, 10);

        ButtonGroup group = new ButtonGroup();
            JRadioButton male = new JRadioButton("Male: ");
            male.setBounds(10, 25, 70, 15);
            male.setSelected(true);

            JRadioButton female = new JRadioButton("Female: ");
            female.setBounds(10, 40, 80, 15);


       // group.frame.setSize(400, 300);
        //frame.setVisible(true);
        group.add(male);
        group.add(female);

        panel1.add(labelSex);
        panel1.add(male);
        panel1.add(female);
       // panel1.setSize();
        //end Panel
        JLabel labelName = new JLabel("Name:");
        labelName.setBounds(120, 10, 70, 20);

        JTextField tField = new JTextField(20);
        tField.setBounds(120, 35, 70, 20);

        JButton buttonSave = new JButton("Save");
        buttonSave.setBounds(120, 140, 70, 30);

        frame.add(labelAge);
        frame.add(combo);
       /* frame.add(labelSex);
        frame.add(male);
        frame.add(female); */

        frame.add(panel1);
        frame.add(labelName);
        frame.add(tField);
        frame.add(buttonSave);


    }
    public  static void createAndShowGUI(){

        JFrame frame = new JFrame("My window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        addComponetsToPane(frame);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
    public static void main(String[] args) {

        createAndShowGUI();
    }
}

