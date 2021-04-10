package srp;


import srp.bad.Car;
import srp.good.CarDB;

public class Run {

    public static void main(String[] args) {

        Car car = new Car("fiat");
        car.guardarDB();

        srp.good.Car carSingleResposability = new srp.good.Car("fiat");
        CarDB carDB = new CarDB();
        carDB.saveDB(carSingleResposability);
    }


}
