public class Transport {
    private int year;
    private String color;
    private int maxSpeed;

    public Transport(int year, String color, int maxSpeed) {
        this.year = year;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Транспорт: " + "год выпуска: " + year + ", Цвет: '" +
                color + '\''+ ", максимальная скорость: " + maxSpeed +",\n";
    }
}
