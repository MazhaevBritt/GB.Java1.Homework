package GB.Mazhaev;

public class Cat extends Animal {

    public Cat (String name) {
        super.name = name;
        super.typeAnimal = "Кот";
    }

    @Override
    public void setRunningDistance (int runningDistance) {
        if (runningDistance >= 0 && runningDistance <= 200) {
            super.runningDistance = runningDistance;
        } else {
            System.out.println("Коты могут пробегать не более 200 метров!");
        }
    }

    @Override
    public void setSwimmingDistance (int swimmingDistance) {
        if (swimmingDistance == 0) {
            super.swimmingDistance = swimmingDistance;
        } else {
            System.out.println("Коты не любят плавать!");
        }
    }

    @Override
    public void infoAnimal() {
        System.out.println(name + " - " + " бег: " + runningDistance + " / плаванье: не умеет");
    }

    @Override
    public void run(int distance) {
        if (runningDistance >= distance) {
            System.out.println(name + " пробежал дистанцию в " + distance + " метров.");
        } else {
            System.out.println(name + " не смог пробежать дистанцию в " + distance + " метров.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " утонул, так как не умеет плавать!");
    }

}
