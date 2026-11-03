public abstract class Equipment extends FarmAsset {
    protected int durabilityScore;

    Equipment() {
        super();
        this.durabilityScore = 100; 
    }

    Equipment(String farmName, int durabilityScore) {
        super(farmName);
        this.durabilityScore = durabilityScore;
    }

    public int getDurabilityScore() {
        return durabilityScore;
    }

    public void setDurabilityScore(int durabilityScore) {
        this.durabilityScore = durabilityScore;
    }

    public void useEquipment(int usageTimes) throws BrokenEquipmentException {
        durabilityScore -= 10 * usageTimes;
        if (durabilityScore <= 0) {
            throw new BrokenEquipmentException("Equipment is broken and needs maintenance.");
        }
    }

    abstract void performMaintenance();
}
