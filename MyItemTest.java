
import org.junit.*;
import java.text.*;
import java.util.Locale;
/****************************************************
 * ItemTest - class used to test the Item class (Lab 5)
 *
 * @author  Ana Posada
 * @version January 2020
 ****************************************************/
public class MyItemTest {

    @Test
    public void testDefaultConstructor() {
        Item item1 = new Item();
        Assert.assertEquals("Item price should be 0.0", 
            0.0, item1.getPrice(), 0.001);
        Assert.assertEquals("Item inventory should be 10", 
            10, item1.getInventory());
    }

    @Test
    public void testConstructor2() {
        Item item1 = new Item("Item-1", "Pencil", 1.25, 50);
        Assert.assertEquals("Item code should be equal to the input parameter. Example:",
            "Item-1", item1.getItemCode());
        Assert.assertEquals("Item desc should be equal to the input parameter. Example:",
            "Pencil",item1.getDescription());
        Assert.assertEquals("Item price should be equal to the input parameter. Example:",
            1.25, item1.getPrice(), 0.001);
        Assert.assertEquals("Item inventory should be equal to the input parameter. Example:",
            50, item1.getInventory());     
    }

    @Test
    public void testSetCode() {
        Item item1 = new Item("Item-1", "Pencil", 1.25, 50);
        item1.setItemCode ("Item-new1");
        Assert.assertEquals("Item code should be equal to the input parameter. Example:",
            "Item-new1", item1.getItemCode());
    }

    @Test
    public void testSetDescription() {
        Item item1 = new Item("Item-1", "Pencil", 1.25, 50);
        item1.setDescription ("Pen");
        Assert.assertEquals("Item description should be equal to the input parameter. Example:",
            "Pen", item1.getDescription());
    }

    @Test
    public void testSetPriceOK() {
        Item item1 = new Item("Item-1", "Pencil", 1.25, 50);
        item1.setPrice (2.33);
        Assert.assertEquals("Item price should be equal to the input parameter. Example:",
            2.33, item1.getPrice(), 0.001);
    }

    @Test
    public void testSetInventoryOK() {
        Item item1 = new Item("Item-1", "Pencil", 1.25, 50);
        item1.setInventory (99);
        Assert.assertEquals("Item inventory should be equal to the input parameter. Example:",
            99, item1.getInventory());

    }

    @Test
    public void testSetPriceNotOK() {
        Item item1 = new Item("Item-1", "Pencil", 1.25, 50);
        item1.setPrice (-2.33);
        Assert.assertEquals("Item price should not change if input parameter is negative.",
            1.25, item1.getPrice(), 0.001);
    }

    @Test
    public void testSetInventoryNotOK() {
        Item item1 = new Item("Item-1", "Pencil", 1.25, 50);
        item1.setInventory (-99);
        Assert.assertEquals("Item inventory should not change if input parameter is negative. Example:",
            50, item1.getInventory());
    }

    @Test
    public void testAddToInventoryOK() {
        Item item1 = new Item("Item-1", "Pencil", 1.25, 50);
        item1.addToInventory (10);
        Assert.assertEquals("Item inventory should be incremented by the input parameter. Example:",
            60, item1.getInventory());
    }

    @Test
    public void testAddToInventoryNotOK() {
        Item item1 = new Item("Item-1", "Pencil", 1.25, 50);
        item1.addToInventory (-10);
        Assert.assertEquals("Item inventory should not change if input parameter is negative. Example:",
            50, item1.getInventory());
    }

    @Test
    public void testSubtractFromInventoryOK() {
        Item item1 = new Item("Item-1", "Pencil", 1.25, 50);
        item1.subtractFromInventory (10);
        Assert.assertEquals("Item inventory should be decreased by the input parameter. Example:",
            40, item1.getInventory());
    }

    @Test
    public void testSubtractFromInventoryNotOK() {
        Item item1 = new Item("Item-1", "Pencil", 1.25, 50);
        item1.subtractFromInventory (-10);
        Assert.assertEquals("Item inventory should not change if input parameter is negative. Example:",
            50, item1.getInventory());
    }

    @Test
    public void testToString() {
        NumberFormat nf =  NumberFormat.getCurrencyInstance(Locale.US);
        Item item1 = new Item("Item-1", "Pencil", 1.25, 50);
        Assert.assertTrue(item1.toString().contains (nf.format(item1.getPrice())));
    }
}