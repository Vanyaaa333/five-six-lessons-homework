package LoginService;

import LoginService.WorkWithConsole.Input;
import LoginService.dao.UserData;
import LoginService.model.User;
import LoginService.service.LoginService;

public class UserLoginServiceDemo {

    public static void main(String[] args) {
        while (true) {
            String login = Input.getString("Введите логин");
            String password = Input.getString("Введите пароль");
            LoginService.getAuthenticationRightStatus(UserData.getUser(), login, password);
        }
    }
}
