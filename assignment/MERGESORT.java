package assignment;

import java.util.Scanner;

public class MERGESORT {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr = new int[n];
		for (int j = 0; j < n; j++) {
			arr[j] = scn.nextInt();
			
		}

		int[] ans=mergeSort(arr, 0, arr.length - 1);

		for (int val : ans) {
			System.out.print(val+" ");
		}

	}
	public static int[] mergeTwoSortedArrays(int[] one, int[] two) {

		int[] merged = new int[one.length + two.length];

		int i = 0;
		int j = 0;

		int k = 0;

		while (i < one.length && j < two.length) {

			if (one[i] < two[j]) {
				merged[k] = one[i];
				k++;
				i++;
			} else {
				merged[k] = two[j];
				k++;
				j++;
			}

		}

		if (i == one.length) {

			while (j < two.length) {
				merged[k] = two[j];
				k++;
				j++;
			}

		}

		if (j == two.length) {

			while (i < one.length) {
				merged[k] = one[i];
				k++;
				i++;
			}
		}

		return merged;

	}

	public static int[] mergeSort(int[] arr, int lo, int hi) {

		if (lo == hi) {
			int[] br = new int[1];
			br[0] = arr[lo];
			return br;
		}

		int mid = (lo + hi) / 2;

		int[] fpres = mergeSort(arr, lo, mid);
		int[] spres = mergeSort(arr, mid + 1, hi);

		int[] ans = mergeTwoSortedArrays(fpres, spres);

		return ans;

	}

}
