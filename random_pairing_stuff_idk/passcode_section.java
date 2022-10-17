package random_pairing_stuff_idk;
import java.util.Scanner;

public class passcode_section {
    public static void main(String[] args) {
        Scanner sc      =   new Scanner(System.in);
        int passcode    =   12345;
        int userPassword;
        int section;
        int gradeLevel = 0;

        System.out.print("Password: ");
        userPassword   =   sc.nextInt();

        if (userPassword != passcode) {
            System.out.println("Wrong Password");
            System.out.println("Output Terminated");
            System.exit(0);
        }

        System.out.print("Section: \n[1] Ruby\n[2] Opal\n[3] Jade\n[4] Sapphire\n[5] Sampaguita\n[6] Gumamela\n[7] Rosal\n[8] Champara\n[9] Magnesium\n[10] Berrylium\n[11] Neon\n[12] Lithium\n[13] Electron\n[14] Photon\n[15] Tau\n[16] Graviton\n[17] Rigel\n[18] Vega\n[19] Sirius\n[20] Archimedes\n[21] Ptolemy\n[22] Euclid\n> ");
        section =   sc.nextInt();

        switch (section) {
            case 1: case 2: case 3: case 4: gradeLevel = 7; break;
            case 5: case 6: case 7: case 8: gradeLevel = 8; break;
            case 9: case 10: case 11: case 12: gradeLevel = 9; break;
            case 13: case 14: case 15: case 16: gradeLevel = 10;    break; 
            case 17: case 18: case 19: gradeLevel = 11;    break;
            case 20: case 21: case 22: gradeLevel = 12;    break;
            default: System.out.println("Choose only numbers from 1-22"); System.exit(0);
        } System.out.println("You are in Grade Level " + gradeLevel);
    }
}