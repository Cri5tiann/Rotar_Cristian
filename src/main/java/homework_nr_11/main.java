package homework_nr_11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {

        Person p1=new Person("Florea","Andrei",25,true);
        Person p2=new Person("Anairei","Valeriu",40,true);
        Person p3=new Person("Ciobanu","Miruna",32,false);
        Person p4=new Person("Afanasii", "Andreea", 46, true);
        Person p5=new Person("Buzmac", "Vitalii", 23, true);
        Person p6=new Person("Corobcea", "Miruna", 28, false);
        Person p7=new Person("Arcu", "Eduard", 51, true);
        Person p8=new Person("Vasilescu", "viorel", 33, false);
        Person p9=new Person("Severin", "Marina", 29, true);
        Person p10=new Person("Dobos", "Valetin", 40, true);
        List<Person> personList = new ArrayList<>(
                Arrays.asList(
                        p1, p2, p3, p4, p5, p6, p7, p8, p9, p10
                )
        );


        personList.stream()
                .filter(per -> per.age > 25 && per.PaidByHour)
                .distinct()
                .limit(5)
                .forEach(per -> System.out.println(per.name + " " + per.surname));


        List<Person> personOver30WithLetterAInNAme = personList.stream()
                .filter(per -> per.age > 30 && per.name.startsWith("A"))
                .collect(Collectors.toList());


        Optional<Person> person37YearsOld = personList.stream()
                .filter(per -> per.age > 37)
                .findFirst();

        if(person37YearsOld.isPresent()){
            System.out.println("The first person who is 37 years old is: " + person37YearsOld.get().name + person37YearsOld.get().surname);
        }
    }
}
