package Introduction_to_Java_8;

public class Spiral_Array {

	public static void main(String[] args) {
		

		int[][] arr = {{10, 20, 30, 40, 200, 220},
				{50, 60, 70, 80, 111, 222}, 
				{90, 100, 110, 120, 333, 444},
				{130, 140, 150, 160, 555, 666}};

		spriralDisplay(arr);
	}

	private static void spriralDisplay(int[][] arr) {
		

		int rowMin = 0;
		int rowMax = arr.length - 1;
		int colMin = 0;
		int colMax = arr[0].length - 1;
		
		int nel = arr.length * arr[0].length;
		
		//element printed as of now
		int counter = 0;
		
		while(counter < nel) {
			//first col
			for(int row = rowMin; counter < nel &&row <= rowMax; row++) {
				//(0, 0), (1, 0), (2, 0), (3, 0)
				//(1, 1), (2, 1)
				System.out.print(arr[row][colMin] + " ");
				counter++;
			}
			colMin++;
			
			
			//end row
			for(int col = colMin; counter < nel && col <= colMax; col++) {
				//(3, 1), (3, 2), (3, 3)
				//(2, 2)
				System.out.print(arr[rowMax][col] + " ");
				counter++;
			}
			rowMax--;
			
			//end col
			for(int row = rowMax; counter < nel && row >= rowMin; row--) {
				//(2, 3), (1, 3), (0, 3)
				//(1, 2)
				System.out.print( arr[row][colMax] + " ");
				counter++;
			}
			colMax--;
			
			//first row
			for(int col = colMax; counter < nel && col >= colMin; col--) {
				//(0, 2), (0, 1) 
				System.out.print(arr[rowMin][col] + " ");
				counter++;
			}
			rowMin++;
		}
		
	}

}
