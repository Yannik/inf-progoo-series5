import acm.graphics.GOval;
import acm.graphics.GPoint;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.*;
import java.util.Random;

public class PiApproximator extends GraphicsProgram {


    public void run() {
        int sidelength = 400;
        int points = 10000;
        setSize(sidelength, sidelength);
        GRect box = new GRect(sidelength, sidelength);

        add(box, 0, 0);
        int inCircle = 0;
        for (int i = 0; i < points; i++) {
            GPoint randomPoint = randomPoint();
            GOval oval = new GOval(1, 1);
            oval.setFilled(true);
            if (isInCircle(randomPoint)) {
                oval.setFillColor(new Color(0, 0, 255));
                oval.setColor(new Color(0, 0, 255));
                inCircle++;
            }
            add(oval, sidelength / 2 * randomPoint.getX() + sidelength / 2, sidelength / 2 * randomPoint.getY() + sidelength / 2);
        }
        println(inCircle / (double) points * 4);
    }

    /**
     * Randomly generates a new point whose x and y coordinates lie between -1
     * and 1.
     *
     * @return random point.
     */
    public GPoint randomPoint() {
        Random r = new Random();
        double x = -1.0 + (1.0 - -1.0) * r.nextDouble();
        double y = -1.0 + (1.0 - -1.0) * r.nextDouble();
        return new GPoint(x, y);
    }


    /**
     * Checks if the point with the given coordinates is inside the circle with
     * radius 1 centered at the coordinate system's origin.
     *
     * @param unitPoint
     *            the point to check.
     * @return {@code true} if the point is inside the circle, {@code false} if
     *         it's not.
     */
    public boolean isInCircle(GPoint unitPoint) {
        return (Math.pow(unitPoint.getX(), 2) + Math.pow(unitPoint.getY(), 2)) < 1;
    }

}
