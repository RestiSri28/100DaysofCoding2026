import java.util.Scanner;

public class MenuMakanan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int pilihan;

        System.out.println("=== MENU MAKANAN ===");
        System.out.println("1. Nasi Goreng (Rp15000)");
        System.out.println("2. Mie Ayam (Rp18000)");
        System.out.println("3. Bakso (Rp12000)");
        System.out.println("4. Sate (Rp16000)");
        System.out.println("5. Ayam Geprek (Rp10000)");

        System.out.print("Pilih nomor menu: ");
        pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih Nasi Goreng");
                System.out.println("Harga: Rp15000");
                break;

            case 2:
                System.out.println("Anda memilih Mie Ayam");
                System.out.println("Harga: Rp18000");
                break;

            case 3:
                System.out.println("Anda memilih Bakso");
                System.out.println("Harga: Rp12000");
                break;

            case 4:
                System.out.println("Anda memilih Sate");
                System.out.println("Harga: Rp16000");
                break;

            case 5:
                System.out.println("Anda memilih Ayam Geprek");
                System.out.println("Harga: Rp10000");
                break;

            default:
                System.out.println("Menu Tidak Tersedia");
        }

        input.close();
    }
}
