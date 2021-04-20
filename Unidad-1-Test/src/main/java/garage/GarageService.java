package garage;

public class GarageService {

    private GarageDB garage;

    public String park(Integer position, String car) {
        return garage.save(position, car).toString();
    }

    public void unPark(Integer position, String car) {
        garage.save(position, null);
    }


    public GarageService(GarageDB garage) {
        this.garage = garage;
    }
}
