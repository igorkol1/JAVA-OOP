package a_Zadania.a_Dzien_2.a_Dziedziczenie;


public class Shape {

    private float x, y;
    private String color;

    public Shape(float x, float y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    protected String getDescription() {
        return "Sharp placed in " + x + " " + y + " with color " + color;
    }

    protected double getDistance(Shape shape) {
        double tempA = Math.pow(this.x - shape.x, 2);
        double tempB = Math.pow(this.y - shape.y, 2);
        return Math.sqrt(tempA + tempB);
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
