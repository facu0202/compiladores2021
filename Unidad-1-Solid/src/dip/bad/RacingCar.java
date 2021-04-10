package dip.bad;

class RacingCar {
    private int remainingFuel;
    private int power;

    public RacingCar(final int fuel) {
        remainingFuel = fuel;
    }

    void accelerate() {
        power++;
        remainingFuel--;
    }
}
