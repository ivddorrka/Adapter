package db;

public class DataBase extends БазаДаних{
    public DataBase db;

    public String setDabase(DataBase db){
        this.db = db;
        return "All Done";
    }

//    public DataBase (БазаДаних db) {
//        this.db = db;
//    }
//
    public String getData() {
        return db.отриматиДаніКористувача();
    }

    public String getStatisticsData() {
        return db.отриматиСтатистичніДані();
    }
}