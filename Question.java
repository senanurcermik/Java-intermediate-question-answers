

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