public class VehicleStorageAdapter implements IVehicleStorage {
  private OldVehicleStorage oldVehicleStorage;

  public VehicleStorageAdapter(OldVehicleStorage oldVehicleStorage) {
    this.oldVehicleStorage = oldVehicleStorage;
  }

  @Override
  public void saveVehicleData(Vehicle vehicle) {
    String data = "ID: " + vehicle.getId() + ", Model: " + vehicle.getModel() + ", Year: " + vehicle.getYear();
    oldVehicleStorage.storeVehicleData(data);
  }
}
