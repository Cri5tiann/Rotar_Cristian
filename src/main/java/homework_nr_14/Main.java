package homework_nr_14;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Airplane> airplaneList = new ArrayList<>();
        List<Helicopter> helicopterList = new ArrayList<>();

        Airplane a1 = new Airplane();
        Airplane a2 = new Airplane();
        Helicopter h1 = new Helicopter();
        Helicopter h2 = new Helicopter();

        printVehiclesAbleToFly(airplaneList);
        printVehiclesAbleToFly(helicopterList);

    }

    public static <T extends Vehicle & AirVehicle> void printVehiclesAbleToFly(List<T> inputList){
        for (T element:
                inputList) {
            System.out.println(element);
        }
    }

    public static void addFlyableObjectsToList(List<? super Vehicle> inputlist){

    }
}
