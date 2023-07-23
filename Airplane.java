package Multiple_Inheritance;

//A class representing an airplane.
public class Airplane implements Flyable{ 

    public void start(){
        System.out.println("Starting the Plane.");
    }
    public void takeOff(){
        System.out.println("Performing Taking off.");
    }
    public void accelerate(double speed){
        System.out.println("Accelerating to "+speed+" km/h.");
    }
    public void land(){
        System.out.println("Performing Landing.");
    }
    public void stop(){
        System.out.println("Stoping the Plane.");
    }

}

