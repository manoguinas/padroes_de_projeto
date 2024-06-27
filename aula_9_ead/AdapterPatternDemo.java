public class AdapterPatternDemo {
  public static void main(String[] args) {
    OldVehicleStorage oldStorage = new OldVehicleStorage();

    IVehicleStorage vehicleStorageAdapter = new VehicleStorageAdapter(oldStorage);

    Vehicle vehicle = new Vehicle("123ABC", "Toyota Corolla", 2020);

    vehicleStorageAdapter.saveVehicleData(vehicle);
  }
}
