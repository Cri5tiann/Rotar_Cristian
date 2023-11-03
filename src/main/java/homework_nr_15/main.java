package homework_nr_15;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class main {
    public static void main(String[] args) {

//        Создайте HashSet автомобилей, которые будут
//        отсортированы по убыванию по году выпуска.

        HashSet<Car> carHashSet = new HashSet<>();

        carHashSet.add(new Car(2020, "Toyota"));
        carHashSet.add(new Car(2007, "Subaru"));
        carHashSet.add(new Car(2012, "Wolkswagen"));
        carHashSet.add(new Car(1997, "Mercedes"));

        System.out.println("Simply sorted HashSet-------------------");
        carHashSet.stream()
                .sorted()
                .forEach(e -> System.out.println(e.toString()));


//        Создайте TreeSet автомобилей, который будет
//        сортировать автомобили с помощью компаратора.

        TreeSet<Car> carTreeSet = new TreeSet<>();

        carTreeSet.add(new Car(2004, "Suzuki"));
        carTreeSet.add(new Car(2014, "Opel"));
        carTreeSet.add(new Car(2007, "Ford"));
        carTreeSet.add(new Car(2010, "Audi"));
        carTreeSet.add(new Car(2001, "Skoda"));

        Comparator<Car> comparingByYear = Comparator.comparing((Car c) -> c.yearMade);

        System.out.println("Sorted TreeSet using comparator-----------");
        carTreeSet.stream()
                .sorted(comparingByYear)
                .forEach(e -> System.out.println(e.toString()));


    }

}
