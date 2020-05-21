package com.javaex.ex02;

public class Triangle extends Shape{
	
	private int width;
	private int height;
	
	public Triangle() {
		System.out.println("생성자 Triangle(0) 실행");
	}
	
	public Triangle(int width, int height) {
		System.out.println("생성자 Triangle(2) 실행");
		this.width = width;
		this.height = height;
	}
	
	public Triangle(String fillColor, String lineColor, int width, int height) {
		super(fillColor, lineColor);
		System.out.println("생성자 Triangle(4) 실행");
		this.width = width;
		this.height = height;
	}
	
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	
	public void draw() {
		System.out.println("#면색:" + fillColor);
		System.out.println("#선색:" + lineColor);
		System.out.println("#가로:" + width);
		System.out.println("#세로:" + height);
	}
	
}


