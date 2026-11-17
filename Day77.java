import java.util.Scanner;

public class Day77 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String teks;

        System.out.print("Masukkan sebuah kalimat: ");
        teks = input.nextLine();

        System.out.println("\n=== HASIL METHOD STRING ===");

        // Menghitung jumlah karakter
        System.out.println("Jumlah karakter: " + teks.length());

        // Mengubah menjadi huruf kapital
        System.out.println("Huruf kapital: " + teks.toUpperCase());

        // Mengubah menjadi huruf kecil
        System.out.println("Huruf kecil: " + teks.toLowerCase());

        // Memeriksa apakah mengandung kata Java
        System.out.println("Mengandung Java: " + teks.contains("Java"));

        // Mengganti kata Java
        System.out.println("Replace: " + teks.replace("Java", "Python"));

        // Menghapus spasi di awal dan akhir
        System.out.println("Trim: " + teks.trim());

        // Mengambil sebagian teks
        if (teks.length() >= 5) {
            System.out.println("Substring: " + teks.substring(0, 5));
        } else {
            System.out.println("Substring: " + teks);
        }

        input.close();
    }
}
