package research;

class DataRow {
    String date;
    double spxClose;
    double vixClose;
    double spxChange; // % change
    double vixChange; // % change

    public DataRow(String date, double spxClose, double vixClose) {
        this.date = date;
        this.spxClose = spxClose;
        this.vixClose = vixClose;
        this.spxChange = 0; // initialize
        this.vixChange = 0;
    }
}


