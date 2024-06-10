package Homework;

import java.util.List;

public interface VendingMachine {
    public void addProduct(HotDrinkWithTemperature product);

    public void initProducts(List<HotDrinkWithTemperature>productLists);
    
    public HotDrinkWithTemperature getProduct(String name);
}
