import java.util.Scanner;

public class Loop {
  public static void main(String[] args) {
  
    int sum = 0;
    int count = 0;
    int number;
    
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.print("Enter a number (-1 to quit): ");
      number = scanner.nextInt();

      if (number == -1) {
        break;
      }

      sum += number;
      count++;
    }

    System.out.println("Sum of " + count + " numbers is: " + sum);

    scanner.close();
  }
}