
import java.util.Arrays;
import java.util.Scanner;

public class Question6 {

	public static void main(String[] args) throws InterruptedException{
		
		int target;
		int arr[]= new int[]{1,5,6,7,6,4,3};
		
		System.out.println("Enter target number");
		Scanner scanner=new Scanner(System.in); 
		target = scanner.nextInt();

		
		Arrays.sort(arr);
       

		int i ;
	
		
		for (i=0 ; i < arr.length; i++) {
			if (arr[i]==target) {
				
				System.out.println("Target index is ----->");

				System.out.println(i);
				
		}else {
			i++;
			if (arr.length==i) {
				System.out.println("we dont have this target---> "+ -1);
				
			}
		}
			
		
} 

		Thread.sleep(500);
		
		System.out.println(Arrays.toString(arr));
		
	

		
		

	}

}
