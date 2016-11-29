package Velocity;

public class RowingBoat extends Vehicle {
    private final String name;
    private final int rowers;
    private final double width;
    private final double draught;
    private static final double KMH_PER_KNOT = 1.85;

    public RowingBoat(String name, int rowers, double width, double draught) {

        this.name = name;
        this.rowers = rowers;
        this.width = width;
        this.draught = draught;
    }

    @Override
    public String getDescription() {
        return String.format("%s (%d rowers, b = %.1fm, h = %.1fm ): %dkm/h (%dkts)",
                this.name,
                this.rowers,
                this.width,
                this.draught,
                (int)this.getMaximumVelocity(),
                (int)(this.getMaximumVelocity()/KMH_PER_KNOT));
    }

    @Override
    public double getMaximumVelocity() {
        return Math.cbrt((2*100*rowers)/(1028*(1.0/2)*width*draught*0.3))*KMH_PER_MPS;
    }
}
