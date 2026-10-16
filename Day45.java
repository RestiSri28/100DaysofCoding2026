import java.util.Scanner;

public class MenuMakanan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int pilihan;

        System.out.println("=== MENU MAKANAN ===");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Ayam");
        System.out.println("3. Bakso");
        System.out.println("4. Soto Ayam");
        System.out.println("5. Ayam Geprek");

        System.out.print("Pilih menu (1-5): ");
        pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih Nasi Goreng");
                break;
            case 2:
                System.out.println("Anda memilih Mie Ayam");
                break;
            case 3:
                System.out.println("Anda memilih Bakso");
                break;
            case 4:
                System.out.println("Anda memilih Soto Ayam");
                break;
            case 5:
                System.out.println("Anda memilih Ayam Geprek");
                break;
            default:
                System.out.println("Pilihan tidak tersedia!");
        }

        input.close();
    }
}
