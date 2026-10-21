import java.util.Scanner;

public class TiketLoket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nomor tiket: ");
        int nomor = input.nextInt();

        String loket = (nomor == 0)
                ? "Tiket Tidak Valid"
                : (nomor % 2 == 0)
                ? "Loket A"
                : "Loket B";

        System.out.println("Silakan menuju ke: " + loket);

        input.close();
    }
}
