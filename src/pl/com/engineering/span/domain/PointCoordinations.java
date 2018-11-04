package pl.com.engineering.span.domain;

public class PointCoordinations {

    private Double X;
    private Double Y;

    public PointCoordinations(Double x, Double y) {
        X = x;
        Y = y;
    }

    public PointCoordinations() {
    }

    public Double getX() {
        return X;
    }

    public void setX(Double x) {
        X = x;
    }

    public Double getY() {
        return Y;
    }

    public void setY(Double y) {
        Y = y;
    }

    @Override
    public String toString() {
        return "PointCoordinations{" +
                "X=" + X +
                ", Y=" + Y +
                '}';
    }
}
