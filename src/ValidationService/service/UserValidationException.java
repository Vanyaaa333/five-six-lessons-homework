package ValidationService.service;

public class UserValidationException {

    public static void errorsOfInputFirstName(int answerAboutFirstName) {
        if (answerAboutFirstName == 1) {
            System.out.println("Рамзер введенного имени неверен ,а именно меньше 3 или больше 15 букв.Проверьте ввод.");
        }
    }

    public static void errorsOfInputLastName(int answerAboutLastName) {
        if (answerAboutLastName == 1) {
            System.out.println("Рамзер введенной фамилии неверен ,а именно меньше 3 или больше 15 букв.Проверьте ввод.");
        }
    }

    public static void errorsOfInputAge(int answerAboutAge) {
        if (answerAboutAge == 1) {
            System.out.println("Рамзер введенного возраста неверен ,а именно меньше 0 или больше 120.Проверьте ввод.");
        }
    }

}
