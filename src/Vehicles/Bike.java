package Vehicles;

public class Bike extends Vehicle {

    protected BikeType bike;

    public Bike(BikeType bike) {
        this.bike = bike;
    }
    @Override
    public String getDescription() {
        return String.format("Bicycle (%s): %d km/h", bike.name, (int)this.getMaximumVelocity());
    }

    @Override
    public double getMaximumVelocity() {
        double v = Math.cbrt(bike.a + Math.sqrt(Math.pow(bike.a, 2) + Math.pow(bike.b, 3)));
        v += Math.cbrt(bike.a - Math.sqrt(Math.pow(bike.a, 2) + Math.pow(bike.b, 3)));
        v -= (2.0/3) * (0.1/(bike.c*1.2));
        return v*KMH_PER_MPS;
    }
}
