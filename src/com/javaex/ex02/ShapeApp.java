package com.javaex.ex02;

public class ShapeApp {

	public static void main(String[] args) {
		
		Shape s1 = new Shape("파랑", "파랑");		
		s1.draw();
		System.out.println("================");
		System.out.println("");
		
		Triangle t1 = new Triangle();
		t1.draw();
		System.out.println("================");
		System.out.println("");
		
		Triangle t2 = new Triangle(3, 4);		
		t2.draw();
		System.out.println("================");
		System.out.println("");
		
		Triangle t3 = new Triangle("빨강", "빨강", 15, 15);
		t3.draw();
		System.out.println("================");
		
	}

}

