public class ShopItemManagementSystem 
{
    public static void main(String[] args)
    {
        ShopItem item1 = new ShopItem("Phone", 1000.00, 4);

        System.out.println(item1.getItemName());
        System.out.println(item1.getItemPrice());
        System.out.println(item1.getItemQuantity());

        item1.updateQuantity(4);
        System.out.println(item1.getItemQuantity());  // Fixed method call
    }
}

class ShopItem {
    private String itemName;
    private double itemPrice;
    private int itemQuantity;

    // ✅ Added constructor
    public ShopItem(String itemName, double itemPrice, int itemQuantity) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQuantity = itemQuantity;
    }

    public String getItemName()
    {
        return itemName;
    }

    public double getItemPrice()
    {
        return itemPrice;
    }

    public int getItemQuantity()
    {
        return itemQuantity;
    }
 public int updateQuantity(int quantity)
    {
        if (quantity > 0)
        {
            itemQuantity = itemQuantity + quantity;
        }
        return itemQuantity;
    }
}