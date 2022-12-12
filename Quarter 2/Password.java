import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Password extends JFrame {
    public JFrame h = new JFrame();
    public JFrame k = new JFrame();
    JLabel heading; // initializing instance variables
    JLabel jl = new JLabel();
    JLabel space = new JLabel("                               ");
    JPasswordField pass = new JPasswordField(15);
    JButton button = new JButton("Submit");
    JLabel item5 = new JLabel("HAHAHA SAD CAT");
    String passw;
    int x = 0;

    Password() {
        super("Sample Program"); // sets the title bar
        jl.setIcon(new ImageIcon("/home/mitsuki/Pictures/5ad292bd0d94477cf3e9cc9926cacbfc--eskimo-kiss-small-things-1004193472.jpeg"));        
        add(jl);
        heading = new JLabel(" Please enter password:");
        heading.setFont(new Font("Algerian", Font.BOLD, 20));
        heading.setForeground(new Color(0, 200, 0)); // set the text color
        add(heading);
        add(space);
        add(pass);
        add(button);
        handler handle = new handler();

        button.addActionListener(handle);
        k.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        k.getContentPane();
        item5.setIcon(new ImageIcon("/home/mitsuki/Pictures/FiN3_4iWQAIdTQv.png"));
        item5.setFont(new Font("Algerian", Font.BOLD, 50));
        item5.setForeground(new Color(0, 200, 0)); // set the text color
        k.add(item5);

    }

    public static void main(String args[]) {

        Password hoho = new Password();
        hoho.setLayout(new FlowLayout(FlowLayout.LEFT, 50, 25));
        // sets how components are displayed
        hoho.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        hoho.setSize(1000, 1000);
        hoho.setLocation(300, 300);
        hoho.setVisible(true);
        hoho.getContentPane().setBackground(new Color(0, 100, 100));
        hoho.setResizable(false);
    }

    private class handler implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            String  correctPassword =   "Pisay";
            if (e.getSource() == button) {
                passw = pass.getText();
                if (passw.equalsIgnoreCase(correctPassword)) {
                    JOptionPane.showMessageDialog(null, "Access Granted", "Alert", JOptionPane.INFORMATION_MESSAGE);
                    k.setLayout(new FlowLayout());
                    k.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    k.setSize(2_000, 2_000);
                    k.setLocation(750, 250);
                    k.setVisible(true);

                } else {
                    JOptionPane.showMessageDialog(null, "Access DENIED!!! Please Try Again!!", "Alert",
                            JOptionPane.ERROR_MESSAGE);
                    x++;
                }

                if (x == 3) {
                    button.setEnabled(false);
                    pass.setEditable(false);
                }
                passw = "";
                pass.setText(passw);
            }
        }
    }
}