public class Sedan extends Car {
    private String model;
    private double price;
    private int trunkVolume;

    public Sedan(int year, String color, int maxSpeed, int power, String model, double price, int trunkVolume) {
        super(year, color, maxSpeed, power);
        this.model = model;
        this.price = price;
        this.trunkVolume = trunkVolume;
    }

    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        if(price > 0){
            this.price = price;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", модель авто: " + model+ ", объем багажника: " + trunkVolume+ ", цена авто: " + price;
    }
}
