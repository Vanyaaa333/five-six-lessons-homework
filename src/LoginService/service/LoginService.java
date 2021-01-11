package LoginService.service;

import LoginService.model.User;

public class LoginService {

    public static User getUserLogin(User[] userData, String inputLogin, String inputPassword){
        for (int i = 0; i <userData.length; i++) {
            if(userData[i].getLogin().equals(inputLogin)) {
                    return userData[i];
            }
        }
        return null;
    }

    public static boolean getUserPassword(User user , String inputPassword){
        return user.getPassword().equals(inputPassword);
    }

    public static int isAuthenticationRight(User[] userData, String inputLogin,String inputPassword){
        User user = getUserLogin(userData ,inputLogin, inputPassword);
        if (user == null){
                return 2;
            }
        if(user.getCounterOfTry()>0){
            if(getUserPassword(user,inputPassword)){
                user.setCounterOfTry(3);
                return 1;
            }
        else {
            user.reduceCounterOfTry();
            if(user.getCounterOfTry() == 0){
                takeFinalStatus(0);
                return -1;
            }
                return 2;
            }
        }
        return 0;
    }

    public static void getAuthenticationRightStatus(User[] userData, String inputLogin,String inputPassword){
        int status = isAuthenticationRight(userData,inputLogin,inputPassword);
        takeFinalStatus(status);
    }

    public static void takeFinalStatus(int authenticationStatus ){
        if (authenticationStatus == 1) {
            System.out.println("Login is successful");
        } else if(authenticationStatus == 0){
            System.out.println("This account is blocked");
        }else if (authenticationStatus == 2){
            System.out.println("Your login or password are not valid");
        }
    }

}
