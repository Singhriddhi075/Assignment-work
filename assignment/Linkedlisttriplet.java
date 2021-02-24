package assignment;

import java.util.LinkedList;
import java.util.Scanner;

import javax.xml.soap.Node;

public class Linkedlisttriplet {
	public static void main(String[] args) throws Exception {
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int y = scn.nextInt();
		int z = scn.nextInt();
		LinkedList l1 = new LinkedList();
		LinkedList l2 = new LinkedList();
		LinkedList l3 = new LinkedList();
		for (int i = 1; i <= x; i++) {
		l1.addLast(scn.nextInt());

			}
			for (int i = 1; i <= y; i++) {
				l2.addLast(scn.nextInt());

			}
			for (int i = 1; i <= z; i++) {
				l3.addLast(scn.nextInt());

			}
			int target = scn.nextInt();
			sum(l1, l2, l3, target);
		}

		public static void sum(LinkedList l1, LinkedList l2, LinkedList l3, int target) {
			for (Node p1 = l1.head; p1 != null; p1 = p1.next) {
				for (Node p2 = l2.head; p2 != null; p2 = p2.next) {
					for (Node p3 = l3.head; p3 != null; p3 = p3.next) {
						if(p1.data+p2.data+p3.data==target) {
							System.out.println(p1.data+" "+p2.data+" "+p3.data);
						}
					}
				}
			}
		}
}
