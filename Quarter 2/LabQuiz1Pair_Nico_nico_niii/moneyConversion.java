package LabQuiz1Pair_Nico_nico_niii;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;

import javax.swing.*;

public class moneyConversion extends JFrame {
    double moneyPeso, moneyUSD, moneyEuro, moneySingaporeanDollar, moneyRinggit, moneyDirham;
    private JTextField currencyPesoField = new JTextField(18);
    private JLabel currencyPesoLabel = new JLabel("Amount in Philippine Peso (PHP): ");
    private JButton convertCurrencyButton = new JButton(
            "Convert PHP to other USD, Euro, Singaporean Dollar, Malaysian Ringgit, UAE Dirham");
    private JLabel space = new JLabel("                         ");
    int i;

    private final String[] currencyOther = {
            "US Dollar",
            "Euro",
            "Singaporean Dollar",
            "Ringgit",
            "Dirham"
    };

    // public final double[] currencyConversion = {
    // moneyPeso * 0.0179,
    // moneyPeso * 0.017,
    // moneyPeso * 0.024,
    // moneyPeso * 0.0786,
    // moneyPeso * 0.0661,
    // };

    public static void main(String[] args) {
        moneyConversion marcosMoments = new moneyConversion();
        marcosMoments.setLayout(new FlowLayout(FlowLayout.LEFT, 50, 50));
        marcosMoments.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcosMoments.setSize(500, 800);
        marcosMoments.setLocationRelativeTo(null);
        marcosMoments.getContentPane().setBackground(new Color(221, 160, 221));
        marcosMoments.setVisible(true);
    }

    public moneyConversion() {
        add(currencyPesoLabel);
        add(currencyPesoField);
        add(convertCurrencyButton);
        handler handle = new handler();
        convertCurrencyButton.addActionListener(handle);
    }

    private class handler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == convertCurrencyButton) {
                try {

                    moneyPeso = Integer.parseInt(currencyPesoField.getText());

                    double[] currencyConversion = {
                            moneyPeso * 0.0179,
                            moneyPeso * 0.017,
                            moneyPeso * 0.024,
                            moneyPeso * 0.0786,
                            moneyPeso * 0.0661,
                    };

                    // for (int i = 0; i < currencyOther.length; i++) {
                    // JLabel label = new JLabel("");
                    // add(label);
                    // add(space);
                    // revalidate();
                    // repaint();
                    // }

                    revalidate();
                    repaint();

                    for (i = 0; i < currencyOther.length; i++) {
                        JLabel label = new JLabel("Value in " + currencyOther[i] + " = " + currencyConversion[i]);
                        add(label);
                        add(space);
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number.");
                }
            }
        }
    }
}