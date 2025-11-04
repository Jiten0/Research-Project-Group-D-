package research;

import java.util.List;

import static research.readCSV.loadCSV;

public class main {
    public static void main(String[] args) {
        List<MarketData> spx = loadCSV("data/SP_500.csv");
        List<MarketData> vix = loadCSV("data/VIX.csv");

        System.out.println("SPX sample: " + spx.get(0));

        System.out.println("VIX sample: " + vix.get(0));
        System.out.println("Loaded " + spx.size() + " SPX rows and " + vix.size() + " VIX rows.");
        //analyzer.analyze(spx);
    }
}
