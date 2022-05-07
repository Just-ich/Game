import java.util.Scanner;

public class User {


    //Ввод логина пользователем
    public static void loginAndPasswordUser() {
        System.out.println("Придумайте логин");
        Scanner scannerLogin = new Scanner(System.in);
        scannerLogin.nextLine();

        System.out.println("Придумайте пароль");
        Scanner scannerPassword = new Scanner(System.in);
        scannerPassword.nextLine();
    }


    Basket basket=new Basket();

    User user=new User();

}
