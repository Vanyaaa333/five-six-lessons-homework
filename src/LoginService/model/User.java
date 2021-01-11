package LoginService.model;

public class User {

    private  String login;
    private  String password;
    private  int counterOfTry = 3;

    public User(String login ,String password) {
        this.login = login;
        this.password = password;
    }

    public  String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setCounterOfTry(int counterOfTry) {
        this.counterOfTry = counterOfTry;
    }

    public int getCounterOfTry() {
        return counterOfTry;
    }

    public void reduceCounterOfTry() {
        counterOfTry--;
    }

}
