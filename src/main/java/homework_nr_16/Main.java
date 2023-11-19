package homework_nr_16;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        List<Person> people = new ArrayList<>();
        File inputFile = new File("src/main/java/homework_nr_16/input.txt");
        processDataFromFile(inputFile);

    };


    private static List<Person> processDataFromFile(File inputtxt) throws IOException {
        List<Person> people = new ArrayList<>();
        Double averageScore = 0.0;
        Integer minAge = 100;
        Integer maxAge = 1;
        String maxAgeName = null;
        String minAgeName = null;
        try (BufferedReader inputReader = new BufferedReader(new FileReader(inputtxt))) {
            people = new ArrayList<>();
            String line;
            while ((line = inputReader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String name = parts[0];
                    int age = Integer.parseInt(parts[1]);
                    double score = Double.parseDouble(parts[2]);
                    people.add(new Person(name, age, score));
                }
            }
            inputReader.close();
//            Считайте данные из входного файла с именем “input.txt”.
            for (Person person : people) {
                System.out.println("Name: " + person.name + ", Age: " + person.age + ", Grade: " + person.score);
            }
            for(Person person: people) {
                averageScore += person.score;
            }
            averageScore = averageScore / people.size();
            int n = 0;
            for (Person person : people) {
                if(maxAge < person.age | minAge > person.age) {
                    if (minAge > person.age){
                        minAge = person.age;
                        minAgeName = person.name;
                    }

                    if (maxAge < person.age) {
                        maxAge = person.age;
                        maxAgeName = person.name;
                    }
                }
            }
                File outputFile = new File("src/main/java/homework_nr_16/output.txt");
                FileWriter output = new FileWriter(outputFile);
                output.write("Средний балл: " + averageScore + "\n");
                output.write("Самый молодой человек: " + minAgeName + " (Возраст: " + minAge + ") \n");
                output.write("Самый старший человек: " + maxAgeName + " (Возраст: "+ maxAge + ") \n");
                output.close();
        }catch(IOException ignored){
            System.out.println("An error occured");
        }
        return people;
    }
}
