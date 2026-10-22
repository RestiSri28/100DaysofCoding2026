import java.util.Scanner;

public class AntreanBurger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input Jumlah Pelanggan: ");
        int jumlah = input.nextInt();

        if (jumlah <= 0) {
            System.out.println("Status: Antrean Kosong");
        } else {
            for (int i = 1; i <= jumlah; i++) {
                System.out.println("Nomor Antrean: " + i);
            }
        }

        input.close();
    }
}
