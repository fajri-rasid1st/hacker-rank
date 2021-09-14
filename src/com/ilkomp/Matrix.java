package com.ilkomp;

class Matrix {
	public static int count = 0;

	public static void main(String[] args) {
		int a[] = { 0, 1, 2 };
		int b[] = { 0, 1, 2 };
		int c[] = { 0, 1, 2 };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				for (int k = 0; k < c.length; k++) {
					int d[][] = { { a[i], b[j] }, { c[k], 0 } };
					check(d);
				}
			}
		}
	}

	public static void check(int[][] arr) {
		if (arr[0][0] == 0 && arr[0][1] == 0 && arr[1][0] == 0 && arr[1][1] == 0) {
			return;
		}
		int a[] = { 0, 1, 2 };
		int b[] = { 0, 1, 2 };
		int c[] = { 0, 1, 2 };
		int d[] = { 0, 1, 2 };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				for (int k = 0; k < c.length; k++) {
					for (int l = 0; l < d.length; l++) {
						int e[][] = { { a[i], b[j] }, { c[k], d[l] } };
						crossed(arr, e);
					}
				}
			}
		}
	}

	public static void crossed(int[][] arr1, int[][] arr2) {
		if (arr2[0][0] == 0 && arr2[0][1] == 0 && arr2[1][0] == 0 && arr2[1][1] == 0) {
			return;
		}
		int arr3[][] = new int[2][2];
		arr3[0][0] = ((arr1[0][0] * arr2[0][0]) + (arr1[0][1] * arr2[1][0])) % 3;
		arr3[0][1] = ((arr1[0][0] * arr2[0][1]) + (arr1[0][1] * arr2[1][1])) % 3;
		arr3[1][0] = ((arr1[1][0] * arr2[0][0]) + (arr1[1][1] * arr2[1][0])) % 3;
		arr3[1][1] = ((arr1[1][0] * arr2[0][1]) + (arr1[1][1] * arr2[1][1])) % 3;
		if (arr3[0][0] != 0 || arr3[0][1] != 0 || arr3[1][0] != 0 || arr3[1][1] != 0) {
			return;
		} else {
			crossed2(arr2, arr1);
			return;
		}
	}

	public static void crossed2(int[][] arr1, int[][] arr2) {
		int arr3[][] = new int[2][2];
		arr3[0][0] = ((arr1[0][0] * arr2[0][0]) + (arr1[0][1] * arr2[1][0])) % 3;
		arr3[0][1] = ((arr1[0][0] * arr2[0][1]) + (arr1[0][1] * arr2[1][1])) % 3;
		arr3[1][0] = ((arr1[1][0] * arr2[0][0]) + (arr1[1][1] * arr2[1][0])) % 3;
		arr3[1][1] = ((arr1[1][0] * arr2[0][1]) + (arr1[1][1] * arr2[1][1])) % 3;
		if (arr3[0][0] != 0 || arr3[0][1] != 0 || arr3[1][0] != 0 || arr3[1][1] != 0) {
			return;
		} else {
			cetak(arr2, arr1, arr3);
		}
	}

	public static void cetak(int[][] arr1, int[][] arr2, int[][] arr3) {
		count++;
		System.out.println("Solution " + count);
		System.out.println("arr1");

		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3.length; j++) {
				System.out.print(arr1[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("arr2");

		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3.length; j++) {
				System.out.print(arr2[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();

		System.out.println("arr3");

		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3.length; j++) {
				System.out.print(arr3[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}
}