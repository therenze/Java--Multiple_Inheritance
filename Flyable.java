package Multiple_Inheritance;

 //An interface representing a flyable vehicle.
public interface Flyable {

    void start();
    void takeOff(); //Performs the take-off action.
    void accelerate(double speed);
    void land(); //Performs the landing action.
    void stop();

}
