public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;


    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);

        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }


    //We are creating a private method for dog only, because only the dog chews its food
    //NB: the chew method can only be accessed within this class, because it is a private method.
    private void chew(){
        System.out.println("Dog.chew() called");
    }

    //We are then overriding  the eat method from the animal class.
    //By overriding this eat method from the animal class, when we then write dog.eat() in the main class
    //we print the "dog.eat() is called", then the "dog.chew() is called " the lastly the super.eat() prints outs "animal.eat()"
    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }
    //We add two more public methods in the dog class, walk and move
    public void walk(){
        System.out.println("Dog.walk() called ");
        super.move(5); //Execute the move method from the class we are inheriting from , which is the animal class.

    }
    public void run(){
        System.out.println("Dog.run()called ");
        move(10);

    }
    //We create a new private method for Dog, because the dog moves with its legs.
    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called");
    }
    //To be able to access the movesLegs method, we have to override the move method from animal class
    //
    @Override
    public void move(int speed) {
        System.out.println("Dog. move() called ");
        moveLegs(speed);
        super.move(speed);

    }
}
