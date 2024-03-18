
import java.util.Scanner;

public class price_of_coal_and_timber {

static double Total_Price_of_coal_and_timber(double Amount_Of_Bags_Of_Timber, double one_bag_of_timber, double Amount_Of_Bags_Of_Coal, double one_bag_of_coal) {

return (Amount_Of_Bags_Of_Timber * one_bag_of_timber) + (Amount_Of_Bags_Of_Coal * one_bag_of_coal);

}
    public static void main(String[] args) {

        double one_bag_of_timber = 10.50;
        double one_bag_of_coal = 15.60;

        Scanner scanner4 = new Scanner(System.in);
        System.out.println("enter How many bags of coal do you need?");
        double Amount_Of_Bags_Of_Timber = scanner4.nextDouble();
       
       
        System.out.println("enter How many bags of timber do you need?");
        double Amount_Of_Bags_Of_Coal = scanner4.nextDouble();



        double Total = Total_Price_of_coal_and_timber (Amount_Of_Bags_Of_Timber, one_bag_of_timber, Amount_Of_Bags_Of_Coal, one_bag_of_coal);

       
        System.out.print("The ttal cost in euros is: ");
        System.out.printf("%.2f\n", Total); 
        scanner4.close();
    }
}
