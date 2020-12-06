package GB.Mazhaev;

public class Plate {

    protected int amountOfFood;
    protected int maxAmountOfFood;

    public Plate (int amountOfFood) {
        this.amountOfFood = amountOfFood;
        this.maxAmountOfFood = amountOfFood;
    }

    public void getInfoPlate () {
        System.out.println("В тарелке - " + amountOfFood + " еды.");
        System.out.println("-----------------------------------");
    }

    public void fillingThePlate() {
        amountOfFood = maxAmountOfFood;
        System.out.println("Добавленна еда в тарелку.");
        System.out.println("-----------------------------------");
    }
}
