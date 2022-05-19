package Swing;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import static javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER;

public class ejercicio_2 {

    public static void addComponentsToFrame(Container frame) {

        JLabel labelAge = new JLabel("Age: ");
        labelAge.setBounds(10, 10, 100, 15); //Not accepted in exam (x,y,width,height)

        // Creacion del JComboBox y añadir los items.

        String[] listString = new String[100];
        for(int i=1; i<=100; i++) {
            listString[i-1] = "Element: " + i;
        }
        JList list2 = new JList(listString);
        list2.setSelectedIndex(3);
        list2.setBackground(new Color(60, 210, 210));


        DefaultListModel model = new DefaultListModel();
        JList list = new JList(model);
        for(int i=1; i<=100; i++) {
            model.addElement("Element: " + i);
        }
        list.setSelectedIndex(3);
        list.setBackground(new Color(60, 210, 210));

        JScrollPane scrollPane1 = new JScrollPane(list, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane1.setBounds(10, 10, 280, 90);

        JTextArea textArea = new JTextArea("Write something here...");
        textArea.setLineWrap(true);
        JScrollPane scrollPane2 = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane2.setBounds(10, 110, 280, 150);

        frame.add(scrollPane1);
        frame.add(scrollPane2);
    }

    public static void addComponentsToFrame2(Container frame) {

        JLabel labelAge = new JLabel("Example label: ");
        labelAge.setBounds(10, 10, 100, 15); //Not accepted in exam (x,y,width,height)

        JTextField tField = new JTextField(20);
        tField.setBounds(10, 30, 150, 50);

        String myStrings[] = {"face.png", "other.png"};
        JComboBox combo = new JComboBox(myStrings);
        combo.setSelectedItem(1);
        combo.setBounds(10, 90, 150, 50);

        JPanel panel1 = new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(170, 30, 150, 80);

        ButtonGroup group = new ButtonGroup();
        JRadioButton blue = new JRadioButton("Blue");
        JRadioButton black = new JRadioButton("Black");
        JRadioButton green = new JRadioButton("Green");
        blue.setBounds(10, 0, 100, 15);
        black.setBounds(10, 30, 100, 15);
        green.setBounds(10, 60, 100, 15);
        black.setSelected(true);
        group.add(blue);
        group.add(black);
        group.add(green);
        panel1.add(blue);
        panel1.add(black);
        panel1.add(green);

        JPanel panel2 = new JPanel();
        panel2.setLayout(null);
        JCheckBox check1 = new JCheckBox("Apples");
        JCheckBox check2 = new JCheckBox("Potatoes");
        JCheckBox check3 = new JCheckBox("Carrots");
        JCheckBox check4 = new JCheckBox("Oranges");
        check1.setBounds(0, 5, 100, 15);
        check2.setBounds(0, 35, 100, 15);
        check3.setBounds(0, 65, 100, 15);
        check4.setBounds(0, 95, 100, 15);
        panel2.add(check1);
        panel2.add(check2);
        panel2.add(check3);
        panel2.add(check4);
        check2.setSelected(true);
        check3.setSelected(true);
        JScrollPane scrollPane = new JScrollPane(panel2, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setBounds(320, 10, 150, 130);

        JButton buttonClose= new JButton("Close");
        buttonClose.setBounds(10, 150, 460, 50);

        frame.add(labelAge);
        frame.add(tField);
        frame.add(combo);
        frame.add(panel1);
        frame.add(scrollPane);
        frame.add(buttonClose);
    }

    public static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Test window");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); //Not accepted in exam
        frame.setPreferredSize(new Dimension(300, 300)); //she has used setSize
        frame.setVisible(true);

        addComponentsToFrame(frame);

        //Display the window.
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


        //Create and set up the window.
        JFrame frame2 = new JFrame("List and textarea");
        frame2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame2.setLayout(null); //Not accepted in exam
        frame2.setPreferredSize(new Dimension(480, 240)); //she has used setSize
        frame2.setVisible(true);

        addComponentsToFrame2(frame2);

        //Display the window.
        frame2.pack();
        frame2.setLocationRelativeTo(frame);
        frame2.setVisible(true);
    }

    public static void main(String[] args) {
        createAndShowGUI();
    }
}
