package com.SuperandThis;

public class Child extends Parent{
	int iPhone=18;
	
	@Override
	public void m1() {
		System.out.println("m1 method override in child class");
	}
	
	public void m2() {
		System.out.println("Child m2 method");
		System.out.println(super.iPhone);
		super.m1();
	}
	public void m3() {
		System.out.println("Child class m2 method");
		this.m2();
		System.out.println(this.iPhone);
	}
	public static void main(String[] args) {
		Child c=new Child();
		c.m2();
		c.m3();
	}

}
