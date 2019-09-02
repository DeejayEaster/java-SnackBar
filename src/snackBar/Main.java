package snackBar;

public class Main {
    public static void main(String[] args) {
        // create users
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        // Instantiate 3 Vending Machines
        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");

        // Instantiate 5 snacks
        Snack chips = new Snack("Chips", 36, 1.75, food.getId());
        Snack chocolate = new Snack("Chocolate Bar", 36, 1.00, food.getId());
        Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getId());
        Snack soda = new Snack("Soda", 24, 2.50, drink.getId());
        Snack water = new Snack("Water", 20, 2.75, drink.getId());

        jane.buySnack(3, soda);
        System.out.println("Janes cash on hand: " + jane.getCashOnHand());
        System.out.println(soda.getQuantity() + "Soda's Remaining");
        jane.buySnack(1, pretzel);
        System.out.println("Janes cash on hand: " + jane.getCashOnHand());
        System.out.println(pretzel.getQuantity() + "Pretzel's Remaining");

        bob.buySnack(2, soda);
        System.out.println("Bob's cash on hand: " + bob.getCashOnHand());
        System.out.println(soda.getQuantity() + "Soda's Remaining");

        jane.addCashOnHand(10);
        System.out.println(jane.getCashOnHand());
        jane.buySnack(1, chocolate);
        System.out.println("Janes cash on hand: " + jane.getCashOnHand());
        System.out.println(chocolate.getQuantity() + "chocolate bar's Remaining");

        pretzel.addQuantity(12);
        System.out.println(pretzel.getQuantity());

        bob.buySnack(3, pretzel);
        System.out.println("Bob's cash on hand: " + bob.getCashOnHand());
        System.out.println(pretzel.getQuantity() + "Pretzel's Remaining");
    }
}