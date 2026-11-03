import java.io.IOException;
import java.io.PrintWriter;

public class TestProject {
    public static void main(String[] args) throws IOException {
        Tractor tractor = new Tractor("Farm One", 80, 600);
        Horse horse = new Horse("Farm One", 6, 70, "Thoroughbred");
        Tractor secondTractor = new Tractor("Farm Two", 95, 800);
        Horse secondHorse = new Horse("Farm Two", 9, 85, "Arabian");
        Horse thirdHorse = new Horse("Farm Three", 4, 90, "Mustang");

        try (PrintWriter output = new PrintWriter("output.txt")) {
            output.println("Midterm Project Test Results: \n");

            tractor.setFarmName("Updated Farm One");
            output.println("Farm name after setter: " + tractor.getFarmName());

            horse.setBreed("Paint");
            output.println("Horse breed after setter: " + horse.getBreed());

            horse.performGrooming();
            output.println("Horse asset value after grooming: " + horse.calculateFarmAssetValue());

            try {
                tractor.useEquipment(1);
            } catch (BrokenEquipmentException exception) {
                output.println(exception.getMessage());
            }

            tractor.performMaintenance();
            tractor.performMaintenance();
            output.println("Tractor durability after use and maintenance: " + tractor.getDurabilityScore());
            output.println("Tractor asset value: " + tractor.calculateFarmAssetValue());

            try {
                tractor.loadCargo(500);
                output.println("Cargo within the tractors set capacity.");
            } catch (OverweightException exception) {
                output.println(exception.getMessage());
            }

            try {
                tractor.loadCargo(700);
                output.println("Cargo above capacity.");
            } catch (OverweightException exception) {
                output.println(exception.getMessage());
            }

            FarmLinkedList farmAssets = new FarmLinkedList();
            farmAssets.add(tractor);
            farmAssets.add(horse);
            farmAssets.add(secondTractor);
            farmAssets.add(secondHorse);
            farmAssets.add(thirdHorse);

            output.println("Farm assets inserted/added to the linked list:");
            output.println(farmAssets.toString());

            farmAssets.remove(2);
            output.println("Farm assets after removing the asset at index 2:");
            output.println(farmAssets.toString());

            boolean isFound = farmAssets.search(horse);
            output.println("Searching for the first horse in the linked list: " + (isFound ? "Found" : "Not Found"));
            

            //Just an additional test to retrieve info of asset
            FarmAsset retrievedAsset = farmAssets.getInfo(1);
            if (retrievedAsset != null) {
                output.println("Retrieved asset at index 1: " + retrievedAsset.getFarmName());
            } else {
                output.println("No asset found at index 1");
            }
        }
    }
}


