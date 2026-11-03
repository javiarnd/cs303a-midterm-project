public interface Transport {
    void loadCargo(double weight) throws OverweightException;
    void checkMaintenanceOrGroomingScore() throws BrokenEquipmentException, LowGroomingException;
}
