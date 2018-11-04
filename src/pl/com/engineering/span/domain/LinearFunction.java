package pl.com.engineering.span.domain;

public class LinearFunction {

    private double slope;
    private double intercept;

    public LinearFunction(double slope, double intercept) {
        this.slope = slope;
        this.intercept = intercept;
    }

    public LinearFunction() {
    }

    public double getSlope() {
        return slope;
    }

    public void setSlope(double slope) {
        this.slope = slope;
    }

    public double getIntercept() {
        return intercept;
    }

    public void setIntercept(double intercept) {
        this.intercept = intercept;
    }
}
