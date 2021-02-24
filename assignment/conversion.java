package assignment;

import java.util.Scanner;

public class conversion {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		
		int fmin=0;
		int fmax=100;
		int fstep=20;
		int fcurrent=fmin;
		while(fcurrent<=fmax) {
			int celcius=(int)((5.0/9)*(fcurrent-32));
			
			System.out.println(fcurrent+"\t"+ celcius);
			fcurrent=fcurrent+fstep;
			
			
		}
		

	}

}
