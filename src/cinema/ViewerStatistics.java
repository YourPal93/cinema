package cinema;

import java.text.DecimalFormat;
import java.util.List;

public class ViewerStatistics {

    public double averageAge(List<Viewer> viewers) {
        var allAges = 0.0;
        for(var viewer : viewers)
            allAges += viewer.getAge();

        return allAges / viewers.size();
    }
}
