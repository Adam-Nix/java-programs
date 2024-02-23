import java.util.Scanner;

public class Larger_Number {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter first number: ");
    int num1 = scanner.nextInt();

    System.out.print("Enter second number: ");
    int num2 = scanner.nextInt();

    System.out.println("Larger number is: " + findLarger(num1, num2));
    
    scanner.close();

    
  }
  public static int findLarger(int num1, int num2) {
    if (num1 > num2) {
      return num1;
    } else {
      return num2;
    }
  }
}
