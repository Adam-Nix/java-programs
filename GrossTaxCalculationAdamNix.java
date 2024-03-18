import java.util.Scanner;

public class GrossTaxCalculationAdamNix{


public static void main (String[] args){

    final double Single_person_Tax_Cut_off = 36800.0;
    final double maried_one_income_TAX_Cut_off = 45800; 
    final double maried_income_TAX_Cut_off = 73600; 
    final double one_parent_income_TAX_Cut_Off = 40800;
    //20% tax above
    
    final double Single_person_Tax_Post_Cut_off = 36800.01;
    final double maried_one_income_TAX_post_Cut_off = 45800.01; 
    final double maried_TAX_Post_Cut_off = 73600.01; 
    final double one_parent_income_TAX_Post_Cut_Off = 40800.01;

    final double First_Tax = 0.2;
    final double Second_Tax = 0.4;

final Scanner Scanner = new Scanner (System.in);

System.out.print("Enter gross income amount: ");
	double Total_Amount_Entred = Scanner.nextDouble();

System.out.println("Enter your current status \n");
System.out.println("1 - single");
System.out.println("2 - Marred one income");
System.out.println("3 - Marred");
System.out.println("3 - One parent family");


double TAX_Bill = 0.0;

int Status_Entred = Scanner.nextInt();

if ( Status_Entred == 1) {

      if (Single_person_Tax_Cut_off < Single_person_Tax_Post_Cut_off)
       {
          TAX_Bill =  (Single_person_Tax_Cut_off * First_Tax );
        }

      else 
      {
          TAX_Bill = (Total_Amount_Entred - Single_person_Tax_Cut_off ) * Second_Tax + ( Single_person_Tax_Cut_off * First_Tax );} 
   }

    if ( Status_Entred == 2) {

    if (maried_one_income_TAX_Cut_off < maried_one_income_TAX_post_Cut_off) {
      TAX_Bill =  (maried_one_income_TAX_Cut_off * First_Tax );
       }
    }
      
     else {
       TAX_Bill = (Total_Amount_Entred - maried_one_income_TAX_Cut_off ) * Second_Tax
       + ( maried_one_income_TAX_Cut_off * First_Tax );

     }
    
    if ( Status_Entred == 3) {

    if (maried_income_TAX_Cut_off < maried_TAX_Post_Cut_off) {
      TAX_Bill =  (maried_income_TAX_Cut_off* First_Tax );
       }
    }
      
     else {
       TAX_Bill = (Total_Amount_Entred - maried_TAX_Post_Cut_off ) * Second_Tax
       + ( maried_income_TAX_Cut_off * First_Tax );

     }

    if ( Status_Entred == 4) {

      if (one_parent_income_TAX_Cut_Off < one_parent_income_TAX_Post_Cut_Off) {
          TAX_Bill =  (one_parent_income_TAX_Cut_Off * First_Tax );
           }
       }
          
       else {
         TAX_Bill = (Total_Amount_Entred - one_parent_income_TAX_Post_Cut_Off ) * Second_Tax
           + ( one_parent_income_TAX_Cut_Off * First_Tax );
    
       }
            System.out.println("your tax bill is:  " + TAX_Bill);
    
      Scanner.close();
    
     }
    
    }

  
    

            
             
            
        
    
