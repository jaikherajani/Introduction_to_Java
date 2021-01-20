package Introduction_to_Java_7;

import java.util.Scanner;

public class Armstrong_Number {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int nod = numberOfDigits(n);

		System.out.println(isAmstrong(n, nod));
	}

	private static boolean isAmstrong(int num, int digits) {
		
		int ans = 0;
		
		int temp = num;
		
		while(num != 0) {
			
			int rem = num % 10;
			
			ans += Math.pow(rem, digits); //pow(3, 4) > 3**4
			
			num = num / 10;
			
		}
		
		if(temp == ans) {
			return true;
		}else {
			return false;
		}
		
		
	}

	private static int numberOfDigits(int n) {

		int counter = 0;
		
		
		while (n != 0) {

			counter++;
			n = n / 10;
		}
		
		return counter;
	}

}
