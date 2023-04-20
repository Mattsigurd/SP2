package SP2;

public abstract class AFuelCar extends ACar{
    int kmPrLitre;

    public AFuelCar(int kmPrLitre){
        this.kmPrLitre = kmPrLitre;
    }
    String fuelType;

    public String getFuelType(){
        return fuelType;
    }
    int getKmPrLitre(){
        return kmPrLitre;
    }
    @Override
    public String toString(){

        return null;
    }
}
