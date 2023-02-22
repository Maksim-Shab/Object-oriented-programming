public class Main {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(2001, "black",180, 110,"Corolla",380000, 250);
        System.out.println(sedan.toString());
        sedan.setPrice(400000);
        System.out.println(sedan.toString());
    }
}