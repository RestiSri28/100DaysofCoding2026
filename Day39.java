import java.util.Scanner;

public class KalkulatorIf {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double angka1, angka2, hasil;
        int pilihan;

        System.out.println("KALKULATOR SEDERHANA");
        System.out.println("1. Penjumlahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");

        System.out.print("Pilih operasi (1-4): ");
        pilihan = input.nextInt();

        System.out.print("Masukkan angka pertama: ");
        angka1 = input.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        angka2 = input.nextDouble();

        if (pilihan == 1) {
            hasil = angka1 + angka2;
            System.out.println("Hasil penjumlahan: " + hasil);

        } else if (pilihan == 2) {
            hasil = angka1 - angka2;
            System.out.println("Hasil pengurangan: " + hasil);

        } else if (pilihan == 3) {
            hasil = angka1 * angka2;
            System.out.println("Hasil perkalian: " + hasil);

        } else if (pilihan == 4) {
            if (angka2 != 0) {
                hasil = angka1 / angka2;
                System.out.println("Hasil pembagian: " + hasil);
            } else {
                System.out.println("Error: Tidak bisa membagi dengan nol!");
            }

        } else {
            System.out.println("Pilihan operasi tidak tersedia!");
        }

        input.close();
    }
}
