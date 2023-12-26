import exception.WrongLoginException;
import exception.WrongPasswordException;

public class Main {
    public static void main(String[] args) {
        try {
            Person.infoPerson("etw", "138", "138");
        } catch (WrongLoginException e) {
            System.out.println("Не правильно ввели логин." +
                    " Используйте только латинские буквы, цифры и знак подчеркивания");
        } catch (WrongPasswordException e) {
            System.out.println("Не правильно ввели пароль." +
                    " Используйте только латинские буквы, цифры и знак подчеркивания.");
        }


    }


}