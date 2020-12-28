package LoginService.dao;

import LoginService.model.User;

public class UserData {

    private static User[] userData = {
            new User("Ivan", "qwer"),
            new User("worry", "rewq"),
            new User("useful", "yesyes")};

    public static User[] getUser() {
        return userData;
    }

}
