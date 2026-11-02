import java.util.Scanner;

public class NestedLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int baris, kolom;

        System.out.print("Masukkan jumlah baris: ");
        baris = input.nextInt();

        System.out.print("Masukkan jumlah kolom: ");
        kolom = input.nextInt();

        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= kolom; j++) {
                System.out.print((i + j + 1) + " ");
            }
            System.out.println();
        }

        input.close();
    }
}
