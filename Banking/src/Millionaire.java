 import java.util.*;


public class Millionaire {

public static void main (String[] args){

        Scanner input1 = new Scanner(System.in);

        
        double amount;

        double principal;

        double rate;
        
        int year = 0;
        
        System.out.println("Please Enter The Principal");
        
        	principal = input1.nextDouble();

        System.out.println("Please Enter The Rate Of Interest");
        	rate = input1.nextDouble();

        System.out.println("Please Enter Your Goal");
         Scanner input2 = new Scanner (System.in);
         	int goalAmount = input2.nextInt();

         	amount = principal;
         	
        
        do{
        	amount *= 1 + rate/100;  //don't have enter rate in decimal
        	amount += 5000;			//adding annual addtl investment
        	amount = (int)(amount * 100) / 100.0;  //rounding to 2 decimals
        	year++;
        }
        
        while (amount < goalAmount);
        	
        System.out.println("Your investment goal " + goalAmount);
        System.out.println("Number of years to reach your goal " + year);
        }
}
            
        

