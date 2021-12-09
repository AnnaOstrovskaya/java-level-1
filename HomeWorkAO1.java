class HomeWorkAO1 {
	
	public static void printThreeWords() {
	   System.out.println("Orange\nBanana\nApple");
    }
	
    static void checkSumSign() {
		int a = 5;
		int b = -5;
		System.out.println(
			( a + b >= 0) ? "Positive value" : "Negative Value"
		);
	}
	
	public static void printColor() {
		int value  = 15;
		if (value  <= 0){
			System.out.println ("Red");
		} else if (value > 0 && value <= 100){ 
			System.out.println ("Yellow");
		} else if (value  > 100) {
			System.out.println ("Green");
		}
	}

	static void compareNumbers() {
		int a = 0;
		int b = 100;
		if (a >= b){
			System.out.println ("a >= b");
		} else { 
			System.out.println ("a < b"); 
		}
	}
	
	public static void main(String [] args) {
		printThreeWords(); 
		checkSumSign();
		printColor();
		compareNumbers();
		
		
	}
		
}




