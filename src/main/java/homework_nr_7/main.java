package homework_nr_7;

public class main {
    public static void main(String[] args) {
        Manager m1 = new Manager(6, "Libert");
        Programmer p1 = new Programmer("Pascal", 3);

//        Создайте массив типа Person и добавьте туда все созданные обьекты
        Employee[] employees = {m1, p1};

        m1.work();
        p1.work();


//        Используя instanceof пройдитесь по всему массиву фильтруя Manager,
//        и вызовите метод work() у этих обьектов:
        for (int i = 0; i != 2; i++) {
            if (employees[i] instanceof Manager) {
                employees[i].work();
            }
        }
    }
}
