package Homework;

public class HotDrinkWithTemperature extends HotDrink {

    private double temperature;

    public HotDrinkWithTemperature(String name, double volume, double temperature) {
        super(name, volume);
        this.temperature = temperature;
    }
    
    public double getTemperature(){return temperature;}
    public void setTemperature(double temperature){this.temperature = temperature;}
}
