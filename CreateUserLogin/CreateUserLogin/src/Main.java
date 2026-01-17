import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            //Doğru kullanıcı ismi ve şifre
            String realUsername = "betul_ekren";
            String realPassword = "291312bE.";

            System.out.print("Enter your username = ");
            String username = input.next();
            System.out.print("Enter your password = ");
            String password = input.next();

            if(username.equals(realUsername)){
                if(password.equals(realPassword)) {
                    System.out.println("Logged in");
                }
                else {
                    String enterPassword = password;
                    System.out.println("Your password is wrong");
                    System.out.println("Dou you want to reset your password? 1-Yes 2-No ");
                    int choose = input.nextInt();
                    if(choose == 1){
                        System.out.println("Your new password shouldn't same with before password and shouldn't wrong.");
                        System.out.print("Enter a new password = ");
                        String newPassword = input.next();
                        while((newPassword.equals(realPassword)) || (newPassword.equals(enterPassword))) {
                        System.out.println("Invalid password");
                        System.out.print("Enter a new password = ");
                        newPassword = input.next();
                   }
                        System.out.println("Password created");
                    }
                    else{
                        System.out.println("Please try again...");
                    }
                }
            }
            else{
                System.out.println("Your username is wrong.Please try again...");
            }

        }

    }
