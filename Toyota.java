public class Toyota extends Car {

    private int roadServiceMonths;

    //It is assumed that we already know some of the characteristics of this toyota car, for example
    //its name,the number of wheels , number of doors, number of gears and whether it is manual or not.
    public Toyota(int roadServiceMonths) {
        super("Toyota", "4WD", 5, 5, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0) {
            stop();
            changeGear(1);
        } else if (newVelocity > 0 && newVelocity <= 10) {
            changeGear(1);
        } else if (newVelocity > 10 && newVelocity <= 20) {
            changeGear(2);
        } else if (newVelocity > 20 && newVelocity <= 30) {
            changeGear(2);
        } else {
            changeGear(4);
        }

        if(newVelocity > 0){
            changeVelocity(newVelocity , getCurrentDirection());
        }



    }

}


