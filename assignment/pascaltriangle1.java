package assignment;

import java.util.Scanner;

public class pascaltriangle1 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int val=1;
		for(int i=0;i<=n;i++)
		{
			for(int nsp=1;nsp<=n-i;nsp++)
				System.out.print(" ");
			
			for(int j=0;j<=i;j++) 
			{
				if(j==0||i==0)
					val=1;
				else
					val=val*(i-j+1)/j;
				System.out.print(" "+val);
			}
			System.out.println();
		}

	}

}
