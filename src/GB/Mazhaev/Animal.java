package GB.Mazhaev;

public abstract class Animal {

    String name;
    int runningDistance;
    int swimmingDistance;
    String typeAnimal;

    public abstract void run (int canRun);
    public abstract void swim (int canSwim);
    public abstract void infoAnimal ();
    public abstract void setRunningDistance (int runningDistance);
    public abstract void setSwimmingDistance (int swimmingDistance);
}
