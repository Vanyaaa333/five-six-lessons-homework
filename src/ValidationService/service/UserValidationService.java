package ValidationService.service;

import ValidationService.model.User;

public class UserValidationService {

    private static int lengthOfFirstName;
    private static int answerAboutFirstName;
    private static int lengthOfLastName;
    private static int answerAboutLastName;
    private static int answerAboutAge;

    public static void getTrueLengthOfInputFirstName() {
        lengthOfFirstName = User.getFirstName().length();
        if (lengthOfFirstName < 3 || lengthOfFirstName > 15) {
            answerAboutFirstName = 1;
            UserValidationException.errorsOfInputFirstName(answerAboutFirstName);
        }
    }

    public static void getTrueLengthOfInputLastName() {
        lengthOfLastName = User.getLastName().length();
        if (lengthOfLastName < 3 || lengthOfLastName > 15) {
            answerAboutLastName = 1;
            UserValidationException.errorsOfInputLastName(answerAboutLastName);
        }
    }

    public static void getTrueSizeOfInputAge(int userAge) {
        if (0 >= userAge || userAge>=120) {
            answerAboutAge = 1;
            UserValidationException.errorsOfInputAge(answerAboutAge);
        }
    }

}
