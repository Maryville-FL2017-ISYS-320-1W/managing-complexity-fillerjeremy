/*
  	ISYS 320
  	Name(s): Jeremy Filler
  	Date: 11.14.17
*/



/* 2. Create a table below (just using text) that outlines your analysis of the figure. That is, how many
 * of each character on each line? What expression captures the relationship between the line number and
 * how many of the character is printed on each line? Choose your headings based on how you can break down
 * the figure.
  
Line Number		| HEADING		| HEADING		| HEADING		| HEADING		| HEADING		|	
1			Exclamation point= 22		Backslash = 0
2			Exclamation point = 18		Backlash = 4
3			Exclamation point = 14		Backslash = 8
4			Exclamation point = 10		Backslash = 12
Start with 22 exclamations and 0 backslashes, add 4 backslashes and subtract 4 exclamations per line. 




*/

/* 3. Using your analysis from above, in pseudocode describe the algorithm for how to draw the figure
 * 
 * Line 1 has 22 exclamations, 0 backslashes. Each line afterwards will write 4 less exclamations and 2 backslashes on either side.
 * In other words: Each line will print 4 less exclamations, starting at 22. 
 * Each line will print 2 more backslashes, starting at 0, on either side of the exclamations.
 
 
 
 
 
 */

public class P2_SlashesAndBangs {

	public static void main(String[] args) {
		for (int i = 0; i<=5; i++) {
			slashes1(i);
			bangs();
			slashes2();
		}

		}
	
	public static void slashes1(int i) {
		System.out.print("\\\\");
	}
	public static void bangs() {
		System.out.print("!!!!!!!!!!!!!!!!!!!!!!");
	}
	public static void slashes2() {
		System.out.println("\\\\");
	}
}
