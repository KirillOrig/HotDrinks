package Homework;

import java.util.ArrayList;
import java.util.List;

public class HotDrinkVandingMachine implements VendingMachine {
    private List<HotDrinkWithTemperature> hotDrinks;

    public HotDrinkVandingMachine(){
        hotDrinks = new ArrayList<>();
    }
    @Override
    public void addProduct(HotDrinkWithTemperature product) {
        hotDrinks.add(product);
    }

    @Override
    public void initProducts(List<HotDrinkWithTemperature> productLists) {
        this.hotDrinks = productLists;
    }

    @Override
    public HotDrinkWithTemperature getProduct(String name) {
        for(HotDrinkWithTemperature hotDrink:hotDrinks)
            if(hotDrink.getName() == name)
                return hotDrink;
        return null;
    }
    
    public HotDrinkWithTemperature getProduct(String name, double volume, double temperature){
        return new HotDrinkWithTemperature(name, volume, temperature);
    }
}
