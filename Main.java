public class Main {

    public static void main(String[] args) {
	// Inheritance, to demonstrate this, we create two classes dog and animal, then we call the animal class in the dog class,
        //by using the extends keyword.
        //Note that the dog is an animal also, but inheritance will enable us add extra methods that are unique for a dog only
        //and not all animals, while also keeping the initial fields inherited from the animal class

        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("yorkie ",8, 20, 2, 4, 1, 20, "Long silky");
        //The beauty of inheritance is that we can use of of the declared methods eat and move with the Dog class
        //since the dog class inherited from the animal class, we can use those methods which are declared in the animal class.

        dog.eat();
        // dog.walk();
        dog.run();

        //The main class code for the vehicle challenge

        Toyota toyota = new Toyota(36);
        toyota.steer(45);
        toyota.accelerate(30);
        toyota.accelerate(20);
        toyota.accelerate(-42);

        //Main class for the Circle challenge
        Circle circle = new Circle(3.75);
        System.out.println("circle radius  = " + circle.getRadius());
        System.out.println("circle area = " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder radius = " + cylinder.getRadius());
        System.out.println("cylinder height = " + cylinder.getHeight());
        System.out.println("cylinder area = " + cylinder.getArea());
        System.out.println("cylinder volume " + cylinder.getVolume());

        //Main class for the Rectangle and Cuboid challenge
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle width = " + rectangle.getWidth());
        System.out.println("rectangle length = " + rectangle.getLength());
        System.out.println("rectangle area = " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(5, 10, 5);
        System.out.println(" cuboid width " + cuboid.getWidth());
        System.out.println("cuboid length " + cuboid.getLength());
        System.out.println(" cuboid area  = " + cuboid.getArea());
        System.out.println("cuboid height " + cuboid.getHeight());
        System.out.println("cuboid volume " + cuboid.getVolume());

    }
}
