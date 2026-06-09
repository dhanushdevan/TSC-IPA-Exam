package IPA.Inventory;

import IPA.Inventory.Inventory;
import java.util.*;
public class InventoryQuestion{
    public static void main(String[] args) {
        System.out.println("Inventory Program");
        Scanner scanner = new Scanner(System.in);
        List<Inventory> inventoryList = new ArrayList<>();
        for(int i=0;i<4;i++){
            Inventory inventory= new Inventory();
            inventory.setInventoryId(scanner.nextLine());
            inventory.setMaximumQuantity(scanner.nextInt());
            inventory.setCurrentQuantity(scanner.nextInt());
            inventory.setThreshold(scanner.nextInt());
            scanner.nextLine();
            inventoryList.add(inventory);
        }
        int threshold = scanner.nextInt();
        List<Inventory> result = replenish(inventoryList,threshold);
        for(Inventory inventory:result){
            if(inventory.getThreshold()>=75){
                System.out.println(inventory.getInventoryId() + " Critical Filling");
            }else if(inventory.getThreshold()>=50 && inventory.getThreshold()<75){
                System.out.println(inventory.getInventoryId() + " Moderate Filling");
            }else{
                System.out.println(inventory.getInventoryId() + " Non-Critical Filling");
            }
        }
    }
    public static List<Inventory> replenish(List<Inventory> inventoryList,int threshold) {
        List<Inventory> result= inventoryList.stream().filter(a->a.getThreshold()<=threshold).toList();
        return result;

}
}