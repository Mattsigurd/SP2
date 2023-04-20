package SP2;

//public class GasolinCar extends AFuelCar {
public class GasolinCar extends AFuelCar{
    //For en Benzinbil er afgiften afhængig af kilometer pr liter. Hvis den kører mellem 20 km/l og 50 km/l er prisen 330 kr,
    // mellem 15 km/l og 20 km/l er prisen 1050 kr, mellem 10 km/l og 15 km/l er prisen 2340 kr, mellem 5 km/l og 10 km/l er
    // prisen 5500kr, og under 5 km/l er prisen 10470 kr.

    public String fuelType = "Gasolin";

    public GasolinCar(int kmPrLitre) {
        super(kmPrLitre);
    }

    public int getRegistrationFee() {
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
