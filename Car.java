package Multiple_Inheritance;

//A class representing a car
public class Car implements Drivable{ 
    
    public void start(){

        System.out.println("Starting the Car.");
    }
    
    public void stop(){
        
        System.out.println("Stoping the Car.");
    }

    public void accelerate(double speed){
        
        System.out.println("Accelerating to "+speed+" km/h.");
    }

    public void brake(){
        
        System.out.println("Applying Brakes.");
    }

}
