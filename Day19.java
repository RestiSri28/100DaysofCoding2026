import java.util.Scanner;

public class KonversiManual {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan harga setelah diskon: ");
        double harga = input.nextDouble();

        System.out.print("Masukkan jumlah barang: ");
        long jumlahBarang = input.nextLong();

        System.out.print("Masukkan berat barang: ");
        float berat = input.nextFloat();

        int hargaInt = (int) harga;
        int jumlahInt = (int) jumlahBarang;
        int beratInt = (int) berat;

        System.out.println("\n=== HASIL KONVERSI ===");
        System.out.println("Harga (double) : " + harga);
        System.out.println("Harga (int)    : " + hargaInt);

        System.out.println("Jumlah (long)  : " + jumlahBarang);
        System.out.println("Jumlah (int)   : " + jumlahInt);

        System.out.println("Berat (float)  : " + berat);
        System.out.println("Berat (int)    : " + beratInt);

        input.close();
    }
}
