/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventory;

/**
 *
 * @author Axioo
 */
public class producttester {
    public static void main(String[] args) {

        // Dua produk dengan konstruktor default
        product p1 = new product();
        product p2 = new product();

        // Empat produk dengan konstruktor parameter
        product p3 = new product(1, "Samsung", 25, 5000000);
        product p4 = new product(2, "Realme", 20, 4000000);
        product p5 = new product(3, "Infinix", 15, 3000000);
        product p6 = new product(4, "Poco", 1, 4000000);

        // Menampilkan semua produk ke konsol
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);
    }
}