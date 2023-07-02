package cinema;

import java.util.ArrayList;

public class CinemaApplictaionRun {
    public static void main(String[] args) {
        var viewers = new ArrayList<Viewer>();
        viewers.add(new Viewer("Vasya Pupkin", 19));
        viewers.add(new Viewer("Rock", -1));
        viewers.add(new Viewer("Natali", 39));
        viewers.add(new Viewer("Tom", 81));
        viewers.add(new Viewer("Shelf", 50));

        var statistics = new ViewerStatistics();
        System.out.println(statistics.averageAge(viewers));
    }
}
