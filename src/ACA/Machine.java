package ACA;

public class Machine {
    private int waterMachine;
    private int milkMachine;
    private int beansMachine;
    private int moneyMachine;
    private int value = 0;
    private Coffee coffee;

    //Default Constructor
    public Machine() {

    }

    //Constructor
    public Machine(int waterMachine, int milkMachine, int beansMachine, int moneyMachine) {
        if (waterMachine > 0) {
            this.waterMachine = waterMachine;
        } else {
            this.waterMachine = 0;
        }

        if (milkMachine > 0) {
            this.milkMachine = milkMachine;
        } else {
            this.milkMachine = 0;
        }

        if (beansMachine > 0) {
            this.beansMachine = beansMachine;
        } else {
            this.beansMachine = 0;
        }

        if (moneyMachine > 0) {
            this.moneyMachine = moneyMachine;
        } else {
            this.moneyMachine = moneyMachine;
        }
    }

    //getters
    public int getWaterMachine() {
        return waterMachine;
    }

    public int getMilkMachine() {
        return milkMachine;
    }

    public int getBeansMachine() {
        return beansMachine;
    }

    public int getMoneyMachine() {
        return moneyMachine;
    }

    //setters
    public void setWaterMachine(int waterMachine) {
        if (waterMachine > 0) {
            this.waterMachine = waterMachine;
        } else {
            this.waterMachine = 0;
        }
    }

    public void setMilkMachine(int milkMachine) {
        if (milkMachine > 0) {
            this.milkMachine = milkMachine;
        } else {
            this.milkMachine = 0;
        }
    }

    public void setBeansMachine(int beansMachine) {
        if (beansMachine > 0) {
            this.beansMachine = beansMachine;
        } else {
            this.beansMachine = 0;
        }
    }

    public void setMoneyMachine(int moneyMachine) {
        if (moneyMachine > 0) {
            this.moneyMachine = moneyMachine;
        } else {
            this.moneyMachine = moneyMachine;
        }
    }


    //Resource Method
    private void resource(int coutOfCups, Coffee coffee) {
        if (coutOfCups * coffee.getWater() > waterMachine || coutOfCups * coffee.getMilk() > milkMachine || coutOfCups * coffee.getBeans() > beansMachine) {
            int maxCups = waterMachine;

            if (milkMachine > waterMachine && milkMachine > beansMachine) {
                maxCups = milkMachine;
            } else if (beansMachine > milkMachine && beansMachine > waterMachine){
                maxCups=beansMachine;
            }

            if (coffee.getWater() != 0 && waterMachine / coffee.getWater() < maxCups) {
                maxCups = waterMachine / coffee.getWater();
            }

            if (coffee.getMilk() != 0 && milkMachine / coffee.getMilk() < maxCups) {
                maxCups = milkMachine / coffee.getMilk();
            }

            if (coffee.getBeans() != 0 && beansMachine / coffee.getBeans() < maxCups) {
                maxCups = beansMachine / coffee.getBeans();
            }

            System.out.println("No, I can make only " + maxCups + " cup(s) of coffee\n");

        } else if (coutOfCups * coffee.getWater() == waterMachine || coutOfCups * coffee.getMilk() == milkMachine || coutOfCups * coffee.getBeans() == beansMachine) {

            System.out.println("Yes, I can make that amount of coffee\n");

        } else if (coutOfCups * coffee.getWater() < waterMachine && coutOfCups * coffee.getMilk() < milkMachine && coutOfCups * coffee.getBeans() < beansMachine) {

            int maxWater = waterMachine - (coutOfCups * coffee.getWater());
            int maxMilk = milkMachine - (coutOfCups * coffee.getMilk());
            int maxBeans = beansMachine - (coutOfCups * coffee.getBeans());
            int maxCups = maxWater / coffee.getWater();

            if (coffee.getMilk() != 0 && maxMilk / coffee.getMilk() < maxCups) {
                maxCups = maxMilk / coffee.getMilk();
            }

            if (maxBeans / coffee.getBeans() < maxCups) {
                maxCups = maxBeans / coffee.getBeans();
            }

            System.out.println("Yes, I can make that amount of coffee (and even " + maxCups + " more than that)\n");

        }

    }


    //Buy Method
    public void buy(int typeOfCoffee, int cout) {

        if (typeOfCoffee == 1 && cout > 0) {
            coffee = new Espresso();
            resource(cout, coffee);

            if (cout * coffee.getWater() <= waterMachine && cout * coffee.getMilk() <= milkMachine && cout * coffee.getBeans() <= beansMachine) {
                waterMachine -= cout * coffee.getWater();
                milkMachine -= cout * coffee.getMilk();
                beansMachine -= cout * coffee.getBeans();
                moneyMachine += cout * coffee.getCost();
                value += cout * coffee.getCost();
            } else {
                System.out.println("No Recourse\n");
            }

            System.out.println("Water of Machine: " + waterMachine + "ml");
            System.out.println("Milk of Machine: " + milkMachine + "ml");
            System.out.println("Beans of Machine: " + beansMachine + "g");
            System.out.println("Money of Machine: " + moneyMachine + "$\n");

        } else if (typeOfCoffee == 2 && cout > 0) {
            coffee = new Latte();
            resource(cout, coffee);

            if (cout * coffee.getWater() <= waterMachine && cout * coffee.getMilk() <= milkMachine && cout * coffee.getBeans() <= beansMachine) {
                waterMachine -= cout * coffee.getWater();
                milkMachine -= cout * coffee.getMilk();
                beansMachine -= cout * coffee.getBeans();
                moneyMachine += cout * coffee.getCost();
                value += cout * coffee.getCost();
            } else {
                System.out.println("No Recourse\n");
            }

            System.out.println("Water of Machine: " + waterMachine + "ml");
            System.out.println("Milk of Machine: " + milkMachine + "ml");
            System.out.println("Beans of Machine: " + beansMachine + "g");
            System.out.println("Money of Machine: " + moneyMachine + "$\n");

        } else if (typeOfCoffee == 3 && cout > 0) {
            coffee = new Capuchino();
            resource(cout, coffee);

            if (cout * coffee.getWater() <= waterMachine && cout * coffee.getMilk() <= milkMachine && cout * coffee.getBeans() <= beansMachine) {
                waterMachine -= cout * coffee.getWater();
                milkMachine -= cout * coffee.getMilk();
                beansMachine -= cout * coffee.getBeans();
                moneyMachine += cout * coffee.getCost();
                value += cout * coffee.getCost();
            } else {
                System.out.println("No Recourse\n");
            }

            System.out.println("Water of Machine: " + waterMachine + "ml");
            System.out.println("Milk of Machine: " + milkMachine + "ml");
            System.out.println("Beans of Machine: " + beansMachine + "g");
            System.out.println("Money of Machine: " + moneyMachine + "$\n");

        } else {
            System.out.println("We do not have such an order\n");
        }
    }


    //Fill Method
    public void fill(int water, int milk, int beans, int cout) {

        if (water >= 0 && milk >= 0 && beans >= 0 && cout > 0 && cout * water <= waterMachine && cout * milk <= milkMachine && cout * beans <= beansMachine) {
            coffee = new Coffee(water, milk, beans, (3 * (water + milk + beans)) / 265);    //265-y 1 bajaki mej cofee-i, milk-i, beans-i gumarna
            resource(cout, coffee);

            waterMachine -= cout * water;
            milkMachine -= cout * milk;
            beansMachine -= cout * beans;
            moneyMachine += cout * (3 * (water + milk + beans)) / 265;
            value += cout * (3 * (water + milk + beans)) / 265;
        } else {
            System.out.println("No Recourse\n");
        }

        System.out.println("Water of Machine: " + waterMachine + "ml");
        System.out.println("Milk of Machine: " + milkMachine + "ml");
        System.out.println("Beans of Machine: " + beansMachine + "g");
        System.out.println("Money of Machine: " + moneyMachine + "$\n");
    }


    //Take Method
    public void take() {

        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!\n");

        System.out.println("Give " + value + "$");

        value = 0;

    }


}

