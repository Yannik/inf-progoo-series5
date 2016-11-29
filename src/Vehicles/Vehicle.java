package Vehicles;

public abstract class Vehicle {
    protected int power;
    protected String name;
    protected final static double WATTS_PER_PS = 735.49875;
    protected final static double KMH_PER_MPS = 3.6;
    protected static final double KMH_PER_KNOT = 1.85;
    public abstract String getDescription();
    public abstract double getMaximumVelocity();
}
