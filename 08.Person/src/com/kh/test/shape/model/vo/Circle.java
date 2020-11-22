package com.kh.test.shape.model.vo;

public class Circle {

	private int radius;
	public final double PI =Math.PI;
	
	public Circle() {}
	public Circle(int radius) {
		this.radius=radius;
		
	}
	public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public double getPI() {
		return PI;
	}
	public String draw() {
		return "반비름" + radius +"cm인 원을 그립니다 ";
	}
}
