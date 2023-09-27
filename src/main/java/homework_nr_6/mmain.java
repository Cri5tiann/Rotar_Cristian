package homework_nr_6;

public class mmain {
    public static void main(String[] args) {
        Invoice i1 = new Invoice(
                "FGL",
                "Rotttouo",
                4,
                34.67);

        Date dataclass = new Date();

        dataclass.setDay(14);
        dataclass.setMonth(5);
        dataclass.setYear(2015);

        if (i1.getQuantity() < 0) {
            i1.quantity = 0;
        }

        if (i1.getPrice() < 0) {
            i1.price = 0.0;
        }


        i1.getAmount();
        dataclass.displayDate();
    }
}
