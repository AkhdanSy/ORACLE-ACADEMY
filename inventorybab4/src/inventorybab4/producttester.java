/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inventorybab4;

import java.util.InputMismatchException;
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
        Scanner in=new Scanner (System.in);
        
        int maxSize = -1;
        
        do{
            try{
                System.out.println("masukkan jumlah yang ingin anda tambahkan");
                System.out.println("masukkan 0 jika anda tidak ingin menambahkan produk");
                maxSize = in.nextInt();
                
                if (maxSize < 0){
                    System.out.println("nilai salah di masukkan\n");
                }
            }catch (InputMismatchException e){
                System.out.println("Incorrect data type entered!");
                in.nextLine();
            }
        }while (maxSize < 0);
        in.nextLine();
        
        if(maxSize == 0){
            System.out.println("No product required!");
        }else{
            product[] products = new product[maxSize];
            
            for (int i = 0; i < maxSize; i++){
                System.out.println("\nEnter product " + (i+1) + " Data");
                
                System.out.print("item number : ");
                int number = in.nextInt();
                in.nextLine();
                
                System.out.print("item name : ");
                String name = in.nextLine();
                
                System.out.print("item avaibility : ");
                int qty = in.nextInt();
                
                System.out.print("item price : ");
                Double price = in.nextDouble();
            }
        }
        in.close();
    }
    
}
