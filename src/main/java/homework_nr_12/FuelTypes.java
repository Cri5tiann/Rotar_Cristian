package homework_nr_12;

public enum FuelTypes {

    GASOLINE,
    LPG,
    ELECTRIC,
    PETROL,
    CNG;

    public boolean isLiquidFuel(){
        if(this == GASOLINE || this == PETROL)
            return true;
        return false;
    }
}
