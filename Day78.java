import java.util.Scanner;

public class Day78 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String usernameBenar = "resti";
        String passwordBenar = "12345";

        String username, password;

        do {
            System.out.println("=== LOGIN AKUN ===");

            System.out.print("Masukkan Username: ");
            username = input.nextLine();

            System.out.print("Masukkan Password: ");
            password = input.nextLine();

            if (username.equals(usernameBenar) &&
                password.equals(passwordBenar)) {

                System.out.println("Login berhasil!");

            } else {
                System.out.println("Username atau password salah!");
                System.out.println("Silakan coba lagi.\n");
            }

        } while (!username.equals(usernameBenar) ||
                 !password.equals(passwordBenar));

        input.close();
    }
}
