package a_Zadania.a_Dzien_2.a_Dziedziczenie;


public class Circle extends Shape {

    private float radius;

    public Circle(float x, float y, String color, float radius) {
        super(x, y, color);
        this.radius = radius;
    }

    @Override
    public String getDescription() {
        return "circle placed in " + super.getX() + " " + super.getY() + " with color " + super.getColor() + " and radius " + radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircuit() {
        return 2 * Math.PI * radius;
    }

}
