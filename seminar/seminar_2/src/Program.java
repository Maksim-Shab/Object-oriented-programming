public class Program {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(5);
        vendingMachine.add(new Product("Snickers", 12));
        vendingMachine.add(new Product("Mars", 8));
        vendingMachine.add(new Product("MilkyWay", 35));
        vendingMachine.add(new Product("Twiks", 6));

        try {
            System.out.println(vendingMachine.getProductName("Mars"));
            System.out.println(vendingMachine.getProductByCost(35));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}