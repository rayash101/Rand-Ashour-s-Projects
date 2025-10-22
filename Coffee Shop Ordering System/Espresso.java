package pack;

import java.awt.event.ActionListener;

public class Espresso extends Coffee{
    private int shots;
    private String milkType;
    private int Whole= 100;
    private int Soy=100;
    private int Oat=100;
    private String otherIng;
    int calories;
    int milkTypeCal;
    int OICal;
    int numOI;

    public Espresso(String name, int price, String description, int shots, int baseCalories, String milkType, String otherIng, int milkTypeCal, int OICal, int numOI) {
        super(name, price, description, baseCalories);
        this.shots=shots;
        this.milkType=milkType;
        this.otherIng=otherIng;
        this.milkTypeCal=milkTypeCal;
        this.OICal=OICal;
        this.numOI=numOI;
    }
    //SHOTS
    public int getShots() {
        return shots;
    }
    public void setShots(int shots) {
        this.shots=shots;
    }

    //MILK TYPES

    public String getMilkType() {
        return milkType;
    }


    public void setMilkType(String milkType) {
        this.milkType=milkType;
    }

    //OTHER INGREDIENTS
    public String getOtherIng() {
        return otherIng;
    }
    public void setOtherIng(String otherIng) {
        this.otherIng=otherIng;
    }

    //MILK TYPE CALORIES
//calories for each milk type
    public int getMilkTypeCal() {
        return milkTypeCal;
    }
    public void setMilkTypeCal(int milkTypeCal) {
        this.milkTypeCal=milkTypeCal;
    }

//OTHER INGREDIENTS CALORIES
// calories for the 'other ingredients'

    public int getOICal() {
        return numOI*OICal;
    }
    public void setOICal(int OICal) {
        this.OICal=OICal;
    }

    //NUMBER OF OTHER ING
    public int getNumOI() {
        return numOI;
    }
    public void setNumOI(int numOI) {
        this.numOI=numOI;
    }

    //CALORIES
//computes all the calories of the customized espresso and returns it
    public int getCalories() {
        return calories+(shots*3)+milkTypeCal+OICal;
    }
    public void setCalories(int calories) {
        this.calories=calories;
    }




    //make methods
}
