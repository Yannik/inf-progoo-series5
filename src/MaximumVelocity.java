import Velocity.*;
import acm.program.ConsoleProgram;

import java.util.ArrayList;


public class MaximumVelocity extends ConsoleProgram {

    public void run() {
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(new Car("VW Polo", 45));
        vehicles.add(new Car("Porsche 911", 218));
        vehicles.add(new Car("Lamborghini Countach", 454));
        vehicles.add(new Ship("HMS Titanic", 51000, 45000, 269));
        vehicles.add(new Ship("USS Nimitz", 280000, 80000, 332));
        vehicles.add(new RowingBoat("Greek Trireme", 170, 6.1, 0.9));
        vehicles.add(new Bike(Bikes.TOPS));
        vehicles.add(new Bike(Bikes.DROPS));
        vehicles.add(new Bike(Bikes.ROADSTER));
        //vehicles.add(
        for (Vehicle vehicle: vehicles) {
            println(vehicle.getDescription());
        }
    }
}
