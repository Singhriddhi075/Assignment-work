package assignment;

import java.util.Scanner;

public class pascaltriangle2 {

	public static void main(String[] args) {
		Scanner scn =new Scanner(System.in);
		int n=scn.nextInt();
         int nst=1;
         int row=1;
         int nsp=n-1;
         int val=1;
         while(row<=n) {
        	 for(int csp=1;csp<=nsp;csp++) {
        		 System.out.print(" ");
        	 }
        	 
        	 for(int cst=1;cst<=1;cst++) {
        		 System.out.print(val);
        		 System.out.print('\t');
        		 if(cst<=nst/2) {
     				val++;
     			}
     			else {
     				val--;
     			}
        		 
        	 }System.out.println();
        		 nsp=nsp-1;
        		 nst=nst+2;
        		 row=row+1;
        			 
        		 
        			 
        	 }
         }
	}


