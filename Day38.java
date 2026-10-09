import java.util.Scanner;

public class TiketBioskop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int pilihan, jumlahTiket;
        int hargaTiket = 0;
        double total, diskon, totalBayar;

        System.out.println("KASIR TIKET BIOSKOP");
        System.out.println("1. Reguler   = Rp40.000");
        System.out.println("2. Sweetbox  = Rp60.000");
        System.out.println("3. VIP       = Rp90.000");

        System.out.print("Pilih kategori tiket (1-3): ");
        pilihan = input.nextInt();

        if (pilihan == 1) {
            hargaTiket = 40000;
        } else if (pilihan == 2) {
            hargaTiket = 60000;
        } else if (pilihan == 3) {
            hargaTiket = 90000;
        } else {
            System.out.println("Kategori tidak tersedia");
            input.close();
            return;
        }

        System.out.print("Masukkan jumlah tiket: ");
        jumlahTiket = input.nextInt();

        total = hargaTiket * jumlahTiket;

        if (total >= 150000) {
            diskon = total * 0.15;
        } else {
            diskon = 0;
        }

        totalBayar = total - diskon;

        System.out.println("\n STRUK PEMBAYARAN ");
        System.out.println("Harga tiket : Rp" + hargaTiket);
        System.out.println("Jumlah tiket: " + jumlahTiket);
        System.out.println("Total       : Rp" + total);
        System.out.println("Diskon 15%  : Rp" + diskon);
        System.out.println("Total bayar : Rp" + totalBayar);

        input.close();
    }
}
