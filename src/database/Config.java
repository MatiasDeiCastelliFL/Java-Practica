
package database;

public class Config {
    private final String drive="com.mysql.cj.jdbc.Driver";
    private final String host= "jdbc:mysql://127.0.0.1:3306/practicadao";
    private final String user= "Admin";
    private final String pass = "1234";

    public String getDrive() {
        return drive;
    }

    public String getHost() {
        return host;
    }

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }

}
