package Introduction_to_Java_7;

import java.util.Scanner;

public class Pattern_Hollow_Square_Matrix {

	public static void main(String[] args) {
		

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		
		int row = 1;
		
		while(row <= n) {
			
			int col = 1;
			
			while(col <= n) {
				
				if(row == 1 || row == n || col == 1 || col == n) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
				col  = col + 1;
			}
			
			
			//next row
			System.out.println();
			row = row + 1;
		}

	}

}
