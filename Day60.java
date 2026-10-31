import java.util.Scanner;

public class Day60 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, jumlah = 0;

        System.out.print("Masukkan angka N: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            jumlah = jumlah + i;
        }

        System.out.println("Jumlah angka 1 sampai " + n + " = " + jumlah);

        Input.close();
    }
}
