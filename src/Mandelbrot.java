import acm.graphics.GRect;
import acm.program.GraphicsProgram;

import java.awt.*;

public class Mandelbrot extends GraphicsProgram {

    public void run() {
        int sidelength = readInt("Sidelength: ");
        int columns = readInt("Width: ");
        int rows = readInt("Height: ");

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                ComplexNumber cn = getComplexNumber(row, column, rows, columns);
                GRect square = new GRect(sidelength, sidelength);
                square.setFilled(true);
                if (inMandelbrotSet(cn)) {
                    square.setColor(new Color(240, 240, 240));
                    square.setFillColor(new Color(240, 240, 240));
                } else {
                    square.setColor(new Color(255, 255, 255));
                    square.setFillColor(new Color(255, 255, 255));
                }
                add(square, sidelength*column, sidelength*row);
            }
        }

    }

    public ComplexNumber getComplexNumber(int row, int column, int rows, int columns) {
        // use double here, or this division will be integer-based and therefore faulty
        return new ComplexNumber(3.0*column / columns - 2.0, 2.0*row/rows - 1.0);
    }

    public boolean inMandelbrotSet(ComplexNumber cn) {
        ComplexNumber sequence = new ComplexNumber();
        for (int i = 0; i < 400; i++) {
            if (sequence.abs() > 2) {
                return false;
            }
            sequence = sequence.multiply(sequence).add(cn);
        }
        return true;
    }
}
