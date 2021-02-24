package assignment;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		int c=0;
		int a;
		int temp;
		int n=scn.nextInt();
		temp=n;
		boolean flag;
		while(n>0) {
		a=n%10;
		n=n/10;
		c=c+(a*a*a);
		}
		if(temp==c) {
			flag=true;
		}else{
			flag=false;
		}

	}

}
