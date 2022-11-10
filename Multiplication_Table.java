import java.util.Scanner;

public class Multiplication_Table {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int row;
            int column;
            int column_number = 1;
            int row_number = 1;

            System.out.print("Number of Rows: ");
            row     =   input.nextInt();

            System.out.print("Number of Columns: ");
            column  =   input.nextInt();

            while (row_number <= row) {
                while (column_number <= column) {
                    System.out.print(column_number * row_number + " ");
                    column_number++;
                } System.out.println("\n");
                row_number++;
                column_number = 1;
            }
        }
    }
}


// break; Terminates the loop
// continue; returns to the 1st itteration
