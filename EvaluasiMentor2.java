import java.util.Scanner;

public class PendaftaranMemberGym {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int kategori, durasi;
        int biayaPerBulan = 0;
        String namaKategori = "";
        String bonus = "";

        double total, diskon, totalBayar;

        System.out.println("=== PENDAFTARAN MEMBER GYM ===");
        System.out.println("1. Reguler - Rp150000");
        System.out.println("2. Silver  - Rp300000");
        System.out.println("3. Gold    - Rp500000");

        System.out.print("Pilih kategori (1-3): ");
        kategori = input.nextInt();

        if (kategori == 1) {
            namaKategori = "Reguler";
            biayaPerBulan = 150000;
        } else if (kategori == 2) {
            namaKategori = "Silver";
            biayaPerBulan = 300000;
        } else if (kategori == 3) {
            namaKategori = "Gold";
            biayaPerBulan = 500000;
        } else {
            System.out.println("Kategori tidak tersedia");
            input.close();
            return;
        }

        System.out.print("Durasi (bulan): ");
        durasi = input.nextInt();

        total = biayaPerBulan * durasi;

        if ((kategori == 3 && durasi >= 3) || total >= 1000000) {
            diskon = total * 0.15;
        } else {
            diskon = 0;
        }

        totalBayar = total - diskon;

        if (kategori == 3) {
            if (durasi >= 6) {
                bonus = "Tas Gym Eksklusif";
            } else {
                bonus = "Handuk Sport";
            }
        } else if (kategori == 2) {
            if (durasi >= 4) {
                bonus = "Botol Tumbler";
            } else {
                bonus = "Kaos Kaki Sport";
            }
        } else {
            bonus = "Tidak ada bonus";
        }

        System.out.println("\n===== STRUK PENDAFTARAN =====");
        System.out.println("Kategori: " + namaKategori);
        System.out.println("Biaya Per Bulan: Rp" + biayaPerBulan);
        System.out.println("Durasi: " + durasi + " bulan");
        System.out.println("Total Sebelum Diskon: Rp" + total);
        System.out.println("Diskon: Rp" + diskon);
        System.out.println("Total Pembayaran Akhir: Rp" + totalBayar);
        System.out.println("Bonus Merchandise: " + bonus);

        input.close();
    }
}
