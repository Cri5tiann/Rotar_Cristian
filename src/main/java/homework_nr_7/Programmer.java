package homework_nr_7;

public class Programmer extends Employee {
    String programmingLanguage;
    int yearsOfExperience;

    public Programmer(String programmingLanguage, int yearsOfExperience) {
        this.programmingLanguage = programmingLanguage;
        this.yearsOfExperience = yearsOfExperience;

    }

    @Override
    public void work() {
        System.out.println("The progammer is writing the code in: " + programmingLanguage);
    }
}
