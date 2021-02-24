package assignment;

import java.util.Scanner;

public class decimaltooctal {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int ans=0;
		int multiplier=1;
		while(n>0) {
			int rem=n %8;
			ans=ans+rem*multiplier;
			n=n/8;
			multiplier=10*multiplier;
			
		}
		
		System.out.println(ans);
		

	}

}
