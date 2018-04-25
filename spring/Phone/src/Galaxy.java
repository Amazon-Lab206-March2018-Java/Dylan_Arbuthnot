
public class Galaxy extends Phone implements Ringable {
	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}
	@Override
	public String ring() {
		return this.getRingTone();
	}
	@Override
	public String unlock() {
		return ("...Unlocking your Galaxy via fingerprint...");
	}
	@Override
	public void displayInfo() {
		System.out.println("Galaxy " + this.getVersionNumber() + " from " + this.getCarrier());
		System.out.println("Galaxy " + this.getVersionNumber() + " has " + this.getBatteryPercentage() + "% battery life remaining");
	}
}
