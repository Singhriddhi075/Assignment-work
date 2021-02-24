package assignment;

public class recursion {

	public static void main(String[] args) {
		printLexicographic("ab"," ");

	}
	public static void printLexicographic(String str , String result) {
		if(str.length()==0) {
			System.out.println(result);
			return;
		}
		char cc=str.charAt(0);
		String ros=str.substring(1);
		printLexicographic(ros,result);
		printLexicographic(ros,result+cc);
	}

}
