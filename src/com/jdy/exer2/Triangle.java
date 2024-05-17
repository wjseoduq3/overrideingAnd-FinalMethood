package com.jdy.exer2;

public class Triangle extends Shape {

	@Override
	public void areaPrint() {
		// TODO Auto-generated method stub
//		super.areaPrint(); <-- 지우고 원하는 내용으로 바꾸면 됨, 부모 메소드가 필요하면 살려두면 됨.
		System.out.println(width*height*0.5);
	}

//	@Override
//	public void namePrint() {  // 부모클래스에서 final로 지정하였음
		// TODO Auto-generated method stub
//		System.out.println("도형이름:triangle");
	
	
//	public void areaPrint() {
//		System.out.println(width*height*0.5);
//	}
	
	
	
}
