package hw7.Task1;

public class Rectangle extends Figure {
    private int sideOne;
    private int sideTwo;

    public Rectangle(int sideOne, int sideTwo) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    public int getSideOne() {
        return sideOne;
    }

    public void setSideOne(int sideOne) {
        this.sideOne = sideOne;
    }

    public int getSideTwo() {
        return sideTwo;
    }

    public void setSideTwo(int sideTwo) {
        this.sideTwo = sideTwo;
    }

    @Override
    public int getPerimeter(){
        return sideOne + sideOne + sideTwo + sideTwo;
    }

    @Override
    public int getSquare(){
        return sideOne * sideTwo;
    }


}
