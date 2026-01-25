package pack;

public class Coffee {

    private String name;
    private int price;
    private String description;
    //private int calories;
    private int baseCalories;

    public Coffee (String name, int price, String description, int baseCalories) {
        this.name=name;
        this.price=price;
        this.description=description;
        this.baseCalories=baseCalories;

    }

    //NAME OF COFFEE
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }

    //PRICE
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price=price;
    }

    //DESCRIPTION
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description=description;
    }

    //BASE CALORIES
    public int getBaseCalories() {
        return baseCalories;
    }
    public void setBaseCalories(int BaseCalories) {
        this.baseCalories=BaseCalories;
    }
//CALORIES
//	public int getCalories() {
//		return calories;
//	}
//	public void setCalories(int calories) {
//		this.calories=calories;
//	}
}
