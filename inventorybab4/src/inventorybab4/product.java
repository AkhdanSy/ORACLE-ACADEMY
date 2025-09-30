package inventorybab4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Axioo
 */
public class product {
    private int number;
    private String name;
    private int qty;
    private int price;
    private boolean active=true;
    
public product(){
    this.number=0;
    this.name="Product";
    this.qty=0;
    this.price=0;
}

public product(int number, String name, int qty, double price){
    this.number=number;
    this.name=name;
    this.qty=qty;
    this.price=(int)price;
}

public int getNumber(){
    return number;
}

public void setNumber(int number){
    this.number=number;
}

public String getName(){
    return name;
}

public void setName(String name){
    this.name=name;
}

public int getQty(){
    return qty;
}

public void getQty(int qty){
    this.qty=qty;
}

public double getPrice(){
    return price;
}

public void setPrice(double price) {
    this.price=(int) price;
}

public boolean isActive(){
    return active;
}

public void setActive(boolean active){
    this.active=active;
}

public double getInventoryvalue(){
    return qty * price;
}

public String toString(){
    String Status = active ? "Active" : "Not Active";
    return "Item Number : " + number +
            "\nName : " + name +
            "\nQuantity in stock : " + qty +
            "\nPrice : " + price +
            "\nInventory value : " + getInventoryvalue() +
            "\nProduct Status : " + Status;
}
}
