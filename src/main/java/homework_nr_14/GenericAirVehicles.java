package homework_nr_14;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class GenericAirVehicles<T extends Vehicle & Serializable> {

    List<T> airVehicleList;

    public GenericAirVehicles() {
        this.airVehicleList = new ArrayList<>();
    }


}
