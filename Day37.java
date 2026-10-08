import java.util.Scanner;

public class CekBilangan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        int bilangan = input.nextInt();

        if (bilangan > 0) {
            System.out.println("Bilangan Positif");
        } else if (bilangan < 0) {
            System.out.println("Bilangan Negatif");
        } else {
            System.out.println("Bilangan Nol");
        }

        input.close();
    }
}
