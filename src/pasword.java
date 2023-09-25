import javax.swing.*;
import java.util.Scanner;

public class pasword {

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pass;
        String uname;
        System.out.println("");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\tWelcome in our login system !!!");
        String Username = "abi";
        String password = "abi";
        System.out.println("");

        int maxlog = 6;

        for (int i = 1; i < maxlog; i++) {
                System.out.println("Enter your Username");
                String username = sc.nextLine();

                System.out.println("Enter your Password");
                String Password = sc.nextLine();

                if (Username.equals(username) && Password.equals(password)) {
                        System.out.println("Login Successfully");
                        break;
                } else {
                        System.out.println("Login failed. Invalid password .You used "+i+" out of 5 chances ");
                }}}}