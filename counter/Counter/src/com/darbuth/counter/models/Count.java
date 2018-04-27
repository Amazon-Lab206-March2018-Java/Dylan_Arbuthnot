package com.darbuth.counter.models;

public class Count {
	public static Integer buttonClicks = 0;
	public static Integer getButtonClicks() {
		return buttonClicks;
	}
	public static void plusOne() {
		buttonClicks++;
	}
}
