package com.jdy.exer2;

public class Shape {
	
	int width=10;
	int height=20;
	
	
	public void areaPrint() {
		 System.out.println(this.width * this.height);		
	}
	
	public final void namePrint() {  // final을 하면 이 메소드는 오버라이딩 안됨
		System.out.println("도형이름:shape");
	}

}
