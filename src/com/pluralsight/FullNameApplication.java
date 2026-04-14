import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Add Scanner

        System.out.print("Enter First Name: "); // Prompt first name entry
        String firstName = scan.nextLine().trim(); // Scan for variable 'firstName'

        System.out.print("Enter Middle Name: "); // Prompt middle name entry
        String middleName = scan.nextLine().trim(); // Scan for variable 'middleName'

        System.out.print("Enter Last Name: "); // Prompt last name entry
        String lastName = scan.nextLine().trim(); // Scan for variable 'lastName'

        System.out.print("Enter Suffix: "); // Prompt suffix entry
        String suffix = scan.nextLine().trim(); // Scan for variable 'suffix'

        String fullName = ""; // Declaring variable 'fullName' to call to later (I think?)

        // Need to add if/else statements for different entry types for both 'middleName' and 'suffix'
        // I Used ".isEmpty()" instead of ".equals("")" because it was suggested by IntelliJ

        if (middleName.isEmpty()) {
            fullName = firstName + " " + lastName;
        } else {
            fullName = firstName + " " + middleName + " " + lastName;
        }
        if (suffix.isEmpty()) {
            System.out.println("Hey, " + fullName + ". Nice name, bro.");
        } else {
            System.out.println("Hey, " + fullName + " " + suffix + ". Your name sounds fancy, bro.");
        }
    }
}


























