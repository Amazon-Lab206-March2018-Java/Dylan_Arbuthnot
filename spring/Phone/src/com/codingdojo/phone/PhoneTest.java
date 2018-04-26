package com.codingdojo.phone;

public class PhoneTest {
	public static void main(String[] args) {
		Galaxy s9 = new Galaxy ("S9", 99, "Verizon", "*ambient music*");
		IPhone x = new IPhone("X", 100, "AT&T", "*iphone ringtone*");
		s9.displayInfo();
		System.out.println(s9.ring());
		System.out.println(s9.unlock());
		x.displayInfo();
		System.out.println(x.ring());
		System.out.println(x.unlock());
	}
}
