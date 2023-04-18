package hw7.Task1;


public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(2,5,6);
        System.out.println("Perimeter of Triangle: "+ triangle.getPerimeter());
        System.out.println("Square of Triangle: " + triangle.getSquare());
        Rectangle rectangle = new Rectangle(2,4);
        System.out.println("Perimeter of Rectangle: " + rectangle.getPerimeter());
        System.out.println("Square of Rectangle: " + rectangle.getSquare());
        Circle circle = new Circle(12);
        System.out.println("Perimeter of Circle: " + circle.getPerimeter());
        System.out.println("Square of Circle: " + circle.getSquare());

        Figure [] allFigures = getSumOfPerimeters();
        int sum = 0;
            for(Figure figure: allFigures){
                figure.getPerimeter();
                sum = sum + figure.getPerimeter();
            }
        System.out.println("Sum of perimeters: " + sum);
    }
        private static Figure[] getSumOfPerimeters() {
            Figure[] allFigures = new Figure[5];
            allFigures [0] = new Triangle(2,5,6);
            allFigures [1] = new Rectangle(2,4);
            allFigures[2] = new Circle(12);
            allFigures[3] = new Circle(4);
            allFigures[4] = new Rectangle(4,5);
            return allFigures;
        }

}

