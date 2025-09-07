/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventory;

/**
 *
 * @author Axioo
 */
public class product {
    // Instance field declarations
    private int number;      // Nomor item (unik)
    private String name;     // Nama produk
    private int qty;         // Jumlah unit yang tersedia
    private int price;    // Harga per unit

    /**
     * constructor default
     * Initialize all fields to default values
     */
    public product() {
        this.number = 0;
        this.name = "Product";
        this.qty = 0;
        this.price = 0;
    }

    /**
     * constructor overload with parameter
     * @param number product unique number
     * @param name product name
     * @param qty number of products available
     * @param price price per unit of product
     */
    public product(int number, String name, int qty, double price) {
        this.number = number;
        this.name = name;
        this.qty = qty;
        this.price = (int) price;
    }

    // Getter dan Setter (Accessor / Mutator)

    /** Retrieving item number */
    public int getNumber() {
        return number;
    }

    /** Set item number */
    public void setNumber(int number) {
        this.number = number;
    }

    /** Taking product name */
    public String getName() {
        return name;
    }

    /** set product name */
    public void setName(String name) {
        this.name = name;
    }

    /** Taking the number of products */
    public int getQty() {
        return qty;
    }

    /** Determine the number of products */
    public void setQty(int qty) {
        this.qty = qty;
    }

    /** Get product price */
    public double getPrice() {
        return price;
    }

    /** Setting product prices */
    public void setPrice(double price) {
        this.price = (int) price;
    }

    /**
     * Override toString() to display product details
     */
    @Override
    public String toString() {
        return "Item Number : " + number +
               "\nName : " + name +
               "\nQuantity in stock: " + qty +
               "\nPrice : " + price + "\n";
    }
}