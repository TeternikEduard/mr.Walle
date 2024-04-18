package com.edu.em.less02;

public class Dz2z1 {

	public static void main(String[] args) {
		
		double x = 123.4567;
		double y = 765.4321;
		double s, rxy, ryx, pr, chxy, chyx;
		
		s = x + y;
		rxy = x - y;
		ryx = y - x;
		pr = x * y;
		chxy = x / y;
		chyx = y / x;
		
		System.out.println("Сумма чисел Х и У = " + s);
		System.out.println("Разность чисел Х и У = " + rxy);
		System.out.println("Разность чисел У и Х = " + ryx);
		System.out.println("Произведение чисел Х и У = " + pr);
		System.out.println("Частное чисел Х и У = " + chxy);
		System.out.println("Частное чисел У и Х = " + chyx);
	}
}
