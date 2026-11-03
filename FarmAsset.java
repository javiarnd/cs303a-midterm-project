public abstract class FarmAsset {
    private String farmName;
    private String totalArea;

    FarmAsset() {
    }

    FarmAsset(String farmName) {
        this.farmName = farmName;
    }

    FarmAsset(String farmName, String totalArea) {
        this.farmName = farmName;
        this.totalArea = totalArea;
    }

    public String getFarmName() {
        return farmName;
    }

    public void setFarmName(String farmName) {
        this.farmName = farmName;
    }

    public String getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(String totalArea) {
        this.totalArea = totalArea;
    }

    abstract double calculateFarmAssetValue();
}