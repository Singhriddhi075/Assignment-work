package assignment;

import java.util.Scanner;

public class towerofhanoi {
	public static void TOH(int n,char beg ,char aux ,char end){
		if(n>=1){
		TOH(n-1,beg,end,aux);
		System.out.println("Moving ring "+ n + " from "+beg+" to "+end);  // MISTAKE: use " " for the string
		TOH(n-1,aux,beg,end);
		}}
		public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		TOH(n,'A','C','B');    //mistake: see the qn B-destination rod and C rod is helper rod

		}

}
