package com.kh.test.shape.model.vo.RectAngle;

public class RectAngle {
	private int width;
	private int height;
	
	public RectAngle() {}
	public   RectAngle(int width,int height) {
		this.width=width;
		this.height =height;
		
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
	
	public  String draw() {
		return "가로 " + width +"cm"+"세로 " + height+"cm인 사각형을 그립니다 출력	";
	}
		

	
}
