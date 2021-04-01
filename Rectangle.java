//The swimming Company has asked for an application that calculates the volume of cuboid shaped pools.
//To do this, we use two classes rectangle and cuboid, and we extend from the rectangle class in the cuboid class.

public class Rectangle {

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        if(width < 0 ) {
            this.width = 0;
        }

        if(length < 0) {
            this.length = 0;
        }

        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea(){
        return width * length;
    }
}
