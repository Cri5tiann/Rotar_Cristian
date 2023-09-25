package homework_nr_7;

public class Manager extends Employee {
    int teamSize;
    String teamName;

    public Manager(int teamSize, String teamName) {
        this.teamSize = teamSize;
        this.teamName = teamName;
    }

    @Override
    public void work() {
        System.out.println("The manager is working for: " + teamName);
    }

}
