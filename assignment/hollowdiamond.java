package assignment;

import java.util.Scanner;

public class hollowdiamond {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int nst=n/2+1;
		int nsp=-1;
		int row=1;
		while(row<=n) {
			int cst=1;
			if(row==1||row==n)
				cst=2;
			for(;cst<=nst;cst++) {
				System.out.print("*");
				System.out.print('\t');
			}
			for(int csp=1;csp<=nsp;csp++) {
				System.out.print(" ");
				System.out.print('\t');
			}
			for(cst=1;cst<=nst;cst++) {
				System.out.print("*");
				System.out.print('\t');
			}
			System.out.println();
			if(row<=n/2) {
				nsp=nsp+2;
				nst=nst-1;
			}else {
				nsp=nsp-2;
				nst=nst+1;
			}
			row=row+1;
		}

	}

}
