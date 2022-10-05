import java.util.Scanner;

import javax.swing.plaf.basic.BasicComboBoxUI.ComboBoxLayoutManager;
import javax.swing.plaf.synth.ColorType;

public class Multiplication_Table {
    public static void main(String[] args) {
        Scanner input   =   new Scanner(System.in);

        int row;
        int column;
        int i = 1;
        int a = 1;

        System.out.print("Number of Rows: ");
        row     =   input.nextInt();

        System.out.print("Number of Columns: ");
        column  =   input.nextInt();

        while (a <= row) {
            while (i <= column) {
                System.out.print(i * a + " ");
                i++;
            } System.out.println(" ");
            a++;
            i = 1;
        }
        
    }
}

