//We are creating another class Fish that will also inherit from the animal class.

public class Fish extends Animal {

    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight) {
        super(name, 1, 1, size, weight);

        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest(){

    }
    private void moveMuscles(){

    }
    private void moveBackFin(){

    }
    //We have created a private class for the fish to move, since it moves with its muscles and BackFins.
    //We have also called the super.move which calls the move method in the animal class.
    private void swim(int speed){
        moveMuscles();
        moveBackFin();
        super.move(speed);

    }

}
