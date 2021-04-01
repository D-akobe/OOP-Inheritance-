//We are to write two classes, the first circle and the second cylinder.
//The cylinder class will extend from the circle, so that we can first calculate the area of a cirlce.
//and next calculate the volume of the cylinder.

public class Cylinder extends Circle{

    private double height;


    public Cylinder(double radius, double height) {
        super(radius);
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }

    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return getArea()*height;
    }
}
