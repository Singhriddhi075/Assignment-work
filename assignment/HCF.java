package assignment;

import java.util.Scanner;

public class HCF {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = scn.nextInt();
		int min = a[0];
		for (int i = 1; i < n; i++) {
			if (min > a[i])
				;
			min = a[i];

		}
		int div = 2, hcf = 1, i;
		while (div <= min) {
			for (i = 0; i < n; i++) {
				if (a[i] % div == 0) {
					a[i] = a[i] / div;

				} else
					break;
			}
			if (i == n) {
				hcf = hcf * div;
			} else {
				div++;
			}
		}
		System.out.println(hcf);

	}

}
