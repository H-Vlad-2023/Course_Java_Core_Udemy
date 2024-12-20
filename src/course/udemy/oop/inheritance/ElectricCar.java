package course.udemy.oop.inheritance;

public class ElectricCar extends Auto{
    private int batteryVolume;
    private int passengerNumber;

    public ElectricCar(String producer, String model, int batteryVolume, int passengerNumber) {
        super(producer, model, EngineType.ELECTRIC);
        this.batteryVolume = batteryVolume;
        this.passengerNumber = passengerNumber;
        System.out.println("ElectricCar was initialized");
    }

    public void  charge(){
        System.out.println("Bsttery is Charging");
    }

    public int getBatteryVolume() {
        return batteryVolume;
    }

    public void setBatteryVolume(int batteryVolume) {
        this.batteryVolume = batteryVolume;
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }
}
