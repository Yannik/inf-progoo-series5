package Velocity;

public enum  Bikes {

    TOPS("Hands on the tops", 277.376, 3.078, 0.4891),
    DROPS("Hands on the drops", 399.611, 4.4226, 0.3397),
    ROADSTER("Roadster", 181.0455, 3.3899, 0.7457);

    public final String name;
    public final double a, b, c;

    Bikes(String name, double a, double b, double c) {

        this.name = name;
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
