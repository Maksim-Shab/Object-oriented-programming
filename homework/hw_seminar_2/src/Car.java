/*
Напишите класс Car.
В классе должна храниться следующая информация:
    название автомобиля - model;
    год выпуска - year;
    стоимость - price;
    цвет - color;
    объем двигателя - power.
 */
/*
Доработайте класс Car.
Добавьте в класс Car метод getInfo без параметров,
который будет печатать на экране значения полей класса model, power, и year.
 */

/*
Доработайте класс Car.
В классе должна храниться следующая информация:
    Свойство -которе говорит заведен автомобиль или нет;
    Метод - запуска атомобиля;
    Метод - остановки автомобиля;
    Метод дороги - при вызове, в качестве аргумента передает место назначения.
        И если автомобиль заведен - выводим, что мы на такой-то авто едем в место назначения
        Если не заведен - выводим, что авто не заведено. И мы не можем ехать.
 */

/*
Доработайте программу в свободном стиле.
Можно сравнить 2 автомобиля между собой
Или пусть авто заедет за фруктами :-)
Добавьте несколько произвольных методов и свойств

 */

/*
Переписать прошлое домашнее задание с использованием принципа инкапсуляции.
 */
public class Car {
    private String model;
    private int year;
    private double price;
    private String color;
    private int power;
    private boolean status;
    private int maxSpeed;

    Car(String model, int year, double price, String color, int power, int maxSpeed){
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
        this.power = power;
        this.status = false;
        this.maxSpeed = maxSpeed;
    }

    public double getPrice(){
        return this.price;
    }
    public void setPrice(double price){
        if(price > 0){
            this.price = price;
        }
    }

    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
            this.color = color;
    }

    public void Start(){
        status = true;
        System.out.println("Автомобиль заведен.");
    }

    public void Stop(){
        status = false;
        System.out.println("Автомобиль остановлен.");
    }

    public void Road(String city){
        if(status == true){
            System.out.println("Мы на авто \"" + model + "\" едем в город: " + city);
        } else {
            System.out.println("Авто не заведено. И мы не можем ехать.");
        }
    }

    public void getInfo(){
        System.out.println(model + ", " + power + ", " + year + ", " + color + ", " + price);
    }

    public void yearEquals(Car car) {
        if (this.year == car.year) {
            System.out.println(String.format("Автомобиль %s %s одного года выпуска с  %s %s", this.color, this.model, car.color, car.model));
        }
        else if (this.year > car.year){
            System.out.println(String.format("Автомобиль: %s %s младше автомобиля: %s %s", this.color, this.model, car.color, car.model));
        }
        else {
            System.out.println(String.format("Автомобиль: %s %s старше автомобиля: %s %s", this.color, this.model, car.color, car.model));
        }
    }
}

