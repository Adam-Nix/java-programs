import java.util.Scanner; // Import the Scanner n

public class AgeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // New Scanner

        System.out.println("Are you 18 or over? (yes/no)"); // Ask the user if they are 18 or over

        String str1 = scanner.nextLine(); // Read in the user input as a string and store it in a variable called str1

        if (str1.equalsIgnoreCase("yes") || str1.equalsIgnoreCase("y")) { 
            System.out.println("Welcome sir/madam"); // Displayes "Welcome sir/madam"
        } else if (str1.equalsIgnoreCase("no") || str1.equalsIgnoreCase("n")) { 
            System.out.println("You are a minor, entry not permitted"); // Displays "You are a minor, entry not permitted"
            scanner.close(); // close the Scanner

        }
    }
}