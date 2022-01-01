
/**
 * Write a description of class Item here.
 *
 * @author Jacob Neiheisel
 * @classinfo CIS 162 - Professor Posada - Section 09
 * @version 23 September 2020 - version 1.0
 */

import java.text.*;
import java.util.Currency;
import java.util.Locale;
public class Item{
    // instance variables - replace the example below with your own
    private String itemCode;
    private String description;
    private double price;
    private int inventory;
    NumberFormat usd = NumberFormat.getCurrencyInstance(Locale.US);

    /**
     * Constructor for objects of class Item
     * - specific parameters - none
     */
    public Item(){
        price = 0.0;
        inventory = 10;
    }

    /**
     * Constructor for objects of class Item
     * @param iCode - item code
     * @param desc - description
     * @param amount - cost of item
     * @param units - amount in inventory
     */
    public Item(String iCode, String desc, double amount, int units){
        if(amount <0){
            //this is to prevent negative numbers for price
            amount = 0;
        }
        if(units <0){
            //this is to prevent negative numbers for inventory
            units = 0;
        }
        itemCode = iCode;
        description = desc;
        price = amount;
        inventory = units;

    }

    /**
     * getItemCode() method
     *
     *  
     * @return    itemCode - item name in system - specific name
     */
    public String getItemCode(){
        return itemCode;
    }

    /**
     * getDescription() method
     *
     *  
     * @return    description - what that item is
     */
    public String getDescription(){
        return description;
    }

    /**
     * getPrice() method
     *
     *  
     * @return    price - price of item in USD
     */
    public double getPrice(){
        return price;
    }

     /**
     * getInventory() method
     *
     * 
     * @return    inventory - remaining inventory of the item
     */
    public int getInventory(){
        return inventory;
    }

    /**
     * setItemCode() method
     *
     * @param  iCode - code for the item
     * 
     */
    public void setItemCode(String iCode){
        itemCode = iCode;
    }

    /**
     * setDescription() method
     *
     * @param  desc - description for item
     * 
     */
    public void setDescription (String desc){
        description = desc;
    }

    /**
     * setPrice() method
     *
     * @param  amount - new price for item
     * 
     */
    public void setPrice (double amount){
        if(amount <0){
            //this is to prevent negative numbers for price
            amount = price;
        }

        price = amount;
    }

    /**
     * setInventory() method
     *
     * @param  units - amount of inventory to set
     * 
     */
    public void setInventory (int units){
        if(units <0){
            //this is to prevent negative numbers for inventory
            units = inventory;

        }
        inventory=units;
    }

    /**
     * addToInventory() method
     *
     * @param  units - amount of inventory to add
     * 
     */
    public void addToInventory (int units){
        if(units <0){
            //this is to prevent negative numbers for added inventory, these are seen as mistakes and made positive
            units = 0;
        }
        inventory+=units;
    }

    /**
     * subtractFromInventory() method
     *
     * @param  units - amount of inventory to take away
     * 
     */
    public void subtractFromInventory (int units){
        if(units <0){
            //this is to prevent negative numbers for inventory taken away, these are seen as mistakes and made positive
            units = 0;
        }
        if(inventory-units<0){
            units  = inventory;
        }
        inventory-=units;
    }

    /**
     * toString() method
     *
     * @return Item code, description, price, and inventory
     * 
     */
    public String toString (){
        return "Item code: "+itemCode+"\t Item Description: "+description+"\t Item Price: "+usd.format(price)+"\t Inventory: "+inventory;
    }
}
