package homewok_nr_13;

import org.w3c.dom.ranges.RangeException;

public class Main {
    public static void main(String[] args) throws AirplaneException, InvalidRangeException {

        Airplane a1 = createAirplaneLBYL("Boeing", "", 4);
        Airplane a2 = createAirplaneLBYL("Boeing", "dbt", 4);
        Airplane a3 = createAirplaneEAFP("Airbus", "edtb", 2);

        System.out.println(a3.model);
        System.out.println(a1.model);

        countDivisibleBy7Numbers(10, 70);

    }

    public static Airplane createAirplaneLBYL(String manufacturer, String model, int nrOfEngines) throws AirplaneException {
        if(manufacturer == null || manufacturer.isEmpty() || model == null || model.isEmpty() || nrOfEngines <=0 || nrOfEngines % 2 !=0 )
            throw new AirplaneException("wrong elements");
        else {
            return new Airplane(manufacturer, model, nrOfEngines);
        }
    }

    public static Airplane createAirplaneEAFP(String manufacturer, String model, int nrOfEngines) throws AirplaneException {
        try {
            new Airplane(manufacturer, model, nrOfEngines);
        } catch (AirplaneException e){
            throw e;
        }


        return new Airplane(manufacturer, model, nrOfEngines);
    }




    public static void countDivisibleBy7Numbers(int inferiorLimit, int superiorLimit) throws InvalidRangeException {
        if (inferiorLimit > superiorLimit){
            throw new InvalidRangeException("Inferior limit is bigger than superior");
        }
        int divisibleNumbers = 0;
        for(int index = inferiorLimit; index != superiorLimit; index ++){
            if(index % 7 == 0) {
                divisibleNumbers += 1;
                System.out.print(" " + index);
            }
        }
        System.out.println(" " + divisibleNumbers + " numbers divide exactly to 7");
    }
}
