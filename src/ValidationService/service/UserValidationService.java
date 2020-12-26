package ValidationService.service;

import ValidationService.model.User;

public class UserValidationService {

    private static int lengthOfFirstName;
    private static int answerAboutFirstName;
    private static int lengthOfLastName;
    private static int answerAboutLastName;
    private static int answerAboutAge;

    public static String getTrueLengthOfInputFirstName() {
        lengthOfFirstName = User.getFirstName().length();
        if (lengthOfFirstName < 3 || lengthOfFirstName > 15) {
            return UserValidationException.ERROR_OF_FIRST_NAME;
        }
        else{
            return "first name is valid";
        }
    }

    public static String getTrueLengthOfInputLastName() {
        lengthOfLastName = User.getLastName().length();
        if (lengthOfLastName < 3 || lengthOfLastName > 15) {
            return UserValidationException.ERROR_OF_LAST_NAME;
        }
        else{
            return "last name is valid";
        }
    }

    public static String getTrueSizeOfInputAge(int userAge) {
        if (0 >= userAge || userAge>=120) {
            return UserValidationException.ERROR_OF_AGE;
        }
        else{
            return "age is valid";
        }
    }
}
