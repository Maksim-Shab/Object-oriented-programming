public class Car extends Transport {
    private int power;

    public Car(int year, String color, int maxSpeed, int power) {
        super(year, color, maxSpeed);
        this.power = power;
    }

    @Override
    public String toString() {
        return super.toString() + " мощность двигателя: " + power;
    }
}

