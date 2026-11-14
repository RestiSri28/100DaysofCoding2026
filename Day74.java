import java.util.Scanner;

public class Day74 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String teks;

        System.out.print("Masukkan sebuah kata atau kalimat: ");
        teks = input.nextLine();

        System.out.println("Jumlah karakter: " + teks.length());
        System.out.println("Huruf kapital: " + teks.toUpperCase());
        System.out.println("Huruf kecil: " + teks.toLowerCase());

        input.close();
    }
}
