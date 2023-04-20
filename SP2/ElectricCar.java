package SP2;

public class ElectricCar extends ACar{

    public ElectricCar() {}
        int batteryCapacity;
        int maxRange;


    //For en Elbil gælder de samme regler som for en benzinbil,
    // blot skal man først omregne watt-timer pr kilometer til km/l.
    // Det gøres ved at dividere Wh/km med 91,25 og dernæst dividere 100 med dette tal.
    public int getBatteryCapacityKWh() {
        return batteryCapacity;
    }
    public int getMaxRangeKm(){
        return maxRange;
    }
    public int getWhPrKm(){
        return getBatteryCapacityKWh()/getMaxRangeKm();
    }
    public int getRegistrationFee(){
        int kmPrLitre = 9125/getWhPrKm();

        if (kmPrLitre < 5) {
            return 10470;
        }
        if (kmPrLitre < 10) {
            return 5500;
        }
        if (kmPrLitre < 15) {
            return 2340;
        }
        if (kmPrLitre < 20) {
            return 1050;
        }
        return 330;
    }
    @Override
    public String toString(){

        return null;
    }
}
