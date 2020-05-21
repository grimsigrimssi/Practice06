package com.javaex.ex02;

public class Shape {
	
	protected String fillColor;
	protected String lineColor;
	
	public Shape() {
		System.out.println("생성자 Shape(0) 실행");
	}
	
	public Shape(String fillColor, String lineColor) {
		System.out.println("생성자 Shape(2) 실행");
		this.fillColor = fillColor;
		this.lineColor = lineColor;
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}
	
	public void draw() {
		System.out.println("#면색:" + fillColor);
		System.out.println("#선색:" + lineColor);
	}
	

	
	

}

