package db;

public class Authorization extends Авторизація{

    public Авторизація authorization;

    public String setAuthorization(Авторизація authorization) {
        this.authorization = authorization;
        return "Authorization is set";
    }

    public boolean authorise(БазаДаних db) {
        return authorization.авторизуватися(db);
    }
}