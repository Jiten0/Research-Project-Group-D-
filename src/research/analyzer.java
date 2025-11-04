package research;

import java.util.ArrayList;
import java.util.List;
import static research.readCSV.loadCSV;

public class analyzer {
    public static void analyze(List<DataRow> data) {
        // Step 1: Compute % change
        for (int i = 1; i < data.size(); i++) {
            DataRow today = data.get(i);
            DataRow yesterday = data.get(i - 1);
            today.spxChange = ((today.spxClose - yesterday.spxClose) / yesterday.spxClose) * 100;
            today.vixChange = ((today.vixClose - yesterday.vixClose) / yesterday.vixClose) * 100;
        }

        // Step 2: Identify Down-Down days
        List<Integer> downDownIndices = new ArrayList<>();
        for (int i = 1; i < data.size(); i++) {
            DataRow row = data.get(i);
            if (row.spxChange < 0 && row.vixChange < 0) {
                downDownIndices.add(i);
            }
        }
    }
}
