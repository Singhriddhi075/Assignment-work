package assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class trickypermutation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		ArrayList<String> list = new ArrayList<>();
		
		permutation(str, "", str, list);
		
		Collections.sort(list);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	public static void permutation(String ques, String ans, String os, ArrayList<String> list) {
		if (ques.length() == 0) {
			if (ans.compareTo(os) > 0) {
				list.add(ans);
			}
			return;
		}
		char ch = ques.charAt(0);
		String roq = ques.substring(1);
		for (int i = 0; i <= ans.length(); i++) {
			permutation(roq, ans.substring(0, i) + ch + ans.substring(i), os, list);
		}

	}

}
