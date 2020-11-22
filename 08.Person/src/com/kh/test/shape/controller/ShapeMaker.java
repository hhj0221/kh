package com.kh.test.shape.controller;

import com.kh.test.shape.model.vo.Circle;
import com.kh.test.shape.model.vo.RectAngle.RectAngle;

public class ShapeMaker {

	public static void main(String[] args) {
	
		Circle s= new Circle();
		RectAngle r= new RectAngle();
		s.draw();
		s.draw();
	}
	public void draw() {
		final int MAX_CiRCLE = 3;
		Circle[] arr = new Circle[MAX_CiRCLE];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].draw());
		}
	}

}
