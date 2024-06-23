import java.util.Iterator;

public class Quesiton2 {

	public static void main(String[] args) {
		
		
		
		int digit[]=new int[] {1,2,3};
		int a=0;
		
		//we are doing number in array digit
		for (int i = 0; i < digit.length; i++) {
			 a=a*10+digit[i];
	}
		System.out.println(a);
	
		int b=a+1;// we are taking plus one our number
		
		System.out.println("New number: "+b);
		
		System.out.println("New number array-->");
		
		 int lengthnewnumber = 0;
	     int temp = b;//we are attend b inside temp
	     
	     while (temp > 0) {
	            lengthnewnumber++;
	            temp /= 10;
	        }

	        int[] newDigit = new int[lengthnewnumber]; //new array created
	        
	        for (int i = lengthnewnumber - 1; i >= 0; i--) {
	            newDigit[i] = b % 10;
	            b /= 10;
	        }
	        
	        /*
	         •  The % 10 operation gives the last digit of the number.
	         
	         •  / 10  removes the last digit of the number and returns the remaining part.*/
	        
	        
	        System.out.print("New digit array: [");
	        
	        for (int i = 0; i < newDigit.length; i++) {
	            System.out.print(newDigit[i]);
	            
	            if (i < newDigit.length - 1) {// we are adding "," until lenght-1
	                System.out.print(", ");
	            }
	        }
	        System.out.println("]");
	}

}
