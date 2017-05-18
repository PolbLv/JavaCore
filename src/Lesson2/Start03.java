package Lesson2;

import java.util.Arrays;
import java.util.Random;

public class Start03 {

	public static void main(String[] args) {
		
//		int [] mass = {1,2,3,4,5};
//		//0,1,2..
//		System.out.println(mass);
//		for (int i = 0; i < mass.length; i++) {
//			System.out.print(mass[i] + " ");
//			}
//		System.out.println();
//		System.out.println(mass[2]);

//		char [] c = {'a','b','c'};
//		//0,  1,  2
//		for (int i = 0; i < c.length; i++) {
//			System.out.print(i + " ");
//			for (int j = 0; j < c.length; j++) {
//				System.out.print(c[i] + " ");
//				break;
//			}
//			System.out.println();
//		}

//		int [] a = {23,123,56,7,1};
//		int temp = 0;
//		for (int i : a) {
//			System.out.print(i + " ");
//		}
//		for (int i = 0; i < a.length; i++) {
//			for (int j = a.length-1; j > i; j--) {
//				if (a[j] < a[i]) {
//					temp = a[j];
//					a[j] = a[i];
//					a[i] = temp;
//				}
//			}
//		}
//		System.out.println();
//		for (int i : a) {
//			System.out.print(i + " ");
//		}

//		int [] a = new int [3]; 
//		a[0] = 1;
//		a[1] = 2;
//		a[2] = 3;
//		for (int i : a) {
//			System.out.println(i);
//}

//		int [] a = new int [25];
//		Random r = new Random(47);
//		for (int i = 0; i < a.length; i++) {
//			a[i] = r.nextInt(100);
//			System.out.print(a[i] + " ");
//		}
//		System.out.println();
//		Arrays.sort(a);
//		for (int i : a) {
//			System.out.print(i + " ");
//}
	

//		int [][] a = new int [7][7];
//		Random r = new Random(47);
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a[i].length; j++) {
//				a[i][j] = r.nextInt(100);
//				System.out.print(a[i][j] + " ");
//			}
//			System.out.println();
//		}
//		System.out.println(a[5][5]);

		int [][] a = {{1,2,3,4,5},{6,7,8,9,10,11}};
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}	
}


