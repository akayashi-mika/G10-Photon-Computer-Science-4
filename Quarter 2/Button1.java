// CS4 2nd Quarter Lesson on AWT
// Laboratory Activity 1

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class Button1 extends JFrame {
    private JLabel item0;
    private JLabel item1;
    private JLabel item2;
    private JTextField item3;
    private JLabel item4;
    private JLabel item5;
    private JTextField form1;
    private JTextField form2;
    private JButton butt1;
    private String x;
    private String y;
    private int len;
    private int wid;
    private int ans;
    private String sans;

    public Button1() {
        super("Computing Dimensions");
        item0 = new JLabel("            Computing for the Area           ");
        add(item0);
        item5 = new JLabel("                                                                    ");
        add(item5);
        item1 = new JLabel("Length: ");
        add(item1);
        form1 = new JTextField(3);
        add(form1);
        item4 = new JLabel("       ");
        add(item4);
        item2 = new JLabel("Width : ");
        add(item2);
        form2 = new JTextField(3);
        add(form2);
        butt1 = new JButton("Compute");
        add(butt1);
        item4 = new JLabel("       ");
        add(item4);
        item3 = new JTextField("     ");
        item3.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.black),
                BorderFactory.createEmptyBorder(15, 15, 15, 15)));
        item3.setEditable(false);
        add(item3);
        handler handle = new handler();
        butt1.addActionListener(handle);
    }

    public static void main(String args[]) {
        Button1 hoho = new Button1();
        hoho.setLayout(new FlowLayout());
        hoho.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        hoho.setSize(250, 300);
        hoho.setLocation(300, 300);
        hoho.getContentPane().setBackground(new Color(100, 204, 255));
        hoho.setVisible(true);
    }

    private class handler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == butt1) {
                x = form1.getText();
                y = form2.getText();
                len = Integer.parseInt(x);
                wid = Integer.parseInt(y);
                ans = len * wid;
                sans = Integer.toString(ans);
                item3.setText(sans);
            }
        }
    }
}
