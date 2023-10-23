package homework_nr_12;

public class Main {
    public static void main(String[] args) {

        Months[] allMonths = Months.values();

        for (Months element:
                allMonths) {
            System.out.println(element);
        }

        System.out.println(FuelTypes.GASOLINE.isLiquidFuel());
        System.out.println(FuelTypes.LPG.isLiquidFuel());


        int x = 4;
        int y = -12;
        System.out.println("----------------------------");
        CheckingSomething(x, CheckInteger.CHECK_IF_EVEN);
        CheckingSomething(y, CheckInteger.CHECK_IF_NEGATIVE);
        CheckingSomething(x, CheckInteger.CHECK_IF_ODD);


    }

    public static boolean CheckingSomething(int x, CheckInteger checkType) {
        System.out.println(checkType.getCheckFunction().test(x));
        return false;
    }

}
