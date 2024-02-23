public class MethodTest {
	
	static int x = 10;
	
    public static void main(String[] args) {
    	
    	int x = 75;
    	System.out.printf("My subtraction result is %s\n", (x - 50));
    
        multiply();
        add(10, 23);
        divide(225, x);
    }
	

    public static void multiply()  {
    	int x = 5;
    	int y = x * x * x;
        System.out.printf("My multiplication result is %s\n", y);
    }


    public static void add(int number1, int number2)  {
        System.out.printf("My addition result is %s\n", (number1 + number2 + x));
    }

    public static void divide(int number1, int number2)  {
        System.out.printf("My division result is %s\n", (number1 / number2));
    }
   
}


