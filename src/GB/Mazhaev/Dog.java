package GB.Mazhaev;

public class Dog extends Animal {

    public Dog (String name) {
        super.name = name;
        super.typeAnimal = "Собака";
    }

    @Override
    public void setRunningDistance(int runningDistance) {
        if (runningDistance >= 0 && runningDistance <= 500) {
            super.runningDistance = runningDistance;
        } else {
            System.out.println("Собаки могут пробегать не более 500 метров!");
        }
    }

    @Override
    public void setSwimmingDistance(int swimmingDistance) {
        if (swimmingDistance >= 0 && swimmingDistance <= 10) {
            super.swimmingDistance = swimmingDistance;
        } else {
            System.out.println("Собаки могут проплывать не более 10 метров!");
        }
    }

    @Override
    public void infoAnimal() {
        System.out.println(name + " - " + " бег: " + runningDistance + " / плаванье: " + swimmingDistance);
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
        if (swimmingDistance >= distance) {
            System.out.println(name + " проплыл дистанцию в " + distance + " метров.");
        } else {
            System.out.println(name + " не проплыл дистанцию в " + distance + " метров.");
        }
    }

}
