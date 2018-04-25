
class Mammal {
	private Integer energyLevel;
	public Mammal() {
		this.energyLevel = 100;
	}
	public Integer displayEnergy() {
		System.out.println(this.energyLevel);
		return this.energyLevel;
	}
	public Integer setEnergy(int val) {
		if (val > 0) {
			this.energyLevel += val;
		} else if (val <= 0) {
			this.energyLevel += val;
		}
		return this.energyLevel;
	}
}