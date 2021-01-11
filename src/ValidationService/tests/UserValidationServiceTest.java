package ValidationService.tests;

import ValidationService.service.UserValidationException;
import ValidationService.service.UserValidationService;

public class UserValidationServiceTest {

    public static void firstNameTest(){
        String actualShortFirstNameResult = UserValidationService.getTrueLengthOfInputFirstName();
        String expectedShortFirstNameResult = UserValidationException.ERROR_OF_FIRST_NAME;
        if(actualShortFirstNameResult.equals(expectedShortFirstNameResult)){
            System.out.println("PASSED First Name Test");
        }
        else{
            System.out.println("FAILED First Name Test");
        }
    }

    public static void lastNameTest(){
        String actualShortFirstNameResult = UserValidationService.getTrueLengthOfInputLastName();
        String expectedShortFirstNameResult = UserValidationException.ERROR_OF_LAST_NAME;
        if(actualShortFirstNameResult.equals(expectedShortFirstNameResult)){
            System.out.println("PASSED Last Name Test");
        }
        else{
            System.out.println("FAILED Last Name Test");
        }
    }

    public static void ageTest(int userAge){
        String actualShortFirstNameResult = UserValidationService.getTrueSizeOfInputAge(userAge);
        String expectedShortFirstNameResult = UserValidationException.ERROR_OF_AGE;
        if(actualShortFirstNameResult.equals(expectedShortFirstNameResult)){
            System.out.println("PASSED Age Test");
        }
        else{
            System.out.println("FAILED Age Test");
        }
    }
}
