package ShortAssignment_201;

import java.util.Scanner;

public class Exercise_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Input first number: ");
		int n1 = sc.nextInt();
		System.out.print("Input second number: ");
		int n2 = sc.nextInt();
		System.out.print("Input third number: ");
		int n3 = sc.nextInt();
		System.out.print("Input fourth number: ");
		int n4 = sc.nextInt();
		
		if(n1 == n2 && n2 == n3 && n3==n4) {
			System.out.println("Numbers are equal!");
		}else {
			System.out.println("Numbers are not equal!");
		}

	}

}
