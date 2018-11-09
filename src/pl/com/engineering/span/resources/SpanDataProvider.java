package pl.com.engineering.span.resources;

import pl.com.engineering.span.domain.PointCoordinations;
import pl.com.engineering.span.domain.Span;

import java.util.ArrayList;
import java.util.List;

public class SpanDataProvider {

    public static List<Span> provideData() {

        Span firstSpan = new Span();
        firstSpan.setFirstPylonHeight(320d);
        firstSpan.setFirstPylonCoordination(0d);

        firstSpan.setSecondPylonHeight(450d);
        firstSpan.setSecondPylonCoordination(45d);
        firstSpan.setNextPylonDistance(530d);
        firstSpan.setX1(210d);

        List<PointCoordinations> firstObstaclesCoordination = new ArrayList<PointCoordinations>();
        firstObstaclesCoordination.add(new PointCoordinations(120d, -23d));
        firstObstaclesCoordination.add(new PointCoordinations(324d, 33d));
        firstObstaclesCoordination.add(new PointCoordinations(500d, 15d));
        firstSpan.setObstaclesCoordinations(firstObstaclesCoordination);

        Span secondSpan = new Span();
        secondSpan.setFirstPylonHeight(450d);
        secondSpan.setSecondPylonHeight(300d);
        secondSpan.setNextPylonDistance(720d);
        secondSpan.setX1(510d);
        secondSpan.setFirstPylonCoordination(45d);
        secondSpan.setSecondPylonCoordination(20d);
        List<PointCoordinations> secondObstaclesCoordination = new ArrayList<PointCoordinations>();
        secondObstaclesCoordination.add(new PointCoordinations(120d, 0d));
        secondObstaclesCoordination.add(new PointCoordinations(385d, 21d));
        secondObstaclesCoordination.add(new PointCoordinations(611d, 0d));
        secondSpan.setObstaclesCoordinations(secondObstaclesCoordination);

        List<Span> list = new ArrayList<Span>();
        list.add(firstSpan);
        list.add(secondSpan);
        return list;
    }
}
