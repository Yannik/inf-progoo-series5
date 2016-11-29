public class Ship extends Vehicle {

    private final String name;
    private final int ps;
    private final int waterDisplacement;
    private final int length;
    private static final double KMH_PER_KNOT = 1.85;

    public Ship(String name, int ps, int waterDisplacement, int length) {
        this.name = name;
        this.ps = ps;
        this.power = (int)(ps * this.WATTS_PER_PS);
        this.waterDisplacement = waterDisplacement;
        this.length = length;
    }
    @Override
    public String getDescription() {
        return String.format("%s (%d PS, %,dm³, %,dm): %dkm/h (%dkts)",
                name,
                ps,
                waterDisplacement,
                length,
                (int)this.getMaximumVelocity(),
                (int)(this.getMaximumVelocity() / KMH_PER_KNOT));
    }

    @Override
    public double getMaximumVelocity() {
        return Math.cbrt(2*power/(1028*(waterDisplacement/length)*0.3))*KMH_PER_MPS;
    }

}
