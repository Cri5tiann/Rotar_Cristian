package homewok_nr_13;

public class Airplane {

    String manufacturer;
    String model;
    int nrOfEngines;


    public Airplane(String manufacturer, String model, int nrOfEngines) throws AirplaneException {
        if (manufacturer == null || manufacturer.isEmpty())
            throw new InvalidManufacturerException("Manufacturer can't be null or empty");
        this.manufacturer = manufacturer;

        if (model == null || model.isEmpty())
            throw new InvalidModelException("Model can't be null or empty");
        this.model = model;

        if (nrOfEngines <= 0 || nrOfEngines % 2 != 0)
            throw new InvalidNrOfEnginesException("Number can't be 0 or odd");
        this.nrOfEngines = nrOfEngines;
    }
}