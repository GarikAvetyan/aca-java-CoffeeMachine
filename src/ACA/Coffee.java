package ACA;

public class Coffee {
    private int water;
    private int milk;
    private int beans;
    private int cost;

    //Default Constructor
    public Coffee() {
    }

    //Constructor
    public Coffee(int water, int milk, int beans, int cost) {
        if (water >= 0) {
            this.water = water;
        } else {
            this.water = 0;
        }

        if (milk >= 0) {
            this.milk = milk;
        } else {
            this.milk = 0;
        }

        if (beans >= 0) {
            this.beans = beans;
        } else {
            this.beans = 0;
        }

        if (cost >= 0) {
            this.cost = cost;
        } else {
            this.cost = 0;
        }
    }

    //getters
    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    public int getBeans() {
        return beans;
    }

    public int getCost() {
        return cost;
    }

    //setters
    public void setWater(int water) {
        if (water >= 0) {
            this.water = water;
        } else {
            this.water = 0;
        }
    }

    public void setMilk(int milk) {
        if (milk >= 0) {
            this.milk = milk;
        } else {
            this.milk = 0;
        }
    }

    public void setBeans(int beans) {
        if (beans >= 0) {
            this.beans = beans;
        } else {
            this.beans = 0;
        }
    }

    public void setCost(int cost) {
        if (cost >= 0) {
            this.cost = cost;
        } else {
            this.cost = 0;
        }
    }
}
