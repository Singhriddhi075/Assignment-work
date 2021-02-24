package assignment;

import java.util.Scanner;

public class patterntriangle {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int nst=1;
		int row=1;
		int  nsp=n-1;
		int val;
		
		while(row<=n) {
			val=row;
			int cst=1;
			for(int csp=1;csp<=nsp;csp++) {
				System.out.print(" ");
				System.out.print('\t');
			}
			for(;cst<=nst;cst++) {
				System.out.print(val);
				System.out.print('\t');
			if(cst<=nst/2) {
				val++;
			}
			else {
				val--;
			
			}
			}
			System.out.println();
			nsp=nsp-1;
			nst=nst+2;
			row=row+1;
		   
		}
		

	}

}
