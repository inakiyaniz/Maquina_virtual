package Swing;


    import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

    public class Ex4extendsJFrameImplementsActionListener extends JFrame implements ActionListener {
        static JTextArea textArea;
        static JComboBox combo;

        public void addComponentsToFrameWest(Container frame) {
            JPanel westPanel = new JPanel();
            westPanel.setBorder(new EmptyBorder(10,10,10,10));
            westPanel.setLayout(new FlowLayout());
            combo = new JComboBox();
            combo.setPreferredSize(new Dimension(195,30));
            combo.addItem("python.txt");
            combo.addItem("php.txt");
            combo.addItem("javascript.txt");
            combo.addItem("java.txt");

            combo.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    textArea.setText("");
                    File f = new File("txt/" + combo.getSelectedItem().toString());



                }
            });

            JButton but1= new JButton("Clear");
            but1.setPreferredSize(new Dimension(100,30));
            but1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    textArea.setText("");
                }
            });

            westPanel.add(combo);
            westPanel.add(but1);
            frame.add("West", westPanel);
        }

        public void addComponentsToFrameEast(Container frame) {
            JPanel eastPanel = new JPanel();
            eastPanel.setBorder(new EmptyBorder(10,10,10,10));
            eastPanel.setLayout(new FlowLayout());
            textArea = new JTextArea();
            textArea.setLineWrap(true);
            textArea.setBorder(new EmptyBorder(5,5,5,5));
            textArea.setEditable(false);

            FileReader reader = null;
            try {
                reader = new FileReader("txt/python.txt");
            } catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(null, "File not found!", "Alert", JOptionPane.ERROR_MESSAGE);
            }
            try {
                textArea.read(reader, "txt/python.txt");
            } catch (IOException e) {
                e.printStackTrace();
            }
            JScrollPane scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
            scrollPane.setPreferredSize(new Dimension(300,150));

            eastPanel.add(scrollPane);
            frame.add("East", eastPanel);
        }

        public void addComponentsToSouthPanel (Container southPanel) {
            JButton but1= new JButton("Close");
            but1.setPreferredSize(new Dimension(100,30));
            but1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    dispose();
                }
            });

            southPanel.add(but1);
        }

        public Ex4extendsJFrameImplementsActionListener() {
            Container p = this.getContentPane();
            //using this we are refering to the jframe
            this.setTitle("Test events: files");
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setLayout(new BorderLayout());

            addComponentsToFrameWest(this);
            addComponentsToFrameEast(this);

            JPanel southPanel = new JPanel();
            southPanel.setBorder(new EmptyBorder(10,10,10,10));
            this.add("South", southPanel);
            addComponentsToSouthPanel(southPanel);

            this.pack();
            this.setLocationRelativeTo(null);
            this.setVisible(true);
        }

        public static void main(String[] args) {
            Ex4extendsJFrameImplementsActionListener myEx4 = new Ex4extendsJFrameImplementsActionListener();
        }

        @Override
        public void actionPerformed(ActionEvent actionEvent) {

        }
    }

