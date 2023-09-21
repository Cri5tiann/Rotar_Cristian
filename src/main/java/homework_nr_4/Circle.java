package homework_nr_4;

public class Circle {

    public static void main(String[] args) {
        Circle area = new Circle(8);
    }
    float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return radius * radius * 3.1415;
    }

}
