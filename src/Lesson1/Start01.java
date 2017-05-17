package Lesson1;

import java.util.Random;
import java.util.Scanner;

public class Start01 {

	public static void main(String[] args) {

		// System.out.println("Buzzzzinga");
		//
		// byte b = 127;
		// System.out.println(b);
		// short sh = 32000;
		// System.out.println(sh);
		// int i = 1234567890;
		// System.out.println(i);
		// long l = 1731725383l;
		// System.out.println(l);
		//
		// float f = 2.3f;
		// System.out.println(f);
		//
		// double d = 3.14;
		// System.out.println(d);
		//
		// boolean bool = true;//false
		// System.out.println(bool);
		//
		// char = c1 = 'q';
		// System.out.println(q);
		// char c2 = '2';
		//
		// char c3 = '$';
		// System.out.println(c3);
		// char c4 = 2751;
		// System.out.println(c4);
		//
		// String s1 = "Some Word";
		// System.out.println(s1);
		// String s2 = "123";
		// System.out.println(s2);
		//
		//
		// int a = 7/3;
		// System.out.println(a);
		// double d =7.0;
		//
		// double e = 3.1;
		// System.out.println(d/e);
		// double q = 3.5;
		// double z= 1.0;
		// System.out.println(q%z);
		//
		// double d = 0.1;
		// double b = 0.2;
		// System.out.println((d+b)==0.3);
		// System.out.println(d+b);
		//
		// int i = 0;
		// int z = i++;
		// System.out.println(z);
		//
		//
		// int i = 927;
		// System.out.println(i);
		//
		// int q = i / 100;
		// int a = (i/10)%10;
		// int z = i % 10;
		// System.out.println(z);
		// System.out.println(z+""+a+""+q);
		//
		// System.out.println((3>1)&&(1>9));
		// System.out.println((3>2)||5>4);
		//
		// int a = (byte) 256 + 1;
		// System.out.println(a);
		// int b = (byte) 1024 + 33;
		// System.out.println(b);
		//
		// byte b = 12;
		// int f = (byte) b >> 2;
		// System.out.println(f);

		/*
		 * if (умова){ дія }
		 */

		// if( 5 > 3){
		// System.out.println("Ura");
		// }
		// if (3>5){
		// System.out.println(false);
		// }else{
		// System.out.println(true);
		// }

//		 System.out.println("How old are you?");
//		 Scanner sc = new Scanner (System.in);
//		 int youAge = sc.nextInt();
//		 int age = 18;
//		 sc.close();
//		
//		 if (youAge<age){
//		 System.out.println("You are very small");
//		 }else if ((youAge<30) && (age<30)) {
//		 System.out.println("students are drinking");
//		
//		 }else {
//		 System.out.println("You like smaller ");
//		 }
		// Random r = new Random();
		// int randomNumber= r.nextInt(5);

//		StringBuffer buffer = new StringBuffer("567847");
//		buffer.reverse();
//		System.out.println(buffer);
//
//		System.out.println(getLastToFirstDigitsOfNumber(76768));
//	}
//
//	public static int getLastToFirstDigitsOfNumber(int num) {
//		int r = 0;
//		while (num > 0) {
//			r = r * 10 + num % 10;
//			num /= 10;
//			System.out.println(r);
//		}
//		return r;
//	}
//	
	 System.out.println("What's your number?");
	 Scanner sc = new Scanner (System.in);
	 int number = sc.nextInt();
	 Random r = new Random();
	 int randomNumber = r.nextInt(5);
	 System.out.println("i" + randomNumber);
	 sc.close();
	
	 if (number < randomNumber && randomNumber > number){
	 System.out.println("You don't win");
	 }else if (number == randomNumber) {
	 System.out.println("You are win!!!");
	 }
	}
}
