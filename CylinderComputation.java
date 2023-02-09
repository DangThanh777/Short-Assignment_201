package ShortAssignment_201;

import java.util.Scanner;

public class CylinderComputation {
	public static void main(String[] args) {
		final double PI = 3.14;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input radius: ");
		double radius = sc.nextDouble();
		System.out.print("Input height: ");
		double height = sc.nextDouble();
		
		System.out.println("Surface area = "+(2*PI*Math.pow(radius, 2) + 2*PI*radius*height));
		System.out.println("Base area = " + (2*PI*radius*height));
		System.out.println("Volume = " + (PI*Math.pow(radius, 2))*height);
		

	}

}
