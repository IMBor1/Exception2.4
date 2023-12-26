import exception.WrongLoginException;
import exception.WrongPasswordException;

public class Person {
    private String login;
    private String password;
    private String confirmPassword;

    public Person(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public static void infoPerson(String login, String password, String confirmPassword) {

        int lengthLogin = login.length();


        if (!login.matches("^[a-zA-Z0-9_]{1,20}$")) {
            throw new WrongLoginException();
        }


        int lengthPassword = password.length();
        if (!password.matches("^[a-zA-Z0-9_]{1,20}$")) {
            throw new WrongPasswordException();
        }

        int lengthConfirmPassword = confirmPassword.length();
        if (!confirmPassword.matches("^[a-zA-Z0-9_]{1,20}$") || !confirmPassword.equals(password)) {
            throw new WrongPasswordException("Не правильно ввели пароль." +
                    " Параметры Password и confirmPassword  не равны");
        }
    }
}