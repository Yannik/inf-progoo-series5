package Velocity;

public class Car extends Vehicle {

    protected int ps;

    public Car(String name, int ps) {
        this.name = name;
        this.ps = ps;
        this.power = (int)(ps * WATTS_PER_PS);
    }

    @Override
    public double getMaximumVelocity() {
        return Math.cbrt(2*power/(1.3*2.5*0.35)) * KMH_PER_MPS;
    }

    @Override
    public String getDescription() {
        return String.format("%s (%d PS): %d km/h", name, ps, (int)this.getMaximumVelocity());
    }

}
