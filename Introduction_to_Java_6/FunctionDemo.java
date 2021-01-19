package Introduction_to_Java_6;

public class FunctionDemo {

	public static int GLOBAL = 20;
	public static void main(String[] args) {
		
		//Part 1
		System.out.println("-----------Part-1------------");
		System.out.println("hello");
		//method calling
		addition();
		System.out.println("bye");
		
		//Part-2a
		System.out.println("-----------Part-2a------------");
		System.out.println("hello");
		addition(2, 12);
		System.out.println("bye");
		
		//Part-2b
		System.out.println("-----------Part-2b------------");
		System.out.println("hello");
		int sum = additionRV(2, 12);
		System.out.println(sum);
		System.out.println("bye");
		
		//Part-3
		System.out.println("-----------Part-3------------");
		int one = 10;
		int two = 20;
		int sum1 = DemoScopes(one, two);
		System.out.println(sum1);
		
		//Part-4
		System.out.println("-----------Part-4------------");
		System.out.println(GLOBAL);
		int GLOBAL = 200;
		System.out.println(GLOBAL);
		DemoGlobalScopes(one);	
		
		//Part-5-Pass by Value
		System.out.println("-----------Part-5------------");
		System.out.println(one + ", " + two); //10, 20
		swap(one, two);
		System.out.println(one + ", " + two);
	
	}
	
	private static void swap(int one, int two) {
		

		System.out.println(one + ", " + two);
		int temp = one; //temp = 10
		one = two; //one = 20;
		two = temp; //two = 10;
		System.out.println(one + ", " + two);
		
	}
	private static void DemoGlobalScopes(int one) {
		
		//20 + 40 = 60
		GLOBAL = GLOBAL + 40; ///global variable
		int GLOBAL = 30;
		GLOBAL = GLOBAL + 40; //local variable 30 + 40
		int sum = one + GLOBAL; //10 + 70
		System.out.println(sum);
		
	}

	public static int DemoScopes(int one, int another) {
		
		//another = two
		int sum = one + another;
		return sum;
		
		
	}

	public static int additionRV(int a, int b) {
		
		int sum = a + b;
		return sum;
	}
	
	//method declaration and definition
	//no arguments
	public static void addition() {
	
		int a = 2;
		int b = 3;
		int sum = a + b;
		System.out.println(sum);
		
	}
	
	//with arguments
	public static void addition(int a, int b) {
		
		int sum = a + b;
		
		System.out.println(sum);
	}

}
