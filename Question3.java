/* Question-->
Given two integer arrays nums1 and nums2, return an array of their intersection.
Each element in the result must be unique and you may return the result in any order.
Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
*/





import java.util.ArrayList;

public class Question3 {

	public static void main(String[] args) {

		
		int arr[]=new int[] {1,2,2,3,4};
		
		int arr2[]=new int[] {2,4,7,9,7};
		
		ArrayList<Integer>number=new ArrayList<Integer>();
	
		
		
	for (int i = 0; i < arr.length; i++) {
		int b=arr[i];
		
		for (int j = 0; j < arr2.length; j++) {
			int c=arr2[j];
			if (c==b) {
				if (!number.contains(c)) { //Contains means like is it true or false return result
                    number.add(c);
                }
				break;
			}
		}
	}
		
		
		
		 System.out.print("Intersection in array--> [");
		 
		 //with this system we are putting intersection number inside array with get.
		for (int i = 0; i < number.size(); i++) {
            System.out.print(number.get(i));

			if (i<number.size()-1) {
                System.out.print(", ");
                }
			}  
		System.out.print("]");

	}}
