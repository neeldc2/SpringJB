package com.test;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Triangle implements InitializingBean, DisposableBean {
	
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public Point getPointA() {
		return pointA;
	}
	
	@Autowired
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	
	public Point getPointB() {
		return pointB;
	}
	
	@Autowired
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	
	public Point getPointC() {
		return pointC;
	}
	
	@Autowired
	@Required
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	
	public void draw() {
		System.out.println(pointA.getX() + " : " + pointB.getX() + " : " + pointC.getX());
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean init method called");
	}
	@Override
	public void destroy() throws Exception {
		System.out.println("Clean up code can be placed here");
	}

}
