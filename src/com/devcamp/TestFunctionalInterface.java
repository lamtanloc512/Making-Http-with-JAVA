package com.devcamp;

public interface TestFunctionalInterface {
	public void method1(String paramString);
	default void method2() {
		System.out.println("this is method2");
	}
	default void method3() {
		System.out.println("this is method3");
	}
	default void method4() {
		System.out.println("this is method4");
	}
	static void method5() {

	}
}
