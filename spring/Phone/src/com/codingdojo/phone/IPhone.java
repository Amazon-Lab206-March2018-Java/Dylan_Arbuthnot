package com.codingdojo.phone;

public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
    	return this.getRingTone();
    }
    @Override
    public String unlock() {
    	return ("...Unlocking your iPhone via facial recognition...");
    }
    @Override
    public void displayInfo() {
    	System.out.println("iPhone " + this.getVersionNumber() + " from " + this.getCarrier());
		System.out.println("iPhone " + this.getVersionNumber() + " has " + this.getBatteryPercentage() + "% battery life remaining");
	}
}