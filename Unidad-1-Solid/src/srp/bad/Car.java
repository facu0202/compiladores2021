package srp.bad;

public class Car {
    String brand;

    public Car(String brand){ this.brand = brand; }

    String getBrand(){ return brand; }

    public void guardarDB(){
        System.out.println("Guardando ...");
    };


}
