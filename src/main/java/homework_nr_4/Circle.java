package homework_nr_4;

public class Circle {
    public static void main(String[] args) {
        Circle area = new Circle(5);
        System.out.println(area);
    }

    double radius;

    public Circle(double radius){
        this.radius = radius;
        System.out.println("result is:" + 3.14 * (radius * radius));
    }

}
