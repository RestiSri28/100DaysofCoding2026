import java.util.Scanner;

public class PenjumlahanPengurangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        int angka1 = input.nextInt();
        int angka2 = input.nextInt();

        // Proses
        int penjumlahan = angka1 + angka2;
        int pengurangan = angka1 - angka2;

        input.close();

        // Output
        System.out.printf("Angka pertama      :\t%d%n", angka1);
        System.out.printf("Angka kedua        :\t%d%n", angka2);
        System.out.printf("Hasil penjumlahan  :\t%d%n", penjumlahan);
        System.out.printf("Hasil pengurangan  :\t%d%n", pengurangan);
    }
}
