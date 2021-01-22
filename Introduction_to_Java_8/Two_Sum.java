package Introduction_to_Java_8;

import java.util.Arrays;

public class Two_Sum {

	public static void main(String[] args) {
		

		int[] arr = {2, 7, 11, 15};
		int target = 18;
		
		int[] res = check2(arr, target);
		System.out.println(res[0] + " " + res[1]);

	}

	//Approach 1
	private static int[] check(int[] arr, int target) {
		

		for(int i = 0; i < arr.length; i++) {
			
			int curr = arr[i];
			int find = target - curr;
			for(int j = i + 1; j < arr.length; j++) {
				
				if(arr[j] == find) {
					return new int[] {i , j};
				}
			}
		}
		
		return null;
	}
	
	private static int[] check2(int[] arr, int target) {
		
		//Sort the array
		Arrays.sort(arr);
		
		int start = 0;
		int end = arr.length - 1;
		
		while(start < end) {
			
			int sum = arr[start] + arr[end];
			if(sum > target) {
				end--;
			}else if(sum < target) {
				start++;
			}else {
				return new int[] {start , end};
			}
		}
		
		return null;
	}

}
