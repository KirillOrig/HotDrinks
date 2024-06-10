package Homework;

public class Main {
    public static void main(String[] args) {
        HotDrinkWithTemperature hotDrink1 = new HotDrinkWithTemperature("Американо", 250, 80);
        HotDrinkWithTemperature hotDrink2 = new HotDrinkWithTemperature("Капучино", 200, 85);
        HotDrinkWithTemperature hotDrink3 = new HotDrinkWithTemperature("Мокачино", 250, 80);
        
        HotDrinkVandingMachine hotDrinkMachine = new HotDrinkVandingMachine();

        hotDrinkMachine.addProduct(hotDrink1);
        hotDrinkMachine.addProduct(hotDrink2);
        hotDrinkMachine.addProduct(hotDrink3);
        System.out.println(hotDrinkMachine.getProduct("Американо").getName());
        System.out.println(hotDrinkMachine.getProduct("Американо").getVolume());
        System.out.println(hotDrinkMachine.getProduct("Американо").getTemperature());
        System.out.println(hotDrinkMachine.getProduct("Капучино").getName());
        System.out.println(hotDrinkMachine.getProduct("Капучино").getVolume());
        System.out.println(hotDrinkMachine.getProduct("Капучино").getTemperature());
        System.out.println(hotDrinkMachine.getProduct("Мокачино").getName());
        System.out.println(hotDrinkMachine.getProduct("Мокачино").getVolume());
        System.out.println(hotDrinkMachine.getProduct("Мокачино").getTemperature());
    }
}
