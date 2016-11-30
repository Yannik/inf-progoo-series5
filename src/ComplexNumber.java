public class ComplexNumber {

    /**
     * real part of the ComplexNumber
     */
    private final double re;


    /**
     * imaginary part of the ComplexNumber
     */
    private final double im;

    /**
     * initializes the real and imaginary parts with 0
     */
    public ComplexNumber() {
        re = 0;
        im = 0;
    }

    /**
     * initializes the real and imaginary part with the given values
     *
     * @param real real part of the ComplexNumber
     * @param imaginary imaginary part of the ComplexNumber
     */
    public ComplexNumber(double real, double imaginary) {
        re = real;
        im = imaginary;
    }

    /**
     * initializes the real and imaginary parts with the values from the given complex number
     *
     * @param cn use values from this ComplexNumber
     */
    public ComplexNumber(ComplexNumber cn) {
        re = cn.getReal();
        im = cn.getImaginary();
    }

    /**
     * @return real part of the ComplexNumber
     */
    public double getReal() {
        return this.re;
    }

    /**
     * @return imaginary part of the ComplexNumber
     */
    public double getImaginary() {
        return this.im;
    }

    /**
     * @return a new complex number which is the conjugate of the one the methods was called on
     */
    public ComplexNumber conjugate() {
        return new ComplexNumber(re, -1 * im);
    }

    /**
     * @param other the other complex number
     * @return a new complex number which is the sum of the two
     */
    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(other.getReal() + this.re, other.getImaginary() + this.im);
    }

    /**
     * @param other the ComplexNumber to be subtracted
     * @return a new complex number which is the result of subtracting other from the current complex number
     */
    public ComplexNumber subtract(ComplexNumber other) {
        return new ComplexNumber(this.re - other.getReal(), this.im - other.getImaginary());
    }

    /**
     * @param other the ComplexNumber to be multiplied
     * @return a new complex number which is the product of the two
     */
    public ComplexNumber multiply(ComplexNumber other) {
        double re = this.re * other.getReal() - this.im * other.getImaginary();
        double im = this.im * other.getReal() + this.re * other.getImaginary();
        return new ComplexNumber(re, im);
    }

    /**
     * @param other the denominator
     * @return null if the real and imaginary part of other is 0. Otherwise,
     *         it returns a new complex number which is the result of dividing
     *         the current complex number by the other one
     */
    public ComplexNumber divide(ComplexNumber other) {
        if (other.getReal() == 0 && other.getImaginary() == 0) {
            return null;
        }

        double re = (
                (this.re * other.re + this.im * other.getImaginary()) /
                (Math.pow(other.getReal(), 2) + Math.pow(other.getImaginary(), 2))
        );
        double im = (
                (this.im * other.getReal() - this.re * other.getImaginary()) /
                (Math.pow(other.getReal(), 2) + Math.pow(other.getImaginary(), 2))
                );
        return new ComplexNumber(re, im);
    }

    /**
     * the absolute value of the complex number
     *
     * @return the absolute value of the complex number
     */
    public double abs() {
        return Math.sqrt(Math.pow(this.re, 2) + Math.pow(this.im, 2));
    }

    /**
     * string representation of the ComplexNumber
     *
     * @return string representation of the ComplexNumber
     */
    public String toString() {
        return this.getReal() + " + " + this.getImaginary();
    }
}
