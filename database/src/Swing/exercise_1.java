package Swing;

import javax.swing.*;
import java.awt.*;

public class exercise_1 {
    /* FrameDemo.java requires no other files. */
    public static class FrameDemo {
        /**
         * Create the GUI and show it. For thread safety,
         * this method should be invoked from the
         * event-dispatching thread.
         */
        private static void createAndShowGUI() {
            //Create and set up the window.
            JFrame frame = new JFrame("My window");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(null); // esto no se acepta en el examen
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
            labelSex.setBounds(10, 75, 90, 10);

            ButtonGroup group = new ButtonGroup();
            JRadioButton male = new JRadioButton("Male: ");
            JRadioButton female = new JRadioButton("Female: ");
            male.setBounds(10, 90, 90, 15);
            male.setSelected(true);
            female.setBounds(10, 110, 90, 15);
            group.add(male);
            group.add(female);

            JLabel labelName = new JLabel("Name:");
            labelName.setBounds(120, 10, 70, 20);

            JTextField tField = new JTextField(20);
            tField.setBounds(120, 35, 70, 20);

            JButton buttonSave = new JButton("Save");
            buttonSave.setBounds(120, 140, 70, 30);

            frame.add(labelAge);
            frame.add(combo);
            frame.add(labelSex);
            frame.add(male);
            frame.add(female);
            frame.add(labelName);
            frame.add(tField);
            frame.add(buttonSave);

            frame.setSize(400, 300);
            frame.setVisible(true);
          /*  frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);
            //Display the window.
            frame.pack();
            frame.setVisible(true); */

        }
        public static void main(String[] args) {
            createAndShowGUI();
        }
    }


}

