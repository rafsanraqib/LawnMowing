import java.util.Scanner;
public class LawnMowing {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    System.out.print("Please enter the Length and Width of the Lawn: ");
	    System.out.print("\nLength: ");
	    int length = input.nextInt();
	    System.out.print("\nWidth: ");
	    int width = input.nextInt();
	    int Area = length * width;
	    double seasonalFee = 0;
	    double weeklyfee = 0;
	    
	    System.out.print("How would you like to set up a payment: ");
	    System.out.print("\n(1) once, (2) twice, (3) 20 times: ");
	    int payment = input.nextInt();
	    
	    if ( Area < 4000 && payment == 1) {
	      
	     weeklyfee = 25;
	     seasonalFee = 25 * 20;
	     System.out.printf("\nYour lawn is %d square feet" , Area);
	     System.out.printf("\nWeekly fee:$ %.2f " , weeklyfee);
	     System.out.printf("\n20-week seasonal fee: $ %.2f" , seasonalFee);
	     System.out.printf("\nYour payment is a one time fee: $ %.2f" , seasonalFee);
	     
	    
	      
	    }
	    
	    else if ( Area < 4000 && payment == 2) {
	      
	     weeklyfee = 25;
	     seasonalFee = 25 * 20;
	     System.out.printf("Your lawn is %d square feet" , Area);
	     System.out.printf("\n Weekly fee:$ %.2f " , weeklyfee);
	     System.out.printf("\n20-week seasonal fee: $ %.2f" , seasonalFee);
	     System.out.printf("\nYour payment is twice a year: $ %.2f" , seasonalFee/ 2);
	     
	    }
	    
	    else if ( Area < 4000 && payment == 3) {
	      
	     weeklyfee = 25;
	     seasonalFee = 25 * 20;
	     System.out.printf("Your lawn is %d square feet" , Area);
	     System.out.printf("\n Weekly fee:$ %.2f " , weeklyfee);
	     System.out.printf("\n20-week seasonal fee: $ %.2f" , seasonalFee);
	     System.out.printf("\nYour payment is 20 times a year: $ %.2f" , seasonalFee / 20);
	     
	    }
	    
	    else if ( Area >= 4000 && Area < 6000 && payment == 1) {
	      
	     weeklyfee = 35;
	     seasonalFee = weeklyfee* 20;
	     System.out.printf("Your lawn is %d square feet" , Area);
	     System.out.printf("\n Weekly fee:$ %.2f " , weeklyfee);
	     System.out.printf("\n20-week seasonal fee: $ %.2f" , seasonalFee);
	     System.out.printf("\nYour payment is one time fee: $ %.2f" , seasonalFee );
	     
	    }
	    
	    else if ( Area >= 4000 && Area < 6000 && payment == 2) {
	     
	     weeklyfee = 35;
	     seasonalFee = weeklyfee* 20;
	     System.out.printf("Your lawn is %d square feet" , Area);
	     System.out.printf("\n Weekly fee:$ %.2f " , weeklyfee);
	     System.out.printf("\n20-week seasonal fee: $ %.2f" , seasonalFee);
	     System.out.printf("\nYour payment is twice a year: $ %.2f" , seasonalFee / 2);
	     
	    }
	    
	    else if ( Area >= 4000 && Area < 6000 && payment == 3) {
	     
	     weeklyfee = 35;
	     seasonalFee = weeklyfee* 20;
	     System.out.printf("Your lawn is %d square feet" , Area);
	     System.out.printf("\n Weekly fee:$ %.2f " , weeklyfee);
	     System.out.printf("\n20-week seasonal fee: $ %.2f" , seasonalFee);
	     System.out.printf("\nYour payment is 20 times a year: $ %.2f" , seasonalFee / 20);
	      
	     
	    }
	    
	    else if ( Area >=  6000 && payment == 1) {
	      
	     weeklyfee = 50;
	     seasonalFee =weeklyfee* 20;
	     System.out.printf("Your lawn is %d square feet" , Area);
	     System.out.printf("\n Weekly fee:$ %.2f " , weeklyfee);
	     System.out.printf("\n20-week seasonal fee: $ %.2f" , seasonalFee);
	     System.out.printf("\nYour payment is one a time fee: $ %.2f" , seasonalFee  );
	     
	    }
	    
	    else if ( Area >=  6000 && payment == 2) {
	      
	     weeklyfee = 50;
	     seasonalFee =weeklyfee* 20;
	     System.out.printf("Your lawn is %d square feet" , Area);
	     System.out.printf("\n Weekly fee:$ %.2f " , weeklyfee);
	     System.out.printf("\n20-week seasonal fee: $ %.2f" , seasonalFee);
	     System.out.printf("\nYour payment twice a year: $ %.2f" , seasonalFee /2 );
	     
	    }
	    
	    else if ( Area >=  6000 && payment == 3) {
	      
	     weeklyfee = 50;
	     seasonalFee =weeklyfee* 20;
	     System.out.printf("Your lawn is %d square feet" , Area);
	     System.out.printf("\n Weekly fee:$ %.2f " , weeklyfee);
	     System.out.printf("\n20-week seasonal fee: $ %.2f" , seasonalFee);
	     System.out.printf("\nYour payment is 20 times a year: $ %.2f" , seasonalFee/ 20 );
	     
	    }
	    
	    else {
	      
	      System.out.print("Sorry we do not have an offer for you");
	      
	     }
	    
	}

	}

