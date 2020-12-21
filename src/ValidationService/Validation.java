package ValidationService;

import ValidationService.model.User;
import ValidationService.service.UserValidationService;
import WorkWithConsole.Input;

public class Validation {

    public static void main(String[] args) {
        String userFirstName = Input.getString("Введите свое имя");
        String userLastName = Input.getString("Введите свою фамилию");
        int userAge = Input.getInt("Введите свой возраст");
        User user = new User(userFirstName , userLastName , userAge);
        UserValidationService.getTrueLengthOfInputFirstName();
        UserValidationService.getTrueLengthOfInputLastName();
        UserValidationService.getTrueSizeOfInputAge(User.getAge());
    }
}
