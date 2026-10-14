import java.util.Scanner;

public class KelipatanAngka {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int angka;

        System.out.print("Masukkan sebuah angka: ");
        angka = input.nextInt();

        if (angka % 3 == 0 && angka % 5 == 0) {
            System.out.println("Kelipatan 3 dan 5");
        } else if (angka % 3 == 0) {
            System.out.println("Kelipatan 3");
        } else if (angka % 5 == 0) {
            System.out.println("Kelipatan 5");
        } else {
            System.out.println("Bukan kelipatan 3 maupun 5");
        }

        input.close();
    }
}
