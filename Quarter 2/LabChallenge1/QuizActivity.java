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
    private JLabel eigthQuestion;
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
    private JTextField eigthAnswer;
    private JTextField ninthAnswer;
    private JTextField tenthAnswer;

    private JTextField firstStatus;
    private JTextField secondStatus;
    private JTextField thirdStatus;
    private JTextField fourthStatus;
    private JTextField fifthStatus;
    private JTextField sixthStatus;
    private JTextField seventhStatus;
    private JTextField eigthStatus;
    private JTextField ninthStatus;
    private JTextField tenthStatus;

    private JButton Submit;
    private JTextField Score;
    private JTextField Status;

    int score   =   0;
    String  stat;

    public QuizActivity() {
        super("<QUIZ TITLE>");

        TitleOfQuiz = new JLabel("        QUIZ TITLE      ");
        add(TitleOfQuiz);

        space   =   new JLabel("                         ");
        add(space);

        firstQuestion = new JLabel("3+4\n");
        add(firstQuestion);
        firstAnswer = new JTextField(3);
        add(firstAnswer);
        firstStatus = new JTextField("    ");
        add(firstStatus);

        space   =   new JLabel("             ");
        add(space);

        secondQuestion = new JLabel("5+7\n");
        add(secondQuestion);
        secondAnswer = new JTextField(3);
        add(secondAnswer);
        secondStatus = new JTextField("    ");
        secondStatus.setEditable(false);
        add(secondStatus);
        
        space   =   new JLabel("             ");
        add(space);



        thirdQuestion = new JLabel("4+1\n");
        add(thirdQuestion);
        thirdAnswer = new JTextField(3);
        add(thirdAnswer);
        thirdStatus = new JTextField("    ");
        thirdStatus.setEditable(false);
        add(thirdStatus);
        
        space   =   new JLabel("             ");
        add(space);


        fourthQuestion = new JLabel("7+3\n");
        add(fourthQuestion);
        fourthAnswer = new JTextField(3);
        add(fourthAnswer);
        fourthStatus = new JTextField("    ");
        fourthStatus.setEditable(false);
        add(fourthStatus);
        
        space   =   new JLabel("             ");
        add(space);


        fifthQuestion = new JLabel("5+6\n");
        add(fifthQuestion);
        fifthAnswer = new JTextField(3);
        add(fifthAnswer);
        fifthStatus = new JTextField("    ");
        fifthStatus.setEditable(false);
        add(fifthStatus);
        
        space   =   new JLabel("             ");
        add(space);


        sixthQuestion = new JLabel("9+2\n");
        add(sixthQuestion);
        sixthAnswer = new JTextField(3);
        add(sixthAnswer);
        sixthStatus = new JTextField("    ");
        sixthStatus.setEditable(false);
        add(sixthStatus);
        
        space   =   new JLabel("             ");
        add(space);


        seventhQuestion = new JLabel("2+5\n");
        add(seventhQuestion);
        seventhAnswer = new JTextField(3);
        add(seventhAnswer);
        seventhStatus = new JTextField("    ");
        seventhStatus.setEditable(false);
        add(seventhStatus);
        
        space   =   new JLabel("             ");
        add(space);


        eigthQuestion = new JLabel("4+60\n");
        add(eigthQuestion);
        eigthAnswer = new JTextField(3);
        add(eigthAnswer);
        eigthStatus = new JTextField("    ");
        eigthStatus.setEditable(false);
        add(eigthStatus);
        
        space   =   new JLabel("             ");
        add(space);


        ninthQuestion = new JLabel("2+64\n");
        add(ninthQuestion);
        ninthAnswer = new JTextField(3);
        add(ninthAnswer);
        ninthStatus = new JTextField("    ");
        ninthStatus.setEditable(false);
        add(ninthStatus);
        
        space   =   new JLabel("             ");
        add(space);


        tenthQuestion = new JLabel("16+52\n");
        add(tenthQuestion);
        tenthAnswer = new JTextField(3);
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
                BorderFactory.createEmptyBorder(20, 20, 20, 20)
            )
        );
        Score.setEditable(false);
        add(Score);

        Status = new JTextField("   ");
        Status.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.black),
                BorderFactory.createEmptyBorder(20, 20, 20, 20)
            )
        );
        Status.setEditable(false);
        add(Status);
    }

    public static void main(String[] args) {
        QuizActivity Hi_sir_kadto_ka_sa_amon_mag_December_4_Pyesta_sir_yieeee = new QuizActivity();
        Hi_sir_kadto_ka_sa_amon_mag_December_4_Pyesta_sir_yieeee.setLayout(new FlowLayout(FlowLayout.LEFT, 50, 50));
        Hi_sir_kadto_ka_sa_amon_mag_December_4_Pyesta_sir_yieeee.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Hi_sir_kadto_ka_sa_amon_mag_December_4_Pyesta_sir_yieeee.setSize(340, 1000);
        Hi_sir_kadto_ka_sa_amon_mag_December_4_Pyesta_sir_yieeee.setLocation(300, 300);
        Hi_sir_kadto_ka_sa_amon_mag_December_4_Pyesta_sir_yieeee.getContentPane()
                .setBackground(new Color(100, 204, 255));
        Hi_sir_kadto_ka_sa_amon_mag_December_4_Pyesta_sir_yieeee.setVisible(true);
    }

    private class handler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == Submit) {
                if (Integer.parseInt(firstAnswer.getText()) == 7) {
                    score++;
                    firstStatus.setText("/");
                } else {
                    firstStatus.setText("X");
                }

                if (Integer.parseInt(secondAnswer.getText()) == 12) {
                    score++;
                    secondStatus.setText("/");
                } else {
                    secondStatus.setText("X");
                }

                if (Integer.parseInt(thirdAnswer.getText()) == 5) {
                    score++;
                    thirdStatus.setText("/");
                } else {
                    thirdStatus.setText("X");
                }

                if (Integer.parseInt(fourthAnswer.getText()) == 10) {
                    score++;
                    fourthStatus.setText("/");
                } else {
                    fourthStatus.setText("X");
                }

                if (Integer.parseInt(fifthAnswer.getText()) == 11) {
                    score++;
                    fifthStatus.setText("/");
                } else {
                    fifthStatus.setText("X");
                }

                if (Integer.parseInt(sixthAnswer.getText()) == 11) {
                    score++;
                    sixthStatus.setText("/");
                } else {
                    sixthStatus.setText("X");
                }

                if (Integer.parseInt(seventhAnswer.getText()) == 7) {
                    score++;
                    seventhStatus.setText("/");
                } else {
                    seventhStatus.setText("X");
                }

                if (Integer.parseInt(eigthAnswer.getText()) == 64) {
                    score++;
                    eigthStatus.setText("/");
                } else {
                    eigthStatus.setText("X");
                }

                if (Integer.parseInt(ninthAnswer.getText()) == 66) {
                    score++;
                    ninthStatus.setText("/");
                } else {
                    ninthStatus.setText("X");
                }

                if (Integer.parseInt(tenthAnswer.getText()) == 68) {
                    score++;
                    tenthStatus.setText("/");
                } else {
                    tenthStatus.setText("X");
                }

                
                if (score >= 8) {
                    stat    =   "SMARTTTT";
                } else if (score >= 4) {
                    stat    =   "Smart Enough to pass";
                } else if (score >= 2) {
                    stat    =   "get gud";
                } else {
                    stat    =   "hopeless";
                }
                Status.setText(stat);
                Score.setText(Integer.toString(score));

            }
        }
    }
}
