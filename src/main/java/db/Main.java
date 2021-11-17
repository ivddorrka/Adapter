package db;

public class Main {
    public static void main(String[] args) {
        DataBase db = new DataBase();
        String if_set;
        if_set = db.setDabase(db);
        Authorization authorization = new Authorization();
        if (authorization.authorise(db)) {
            ReportBuilder br = new ReportBuilder(db);
            System.out.println(br.report());
        }
    }
}