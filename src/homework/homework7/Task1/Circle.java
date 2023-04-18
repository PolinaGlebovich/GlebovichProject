package homework.homework7.Task1;

public class Circle extends Figure{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public int getPerimeter() {
        return (int) (2 * Math.PI * radius);
    }

    @Override
    public int getSquare() {
        return (int) (Math.PI * (radius * radius));
    }
}
