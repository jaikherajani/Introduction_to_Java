package Introduction_to_Java_7;

public class Wave_Display {

	public static void main(String[] args) {
		

		int[][] arr = {{10, 20, 30, 40}, {50, 60, 70, 80}, {90, 100, 110, 120}};
		
		waveDisplay(arr);
	}

	private static void waveDisplay(int[][] arr) {
		

		//write code
		
		for(int col = 0; col < arr[0].length; col++) {
			
			if(col % 2 == 0) {
				//go top to bottom
				
				for(int row = 0; row < arr.length; row++) {
					System.out.print(arr[row][col] + " ");
				}
			}else {
				
				//bottom to top
				for(int row = arr.length - 1; row >= 0; row--) {
					System.out.print(arr[row][col] + " ");
				}
			}
		}
		
	}

}
