package pl.com.engineering.span.domain;

import java.util.List;

public class Span {

    private Double firstPylonHeight;
    private Double firstPylonDepth;
    private Double secondPylonHeight;
    private Double secondPylonDepth;
    private Double nextPylonDistance;
    private Double firstPylonCoordination;
    private Double secondPylonCoordination;
    private Double x1;
    private List<PointCoordinations> obstaclesCoordinations;

    public List<PointCoordinations> getObstaclesCoordinations() {
        return obstaclesCoordinations;
    }

    public void setObstaclesCoordinations(List<PointCoordinations> obstaclesCoordinations) {
        this.obstaclesCoordinations = obstaclesCoordinations;
    }

    public Double getFirstPylonCoordination() {
        return firstPylonCoordination;
    }

    public void setFirstPylonCoordination(Double firstPylonCoordination) {
        this.firstPylonCoordination = firstPylonCoordination;
    }

    public Double getSecondPylonCoordination() {
        return secondPylonCoordination;
    }

    public void setSecondPylonCoordination(Double secondPylonCoordination) {
        this.secondPylonCoordination = secondPylonCoordination;
    }

    public Double getFirstPylonHeight() {
        return firstPylonHeight;
    }

    public void setFirstPylonHeight(Double firstPylonHeight) {
        this.firstPylonHeight = firstPylonHeight;
    }

    public Double getFirstPylonDepth() {
        return firstPylonDepth;
    }

    public void setFirstPylonDepth(Double firstPylonDepth) {
        this.firstPylonDepth = firstPylonDepth;
    }

    public Double getSecondPylonHeight() {
        return secondPylonHeight;
    }

    public void setSecondPylonHeight(Double secondPylonHeight) {
        this.secondPylonHeight = secondPylonHeight;
    }

    public Double getSecondPylonDepth() {
        return secondPylonDepth;
    }

    public void setSecondPylonDepth(Double secondPylonDepth) {
        this.secondPylonDepth = secondPylonDepth;
    }

    public Double getNextPylonDistance() {
        return nextPylonDistance;
    }

    public void setNextPylonDistance(Double nextPylonDistance) {
        this.nextPylonDistance = nextPylonDistance;
    }

    public Double getX1() {
        return x1;
    }

    public void setX1(Double x1) {
        this.x1 = x1;
    }
}
