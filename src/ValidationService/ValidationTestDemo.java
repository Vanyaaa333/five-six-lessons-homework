package ValidationService;

import ValidationService.tests.UserTest;
import ValidationService.tests.UserValidationServiceTest;
import WorkWithConsole.Input;

public class ValidationTestDemo {

    public static void main(String[] args) {
            String userFirstName = Input.getString("Введите свое имя");
            String userLastName = Input.getString("Введите свою фамилию");
            int userAge = Input.getInt("Введите свой возраст");
            UserTest.isInputCharacteristicReceivedRight(userFirstName, userLastName, userAge);
            UserValidationServiceTest.firstNameTest();
            UserValidationServiceTest.lastNameTest();
            UserValidationServiceTest.ageTest();
    }
}
