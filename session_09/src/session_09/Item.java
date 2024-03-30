package session_09;

import java.util.Scanner;

public class Item {
    private String name;
    private double price;
    private int stock;
    private double amount;
    private static double totalAmt;

    // Constructor accepting parameters (String, double, int)
    public Item(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public void calAmount() {
        amount = price * stock;
        totalAmt += amount;
        System.out.println("Amount of stock for " + name + " is " + amount);
    }

    @Override
    public String toString() {
        return "Item [name=" + name + ", price=" + price + ", stock=" + stock + "]";
    }

    public static void billAmount() {
        System.out.println("Total amount is: " + totalAmt);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of items: ");
        int no = sc.nextInt();
        //creating object array
        Item item[] = new Item[no];
        //creating local variables
        String iname;
        double pr;
        int st;
 
        //applying for loop
        for (int i = 0; i < item.length; i++) {
            System.out.println("Enter item name: ");
            iname = sc.next();
            System.out.println("Enter price: ");
            pr = sc.nextDouble();
            System.out.println("Enter stock: ");
            st = sc.nextInt();

            //passing values in object array
            item[i] = new Item(iname, pr, st);
            System.out.println(item[i]);
            item[i].calAmount();
        }

        Item.billAmount();
    }
}
