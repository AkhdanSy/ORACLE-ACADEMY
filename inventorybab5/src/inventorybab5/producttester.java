/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inventorybab5;

import java.util.Scanner;

/**
 *
 * @author Axioo
 */
public class producttester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        int number,qty;
        String name;
        double price;
        
        System.out.println("Eneter product 1 Data");
        System.out.print("Item number: ");
        number=in.nextInt();
        System.out.println("Item name: ");
        in.nextLine();
        name=in.nextLine();
        System.out.print("Item avaiblity: ");
        qty=in.nextInt();
        System.out.println("Unit price: ");
        price=in.nextDouble();
        product p1=new product(number,name,qty,price);
        
        System.out.println("Eneter product 2 Data");
        System.out.print("Item number: ");
        number=in.nextInt();
        System.out.println("Item name: ");
        in.nextLine();
        name=in.nextLine();
        System.out.print("Item avaiblity: ");
        qty=in.nextInt();
        System.out.println("Unit price: ");
        price=in.nextDouble();
        product p2=new product(number,name,qty,price);
        
        in.close();
        
        product p3=new product(1, "Samsung", 25, 8000000);
        product p4=new product(2, "Realme", 20, 2000000);
        product p5=new product(3, "Infinix", 15, 1000000);
        product p6=new product(4, "iPhone", 10, 20000000);
        
        p6.setActive(false);
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        System.out.println(p5);
        System.out.println(p6);
    }
    
}
