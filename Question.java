/*Question 
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example output 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:
*/

public class Question {

	public static void main(String[] args) {
		

        int arr[] = new int[] {5, 8, 6,9,3};
        int target = 12;
        boolean found = false;


        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("calculating array value of index " + i + " and " + j);
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        
        }
		
}}
