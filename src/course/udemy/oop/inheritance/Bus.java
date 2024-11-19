package course.udemy.oop.inheritance;

public class Bus extends FuelAuto {
    private int passengerNumber;

    public Bus(String producer, String model, EngineType engineType, int availablePetrol, int tankVolume, int passengerNumber) {
        super(producer, model, engineType, availablePetrol, tankVolume);
        this.passengerNumber = passengerNumber;
        System.out.println("Bus was initialized");
    }

    public void fuelUp() {
        int volume = getTankVolume();
        fuelUp(volume);
    }


    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    public void pickUpPassenger(int passengerNum) {
        this.passengerNumber += passengerNum;
        System.out.println("Picking up" + passengerNum + " passenger");
    }

    public void releasePassenger() {
        if (isRunning) {
            stop();
        }
        passengerNumber = 0;
        System.out.println("Passenger released");
    }
}
