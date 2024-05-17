package com.jdy.exer2;

public class Triangle extends Shape {

	@Override
	public void areaPrint() {
		// TODO Auto-generated method stub
//		super.areaPrint(); <-- 지우고 원하는 내용으로 바꾸면 됨, 부모 메소드가 필요하면 살려두면 됨.
		System.out.println(width*height*0.5);
	}
	
//	public void areaPrint() {
//		System.out.println(width*height*0.5);
//	}
	

	
	
}
