package pack;

import java.awt.event.ActionListener;

public class FilteredCoffee extends Coffee{

    private String brewType;

    public FilteredCoffee(String name, int price, String description, int calories, String brewType) {
        super(name, price, description, calories);
        this.brewType=brewType;
    }
    //BREW TYPE
    public String getBrewType() {
        return brewType;
    }
    public void setBrewType(String brewType) {
        this.brewType=brewType;

    }

}
