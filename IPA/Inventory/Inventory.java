package IPA.Inventory;

/**
 * Represents an inventory item with ID, quantities, and threshold.
 */
public class Inventory {
    private String inventoryId;
    private int maximumQuantity;
    private int currentQuantity;
    private int threshold;

    public void setInventoryId(String inventoryId){
        this.inventoryId = inventoryId;
    }
    public String getInventoryId(){
        return inventoryId;
    }
    public void setMaximumQuantity(int maximumQuantity){
        this.maximumQuantity = maximumQuantity;
    }
    public int getMaximumQuantity(){
        return maximumQuantity;
    }
    public void setCurrentQuantity(int currentQuantity){
        this.currentQuantity = currentQuantity;
    }
    public int getCurrentQuantity(){
        return currentQuantity;
    }
    public void setThreshold(int threshold){
        this.threshold = threshold;
    }
    public int getThreshold(){
        return threshold;
    }
    
}

