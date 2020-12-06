package GB.Mazhaev;

import java.util.Random;

public class Cat {
    private String name;
    private boolean satiety;
    private int hunger;
    Random random = new Random();

    public Cat(String name) {
        this.name = name;
        this.hunger = random.nextInt(25);
        if (hunger == 0) {
            this.satiety = true;
        } else  {
            this.satiety = false;
        }
    }

    public void getInfoCat() {
        if (satiety != true) {
            System.out.println(name + ": голод - " + hunger + "/сытость - " + satiety);
        } else {
            System.out.println(name + " сытость - " + satiety);
        }
    }

    public String getName() {
        return name;
    }

    public boolean getSatiety() {
        return satiety;
    }

    public int getHunger () {
        return hunger;
    }

    public boolean eat(Plate p) {
        if (hunger <= p.amountOfFood) {
            System.out.println(name + " поел.");
            p.amountOfFood -= hunger;
            hunger = 0;
            satiety = true;
            return true;
        } else {
        System.out.println(name + " не смог поесть.");
        satiety = false;
        return false;
        }
    }
}

