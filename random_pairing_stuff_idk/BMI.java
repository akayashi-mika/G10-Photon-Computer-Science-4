package random_pairing_stuff_idk;
import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc  =   new Scanner(System.in);
        double height;
        double weight;
        double BMI;
        String  BMI_Category;

        System.out.print("Height (m): ");
        height =   sc.nextDouble();

        System.out.print("Weight (kg): ");
        weight =   sc.nextDouble();

        BMI = weight / (height * height);

        if (weight <= 0 || height <= 0) {
            System.out.println("Given values must be greater than 0");
            System.exit(0);
        }

        if (BMI < 18.5) {
            BMI_Category    =   "Underweight";
        }

        else if (18.5 <= BMI && BMI <= 24.9) {
            BMI_Category    =   "Normal weight";
        }

        else if (25 <= BMI && BMI <= 29.9) {
            BMI_Category    =   "Overweight";
        }

        else {
            BMI_Category    =   "Obese";
        }

        System.out.println("\nYour BMI is: " + BMI + "\nYour BMI Category is: " + BMI_Category);
    }
}
