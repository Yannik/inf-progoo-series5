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
        //vehicles.add(
        for (Vehicle vehicle: vehicles) {
            println(vehicle.getDescription());
        }
        println("abc");
        println("abc");
        println("abc");
    }
}
