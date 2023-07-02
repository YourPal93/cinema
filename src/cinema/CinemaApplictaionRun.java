package cinema;

import java.util.ArrayList;

public class CinemaApplictaionRun {
    public static void main(String[] args) {
        var viewers = new ArrayList<Viewer>();
        viewers.add(new Viewer("Vasya Pupkin", 19, 9000));
        viewers.add(new Viewer("Rock", -1, 12));
        viewers.add(new Viewer("Natali", 39, 3));
        viewers.add(new Viewer("Tom", 81, 21));
        viewers.add(new Viewer("Shelf", 50, 50));

        var statistics = new ViewerStatistics();
        System.out.println(statistics.averageAge(viewers));
    }
}
