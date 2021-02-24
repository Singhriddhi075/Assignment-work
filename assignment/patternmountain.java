package assignment;

import java.util.Scanner;

public class patternmountain {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int nr=n+1/2;
		int row=1;
		int nst=1;
		int nsp=2*n-3;
		int val;
		while(row<=n) {
			val=row-1;;
			
			for(int cst=1;cst<=nst;cst++) {
				System.out.print(val);
				System.out.print('\t');
				val--;
				
			}
			for(int csp=1;csp<=nsp;csp++) {
				System.out.print(" ");
				System.out.print('\t');
		}
			int cst=1;
			if(row==n);
			cst=2;
			for(;cst<=nst;cst++) {
				System.out.print(val);
				System.out.print('\t');
				val--;
			}
			if(row<=nr) {
				nsp=nsp-2;
				nst=nst+1;
			}else {
				nsp=nsp+2;
				nst=nst-1;
			}
				
       row=row+1;
	}

	}

	}	
