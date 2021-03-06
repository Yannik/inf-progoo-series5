package Vehicles;

public class RowingBoat extends Vehicle {
    private final String name;
    private final int rowers;
    private final double width;
    private final double draught;

    public RowingBoat(String name, int rowers, double width, double draught) {
        this.name = name;
        this.rowers = rowers;
        this.width = width;
        this.draught = draught;
        this.power = rowers * 100;
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
        return super.getMaximumVelocity(this.power, 1028, 0.5*width*draught, 0.3);
    }

}
