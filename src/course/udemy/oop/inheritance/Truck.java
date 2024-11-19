package course.udemy.oop.inheritance;

public class Truck extends FuelAuto {
    private int cargoWeight;

    public Truck(String producer, String model, EngineType engineType, int availablePetrol, int tankVolume, int cargoWeight) {
        super(producer, model, engineType, availablePetrol, tankVolume);
        this.cargoWeight = cargoWeight;
        System.out.println("Truck was initialized");
    }

    public void load() {
        System.out.println("Cargo Loaded");
    }

    public void unLoad() {
        System.out.println("Cargo unLoaded");
    }


    public int getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(int cargoWeight) {
        this.cargoWeight = cargoWeight;
    }
}
