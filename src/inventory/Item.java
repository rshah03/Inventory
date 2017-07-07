package inventory;

public class Item {

    int partID;
    int skuNum;
    int vendorID;
    String vendorName;
    int quantity;
    boolean inStock;

    public Item(int partID, int skuNum, int vendorID, String vendorName, int quantity, boolean inStock) {
        this.partID = partID;
        this.skuNum = skuNum;
        this.vendorID = vendorID;
        this.vendorName = vendorName;
        this.quantity = quantity;
        this.inStock = inStock;
    }

    public int getPartID() {
        return partID;
    }

    public int getSkuNum() {
        return skuNum;
    }

    public int getVendorID() {
        return vendorID;
    }

    public String getVendorName() {
        return vendorName;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isInStock() {
        return inStock;
    }
}
