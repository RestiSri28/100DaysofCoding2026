import java.util.Scanner;

public class KalkulatorBangunDatar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int pilihan;
        double luas;

        System.out.println("PILIH BANGUN DATAR");
        System.out.println("1. Lingkaran");
        System.out.println("2. Persegi");
        System.out.println("3. Segitiga");
        System.out.print("Masukkan pilihan: ");

        pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan jari-jari: ");
                double jariJari = input.nextDouble();

                luas = 3.14 * jariJari * jariJari;

                System.out.println("Lingkaran");
                System.out.printf("%.2f%n", luas);
                break;

            case 2:
                System.out.print("Masukkan panjang sisi: ");
                double sisi = input.nextDouble();

                luas = sisi * sisi;

                System.out.println("Persegi");
                System.out.printf("%.2f%n", luas);
                break;

            case 3:
                System.out.print("Masukkan panjang alas: ");
                double alas = input.nextDouble();

                System.out.print("Masukkan tinggi: ");
                double tinggi = input.nextDouble();

                luas = 0.5 * alas * tinggi;

                System.out.println("Segitiga");
                System.out.printf("%.2f%n", luas);
                break;

            default:
                System.out.println("Pilihan tidak valid");
        }

        input.close();
    }
}
