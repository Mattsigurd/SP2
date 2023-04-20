package SP2;

public class DieselCar extends AFuelCar {
    public String fuelType = "Diesel";
    boolean particleFilter;
    public DieselCar(boolean particleFilter){
        this.particleFilter = particleFilter;
    }

    boolean hasParticleFilter(){
        return particleFilter;
    }
    @Override
    public String toString(){

        return null;
    }
    @Override
    public int getRegistrationFee() {
        int fee;
        if(particleFilter == true) {
            fee = 0;
        } else {
            fee = 1000;
        }
        if (kmPrLitre < 5) {
            return 15260+fee;
        }
        if (kmPrLitre < 10) {
            return 2770+fee;
        }
        if (kmPrLitre < 15) {
            return 1850+fee;
        }
        if (kmPrLitre < 20) {
            return 1390+fee;
        }
        return 130+fee;
    }
}
