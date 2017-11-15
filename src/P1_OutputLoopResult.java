/*
  	ISYS 320
  	Name(s): Jeremy Filler
  	Date: 11.14.17
*/



public class P1_OutputLoopResult {
	static int finalResult = 0;
	public static void main(String[] args) {
		printSumOfSquaresTo5();
	}
	
	public static void printSumOfSquaresTo5() {
		for( int i = 1; i <= 5; i++ ) {
			finalResult = 0;
			finalResult = finalResult + i * i;
		}
	
		System.out.println( "Final result is: " + finalResult );
	}

}
