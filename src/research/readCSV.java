package research;

import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.*;

class MarketData {
    String date;
    double close;

    public MarketData(String date, double close) {
        this.date = date;
        this.close = close;
    }

    @Override
    public String toString() {
        return date + " -> " + close;
    }
}

public class readCSV {
    public static List<MarketData> loadCSV(String filePath) {
        List<MarketData> list = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            String[] line;
            reader.readNext(); // skip header
            while ((line = reader.readNext()) != null) {
                list.add(new MarketData(line[0], Double.parseDouble(line[1])));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void main(String[] args) {
        List<MarketData> spx = loadCSV("data/SP_500.csv");
        List<MarketData> vix = loadCSV("data/VIX.csv");

        System.out.println("SPX sample: " + spx.get(0));
        System.out.println("VIX sample: " + vix.get(0));
        System.out.println("Loaded " + spx.size() + " SPX rows and " + vix.size() + " VIX rows.");
    }
}

