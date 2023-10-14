package homework_nr_9;

public class Elephant extends Herbivor implements Animal{

    @Override
    public void Moving() {
        System.out.println("The elephant is moving");
    }

    @Override
    public void Sleeping() {
        System.out.println("The elephant is sleeping");
    }

    @Override
    public void Eating() {
        System.out.println("The elephant is eating");
    }

    @Override
    public void Existing() {
        System.out.println("The elephant is simply existing");
    }

    @Override
    public void Reproducting() {
        super.Reproducting();
    }
}


