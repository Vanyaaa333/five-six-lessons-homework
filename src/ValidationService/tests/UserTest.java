package ValidationService.tests;

import ValidationService.model.User;

public class UserTest {

    public static void isInputCharacteristicReceivedRight(String inputFirstName, String inputLastName, int inputAge){
        User user = new User(inputFirstName,inputLastName,inputAge);
        if(inputFirstName.equals(User.getFirstName()) && inputLastName.equals(User.getLastName()) && inputAge == User.getAge()){
            System.out.println("PASSED test of Received Input Characteristic");
        }
        else{
            System.out.println("FAILED test test of Received Input Characteristic");
        }

    }

}
