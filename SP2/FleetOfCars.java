package SP2;

import java.util.ArrayList;

public class FleetOfCars {
    ArrayList<Car> fleet = new ArrayList<>();

    void addCar(Car car) {
        fleet.add(car);

    }
    int getTotalRegistrationFeeForFleet() {
        int totalFee = 0;

        for (int i = 0; i < fleet.size(); i++){
            totalFee = totalFee + fleet.get(i).getRegistrationFee();
        }
        return totalFee;
    }
    @Override
    public String toString(){

        return null;
    }
}
