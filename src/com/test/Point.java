package com.test;

import org.springframework.beans.factory.DisposableBean;

public class Point implements DisposableBean{
	
	private int x;
	private int y;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("destroy");
		
	}

}
