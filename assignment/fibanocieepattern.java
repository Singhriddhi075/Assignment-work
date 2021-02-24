package assignment;

import java.util.Scanner;

public class fibanocieepattern {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int nr=n*n+n/2;
		int nst=0;
		int row=0;
		int a=0;
		int b=1;
		while(row<=n) {
			int cst=1;
			for(;cst<=nst;cst++) {
				
				int sum=a+b;
				System.out.print(a);
				System.out.print("\t");
				a=b;
				b=sum;
			}
			System.out.println();
			row=row+1;
			nst=nst+1;
		}

	}

}
