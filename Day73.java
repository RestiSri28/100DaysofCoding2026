import java.util.Scanner;

public class Day73 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int pilihan;

        do {
            System.out.println("\n=== MENU UTAMA ===");
            System.out.println("1. Tampilkan Pesan");
            System.out.println("2. Tampilkan Biodata");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");

            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Selamat belajar Java!");
                    break;

                case 2:
                    System.out.println("Nama: Resti Sri Astuti");
                    System.out.println("Prodi: Informatika");
                    break;

                case 3:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak tersedia!");
            }

        } while (pilihan != 3);

        input.close();
    }
}
