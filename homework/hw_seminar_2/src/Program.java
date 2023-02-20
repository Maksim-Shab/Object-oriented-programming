public class Program {
    public static void main(String[] args) {
        Car car1 = new Car("Corolla", 2000, 360000, "Green", 110, 180);
        car1.getInfo();
        System.out.println(car1.getPrice());
        car1.setPrice(370000);
        System.out.println(car1.getColor());
        car1.setColor("Black");
        car1.getInfo();
        System.out.println(car1.getPrice());
        System.out.println(car1.getColor());
        car1.Start();
        car1.Road("Москва");
        car1.Stop();
        car1.Road("Москва");

        Car car2 = new Car("Camry", 2013, 780000, "Black", 140, 240);
        car2.getInfo();
        car2.Start();
        car2.Road("Барнаул");
        car2.Stop();
        car2.Road("Барнаул");

        car1.yearEquals(car2);
    }
}