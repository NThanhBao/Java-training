package Demo.MVC;

import java.util.Scanner;

public class View {
    public static Scanner scanner = new Scanner(System.in);

    public void showMess(String smg){
        System.out.println(smg);
    }

    public Model getUserInfo(){
        Model user = new Model();
        System.out.print("UserName: ");
        user.setUrn(scanner.next());
        System.out.print("PassWord: ");
        user.setPass(scanner.next());
        return user;
    }
}
