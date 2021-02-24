package assignment;

import java.util.Scanner;

public class recursionkeypadcode {
public static void main(String args[]) {
	Scanner scn=new Scanner(System.in);
    String str=scn.next();

keypad(str, "");
int a=keypadcount(str);
System.out.println();
System.out.println(a);

}

public static String getcode(char ch) {
if (ch == '1') {
	return "abc";
} else if (ch == '2') {
	return "def";
} else if (ch == '3') {
	return "ghi";
} else if (ch == '4') {
	return "jkl";
} else if (ch == '5') {
	return "mno";
} else if (ch == '6') {
	return "pqrs";
} else if (ch == '7') {
	return "tuv";
} else if (ch == '8') {
	return "wx";
} else if (ch == '9') {
	return "yz";
} else {
	return "";
}

}

public static void keypad(String str, String ans) {

if (str.length() == 0) {

	System.out.print(ans+" ");

	return;
}

char ch = str.charAt(0);
String ros = str.substring(1);

String code = getcode(ch);

for (int i = 0; i < code.length(); i++) {
	keypad(ros, ans + code.charAt(i));

}

}

public static int keypadcount(String str) {

if (str.length() == 0) {

	return 1;

	
}

char ch = str.charAt(0);
String ros = str.substring(1);

String code = getcode(ch);
int count=0;
for (int i = 0; i < code.length(); i++) {
	count += keypadcount(ros);

}
return count;
}
}
