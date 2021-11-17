package db;

public class ReportBuilder {
    private DataBase db;
    public ReportBuilder(DataBase db) {
        this.db = db;
    }
    public String report(){
        return "Report Builder";
    }
}