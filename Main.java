package Multiple_Inheritance;

//Contains the main method to 
// demonstrate the functionality of the vehicles.
public class Main {
    public static void main(String[] args) {
        
        //ABSTRACT IDEA/SYNTAX WILL GO ERROR EX.
        // Drivable c = new Drivable();
        // because "interface" is full abstract

        Car c = new Car();
        Airplane p = new Airplane();

        System.out.println("\n====CAR=====");
        c.start();
        c.accelerate(60);
        c.brake();
        c.stop();

        System.out.println("\n====PLANE=====");

        p.start();
        p.takeOff();
        p.accelerate(500);
        p.land();
        p.stop();

    }
}
