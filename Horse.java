public class Horse extends Animal implements Transport {
    private String breed;

    Horse() {
        super();
        this.breed = "Unknown";
    }

    Horse(String farmName, int age, int groomingScore, String breed) {
        super(farmName, age, groomingScore);
        this.breed = breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void performGrooming() {
        groomingScore += 10;
    }

    @Override
    public double calculateFarmAssetValue() {
        return age * 100 + groomingScore * 50;
    }

    @Override
    public void loadCargo(double weight) throws OverweightException {
        if (weight > 100) {
            throw new OverweightException("The cargo is too heavy for the horse to carry.");
        }
    }
}
