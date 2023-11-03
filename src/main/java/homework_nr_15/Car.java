package homework_nr_15;

import java.util.Comparator;;

//Создайте класс Car, который будет расширять Comparable
// и будет иметь параметры: yearMade, name

public class Car implements Comparable<Car>{

      Integer yearMade;
      String name;

    public Car(Integer yearMade, String name) {
        this.yearMade = yearMade;
        this.name = name;
    }

    @Override
    public int compareTo(Car car) {
        return Integer.compare(car.yearMade, this.yearMade);
    }


    @Override
    public String toString() {
        return "Car{ " +
                "yearMade= " + yearMade +
                ", name= '" + name + '\'' +
                '}';
    }
}
