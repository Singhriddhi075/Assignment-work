package assignment;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int divisor=scn.nextInt();
		int divident=scn.nextInt();
		int quotient=divident/divisor;
		while(quotient==1) {
			int remainder=divident%divisor;
			quotient=remainder;
			remainder=0;
			
		}
		System.out.println();
		

	}

}
