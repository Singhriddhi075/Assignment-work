package assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class RecursionSubsequences {
	
public static ArrayList<String> sol_arraylist;

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n=
		for (int i = 0; i < n; i++) {
			sol_arraylist=new ArrayList<>();
			String str = in.next();
			subseq(str, "");
			
			for (int p = 0; p < sol_arraylist.size() - 1; p++) {
                for (int q= p + 1; q< sol_arraylist.size(); q++) {
                    if (sol_arraylist.get(p).compareTo(sol_arraylist.get(q)) > 0) {
                        Collections.swap(sol_arraylist, p,q);
                    }
                }
            }
            for (int s = 0; s < sol_arraylist.size(); s++) {
                System.out.println(sol_arraylist.get(s));
            }
		}

	}

	public static void subseq(String str, String result) {
		if (str.length() == 0) {
            sol_arraylist.add(result);
//			System.out.println(result);
			return;
		}

		char cc = str.charAt(0);
		String ros = str.substring(1);
		subseq(ros, result);
		subseq(ros, result + cc);
	

	}
}