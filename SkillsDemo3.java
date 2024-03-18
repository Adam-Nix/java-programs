import java.util.Scanner;
public class SkillsDemo3 {

    //Heating, stores the heating variables, the values are insterted by the user, this makes the calculation 
    static double heating(double currentMeterReading, double previousMeterReading, double gasPerUnit, double standingOrderCharge) {
        return ( (currentMeterReading - previousMeterReading) * gasPerUnit) + standingOrderCharge;
    }

    //Electricity
    static double power(double unitsUsed, double costPerUnit, double standingOrderCharge) {
        return ((unitsUsed * costPerUnit) + standingOrderCharge);
    }
    
    //Coal and Timber
    static double Total_Price_of_coal_and_timber(double Amount_Of_Bags_Of_Timber, double one_bag_of_timber, double Amount_Of_Bags_Of_Coal, double one_bag_of_coal) {

        return (Amount_Of_Bags_Of_Timber * one_bag_of_timber) + (Amount_Of_Bags_Of_Coal * one_bag_of_coal);
    }     
        
    //this stores the numbers for CalculateTripCost in a function
    static double CalculateTripCost(double distance, double costPerLitre, double fuelEfficiency){

        //This part runs the calculations.
        return ((distance / 100) * fuelEfficiency * costPerLitre);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------------");
        System.out.println("| 1 - Heating     |\n| 2 - Electricity |\n| 3 - Car Fuel    |\n| 4 - Coal Timber |\n| 5 - Exit        |");
        System.out.println("-------------------");
        System.out.print("Enter option: ");
        int option = scanner.nextInt();

                                        
        if (option == 1) {
        
            //ask for the 4 numbers, Standing Order harge, Current Meter Reading, the Previous Meter Reading and the Cost per Unit (of gas).
            // saves each value insearted by the user as a Double.
            System.out.print("Please insert the Standing Order Charge: ");
		    double standingOrderCharge = scanner.nextDouble();
            System.out.print("Please insert the Current Meter Reading : ");
	  		double currentMeterReading = scanner.nextDouble();
			System.out.print("Please insert the Previous Meter Reading: ");
	  		double previousMeterReading = scanner.nextDouble();
            System.out.print("Please insert the Cost per Unit (of gas): ");
	  		double gasPerUnit = scanner.nextDouble();
			
            //this will send the informatin to the method and will ask to send bak the result of the calcualtion, the output. 
			double result = heating(currentMeterReading,previousMeterReading,gasPerUnit,standingOrderCharge);
			System.out.println("Your heating bill is EURO: ");
            System.out.printf("%.2f\n", result);

        } else if (option == 2) {
            Scanner scanner2 = new Scanner(System.in);
            //This asks for the number of units that was used and stores it as a variable called unitsUsed
            System.out.println("Please enter the number of units of electricity");
            System.out.print(">");
            int unitsUsed = scanner2.nextInt();
    
            //Cost per unit of electricity
            System.out.println("Please enter the current cost per unit: ");
            System.out.print(">");
            double costPerUnit = scanner2.nextDouble();
            
            //This asks for the standing order charge
            System.out.println("Please enter the Standing Order Charge: ");
            System.out.print(">");
            double standingOrderCharge = scanner2.nextDouble();
    
    
    
            double bill = power(unitsUsed, costPerUnit, standingOrderCharge);
            System.out.print("Your electricty bill is EUR ");
            System.out.printf("%.2f\n", bill);
            scanner2.close();
    
        } else if (option == 3) {
        //Opening the scanner
        Scanner scanner3 = new Scanner(System.in);
      
        //This part sets the varible for costPerLitre as a double 
        double costPerLitre = 1.60;

        //This part asks the user to input the distance to their destination in km
        System.out.println("-------------------------------------------");
        System.out.println("Enter the distance to your destination km: "); 
        System.out.println("-------------------------------------------");
        System.out.print("Enter your option:");   
        double distance = scanner3.nextDouble();


      // This part askes the user to input the fuel efficiency of their car 
        System.out.println("----------------------------------------------------------");
        System.out.println("Enter the fuel efficiency of your car (litres per 100km): ");
        System.out.println("----------------------------------------------------------");
        System.out.print("Enter your option:");
        double fuelEfficiency  = scanner3.nextDouble();

        double final_result = CalculateTripCost (distance, costPerLitre, fuelEfficiency);

        // this part of the code returns the calultion form the function and formats , displayes the final cost of the trip
        System.out.println("---------------------------------");
        System.out.print("The cost of the trip in euros is: ");
        System.out.printf("%.2f\n", final_result); 
        System.out.println("---------------------------------");
        scanner3.close();

        } else if (option == 4) {
            double one_bag_of_coal = 9.60;
            double one_bag_of_timber = 5.50;   
            
            Scanner scanner4 = new Scanner(System.in);
            System.out.println("enter How many bags of coal do you need?");
            double Amount_Of_Bags_Of_Timber = scanner4.nextDouble();
           
            System.out.println("enter How many bags of timber do you need?");
            double Amount_Of_Bags_Of_Coal = scanner4.nextDouble();
    
            double Total = Total_Price_of_coal_and_timber (Amount_Of_Bags_Of_Timber, one_bag_of_timber, Amount_Of_Bags_Of_Coal, one_bag_of_coal);
    
            System.out.print("The total cost in euros is: ");
            System.out.printf("%.2f\n", Total); 
            scanner4.close();
    
        } else if (option == 5) {
            System.out.println("Exiting...");
            System.exit(0);
            scanner.close();
        } else {
            System.out.println("Invalid option please select an option between 1 - 5");
        }
        }        
    }