public class Tractor extends Equipment implements Transport {
    private double maxPullCapacity;
    
    Tractor() {
        super();
    }

    Tractor(String farmName, int durabilityScore, double maxPullCapacity) {
        super(farmName, durabilityScore);
        this.maxPullCapacity = maxPullCapacity;
    }

    @Override
    public double calculateFarmAssetValue() {
        return durabilityScore * 100;
    }

    @Override
    public void performMaintenance() {
        durabilityScore += 10;
    }

    @Override
    public void loadCargo(double weight) throws OverweightException {
        if (weight > maxPullCapacity) {
            throw new OverweightException("The trailer is too heavy for the tractor to pull.");
        }
    }

}
