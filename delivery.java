
import java.util.Scanner;
import java.text.DecimalFormat;

public class delivery {

 public static void main (String [] args){

   
    double Irish_Cost = 3.50;
    double UK_Cost = 4.50;
    double Europe_cost= 6.25;

    final Scanner scanner = new Scanner (System.in);

   

    System.out.print("please enter the price of your purchase: ");
    double PurchaseCost = scanner.nextDouble();

    
    System.out.print("\nplease enter the wight of your purchas in kilagrams (kg):");

    double WightOfPurchas = scanner.nextDouble();

        System.out.print("\nhere is the delivery location:");

        System.out.print("\nEnter 1 for the EU: ");
        System.out.print("\nEnter 2 for Ireland: ");
        System.out.print("\nEnter 3 for The United Kingdom: ");
        System.out.print("\nEnter one of the above: ");
        

           double DeliveryCharges = 0.0;

        final int DeliveryCountry = scanner.nextInt(); 

            if (DeliveryCountry == 1 ) {
              DeliveryCharges = (Europe_cost * WightOfPurchas);
            
            } else if (DeliveryCountry == 2 ) {
                DeliveryCharges = (Irish_Cost * WightOfPurchas);

            } else if (DeliveryCountry == 3 ) {
                DeliveryCharges = (UK_Cost * WightOfPurchas);  
            
            } else {
        
            System.err.println("Invalid delivery country entered. Exiting..."); 
            }

            DecimalFormat currencyFormat = new DecimalFormat("#,##0.00");
            String formattedDeliveryCharges = currencyFormat.format(DeliveryCharges);
            String formattedPurchaseCost = currencyFormat.format(PurchaseCost);
            System.out.println("Your delivery charge is: $" + formattedDeliveryCharges + " " + formattedPurchaseCost);
                
    
        scanner.close();
  System.exit(0);
    }
  

}
  


          







