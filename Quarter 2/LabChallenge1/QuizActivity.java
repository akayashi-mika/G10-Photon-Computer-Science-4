package LabChallenge1;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class QuizActivity extends JFrame {
    private JLabel TitleOfQuiz;
    private JLabel firstQuestion;
    private JLabel secondQuestion;
    private JLabel thirdQuestion;
    private JLabel fourthQuestion;
    private JLabel fifthQuestion;
    private JLabel sixthQuestion;
    private JLabel seventhQuestion;
    private JLabel eightQuestion;
    private JLabel ninthQuestion;
    private JLabel tenthQuestion;
    private JLabel  space;

    private JTextField firstAnswer;
    private JTextField secondAnswer;
    private JTextField thirdAnswer;
    private JTextField fourthAnswer;
    private JTextField fifthAnswer;
    private JTextField sixthAnswer;
    private JTextField seventhAnswer;
    private JTextField eightAnswer;
    private JTextField ninthAnswer;
    private JTextField tenthAnswer;

    private JTextField firstStatus;
    private JTextField secondStatus;
    private JTextField thirdStatus;
    private JTextField fourthStatus;
    private JTextField fifthStatus;
    private JTextField sixthStatus;
    private JTextField seventhStatus;
    private JTextField eightStatus;
    private JTextField ninthStatus;
    private JTextField tenthStatus;

    private JButton Submit;
    private JTextField Score;
    private JTextField Status;

    public QuizActivity() {
        super("<QUIZ TITLE>");

        TitleOfQuiz = new JLabel("        QUIZ TITLE      ");
        add(TitleOfQuiz);

        space   =   new JLabel("                         ");
        add(space);

        firstQuestion = new JLabel("3+4\n");
        add(firstQuestion);
        firstAnswer = new JTextField("    ");
        add(firstAnswer);
        firstStatus = new JTextField("    ");
        add(firstStatus);

        space   =   new JLabel("             ");
        add(space);

        secondQuestion = new JLabel("5+7\n");
        add(secondQuestion);
        secondAnswer = new JTextField("    ");
        add(secondAnswer);
        secondStatus = new JTextField("    ");
        secondStatus.setEditable(false);
        add(secondStatus);
        
        space   =   new JLabel("             ");
        add(space);



        thirdQuestion = new JLabel("4+1\n");
        add(thirdQuestion);
        thirdAnswer = new JTextField("    ");
        add(thirdAnswer);
        thirdStatus = new JTextField("    ");
        thirdStatus.setEditable(false);
        add(thirdStatus);
        
        space   =   new JLabel("             ");
        add(space);


        fourthQuestion = new JLabel("7+3\n");
        add(fourthQuestion);
        fourthAnswer = new JTextField("    ");
        add(fourthAnswer);
        fourthStatus = new JTextField("    ");
        fourthStatus.setEditable(false);
        add(fourthStatus);
        
        space   =   new JLabel("             ");
        add(space);


        fifthQuestion = new JLabel("5+6\n");
        add(fifthQuestion);
        fifthAnswer = new JTextField("    ");
        add(fifthAnswer);
        fifthStatus = new JTextField("    ");
        fifthStatus.setEditable(false);
        add(fifthStatus);
        
        space   =   new JLabel("             ");
        add(space);


        sixthQuestion = new JLabel("9+2\n");
        add(sixthQuestion);
        sixthAnswer = new JTextField("    ");
        add(sixthAnswer);
        sixthStatus = new JTextField("    ");
        sixthStatus.setEditable(false);
        add(sixthStatus);
        
        space   =   new JLabel("             ");
        add(space);


        seventhQuestion = new JLabel("2+5\n");
        add(seventhQuestion);
        seventhAnswer = new JTextField("    ");
        add(seventhAnswer);
        seventhStatus = new JTextField("    ");
        seventhStatus.setEditable(false);
        add(seventhStatus);
        
        space   =   new JLabel("             ");
        add(space);


        eightQuestion = new JLabel("4+65\n");
        add(eightQuestion);
        eightAnswer = new JTextField("    ");
        add(eightAnswer);
        eightStatus = new JTextField("    ");
        eightStatus.setEditable(false);
        add(eightStatus);
        
        space   =   new JLabel("             ");
        add(space);


        ninthQuestion = new JLabel("2+67\n");
        add(ninthQuestion);
        ninthAnswer = new JTextField("    ");
        add(ninthAnswer);
        ninthStatus = new JTextField("    ");
        ninthStatus.setEditable(false);
        add(ninthStatus);
        
        space   =   new JLabel("             ");
        add(space);


        tenthQuestion = new JLabel("16+53\n");
        add(tenthQuestion);
        tenthAnswer = new JTextField("    ");
        add(tenthAnswer);
        tenthStatus = new JTextField("    ");
        tenthStatus.setEditable(false);
        add(tenthStatus);
        
        space   =   new JLabel("             ");
        add(space);


        Submit = new JButton("Submit");
        handler handle = new handler();
        Submit.addActionListener(handle);
        add(Submit);

        Score = new JTextField("   ");
        Score.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.black),
                BorderFactory.createEmptyBorder(15, 15, 15, 15)));
        Score.setEditable(false);
        add(Score);

        Status = new JTextField("   ");
        Status.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.black),
                BorderFactory.createEmptyBorder(15, 15, 15, 15)));
        Status.setEditable(false);
        add(Status);
    }

    public static void main(String[] args) {
        QuizActivity Hi_sir_kadto_ka_sa_amon_mag_December_4_Pyesta_sir_yieeee = new QuizActivity();
        Hi_sir_kadto_ka_sa_amon_mag_December_4_Pyesta_sir_yieeee.setLayout(new FlowLayout(FlowLayout.LEFT, 50, 50));
        Hi_sir_kadto_ka_sa_amon_mag_December_4_Pyesta_sir_yieeee.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Hi_sir_kadto_ka_sa_amon_mag_December_4_Pyesta_sir_yieeee.setSize(320, 1000);
        Hi_sir_kadto_ka_sa_amon_mag_December_4_Pyesta_sir_yieeee.setLocation(300, 300);
        Hi_sir_kadto_ka_sa_amon_mag_December_4_Pyesta_sir_yieeee.getContentPane()
                .setBackground(new Color(100, 204, 255));
        Hi_sir_kadto_ka_sa_amon_mag_December_4_Pyesta_sir_yieeee.setVisible(true);
    }

    private class handler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == Submit) {
                // x = form1.getText();
                // y = form2.getText();
                // len = Integer.parseInt(x);
                // wid = Integer.parseInt(y);
                // ans = len * wid;
                // sans = Integer.toString(ans);
                // item3.setText(sans);
            }
        }
    }
}
