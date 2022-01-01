
/**
 * Write a description of class ItemTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ItemTest{

    public static void main(String [] args)    {
        // instantiating an item
        Item item1 = new Item("Item1", "GVSU t-shirt", 29.99, 100);

        System.out.println(item1.toString());

        item1.addToInventory(3);

        item1.setPrice(15.99);
        System.out.println(item1.getInventory());
        System.out.println(item1.getPrice());

        System.out.println(item1.toString());
        
        //new object and prints mimicing the first item prints

        Item nikeSlides = new Item("ItemMens","Nike Solarsoft Comfort Slides",50.00, 50); 
        System.out.println(nikeSlides.toString());
        nikeSlides.addToInventory(10);
        System.out.println(nikeSlides.getInventory());
        nikeSlides.setItemCode("ItemBeach");
        System.out.println(nikeSlides.getItemCode());
        nikeSlides.setDescription("Nike Slides");
        System.out.println(nikeSlides.getDescription());
        nikeSlides.setPrice(34.99);
        System.out.println(nikeSlides.getPrice());
        System.out.println(nikeSlides.toString());
        
        //to test the negative preventer methods
      Item item2 = new Item("Item2","GVSU adidas tank top",-25.00, -5); 
       System.out.println(item2.toString());
       Item item3 = new Item("Item3","GVSU tank top",25.00, 50); 
       System.out.println(item3.toString());
       item3.addToInventory(-10);
       System.out.println(item3.getInventory());
       item3.subtractFromInventory(-10);
       System.out.println(item3.getInventory());
       item3.subtractFromInventory(75);
       System.out.println(item3.getInventory());
       item3.addToInventory(10);
       System.out.println(item3.getInventory());
        item3.subtractFromInventory(-75);
        System.out.println(item3.getInventory());
        item3.subtractFromInventory(10);
        System.out.println(item3.getInventory());
        //note that the below 
    }    
}  

